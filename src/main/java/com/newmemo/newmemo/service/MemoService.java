package com.newmemo.newmemo.service;

import com.newmemo.newmemo.dto.MemoRequestDto;
import com.newmemo.newmemo.dto.MemoResponseDto;
import com.newmemo.newmemo.entity.Memo;
import com.newmemo.newmemo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository;

    @Transactional
    public MemoResponseDto createMemo2(MemoRequestDto memoRequestDto) {
        Memo memo = new Memo(memoRequestDto);
        Memo saveMemo = memoRepository.save(memo);
        MemoResponseDto memoResponseDto = new MemoResponseDto(saveMemo);
        return memoResponseDto;
    }

    public MemoResponseDto getMemo(Long id) {
        Memo memo = memoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("없는 아이디 입니다."));
        MemoResponseDto memoResponseDto = new MemoResponseDto(memo);
        return memoResponseDto;
    }
    @Transactional
    public List<MemoResponseDto> getMemos() {
        List<Memo> memos = memoRepository.findAll().stream().toList();
        List<MemoResponseDto> memoResponseDtos = new ArrayList<>();
        for (Memo memo : memos) {
            MemoResponseDto memoResponseDto = new MemoResponseDto(memo); // 변환 과정
            memoResponseDtos.add(memoResponseDto);
        }
        return memoResponseDtos;
    }
    @Transactional
    public Long updateMemo(Long id, MemoRequestDto memoRequestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("없는 아이디 입니다."));
        memo.setTitle(memoRequestDto.getTitle());
        memo.setContent(memoRequestDto.getContent());
        return memo.getId();
    }
    @Transactional
    public void deleteMemo(Long id) {
        memoRepository.deleteById(id);
    }
}
