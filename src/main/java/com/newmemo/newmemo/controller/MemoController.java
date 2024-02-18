package com.newmemo.newmemo.controller;

import com.newmemo.newmemo.dto.MemoRequestDto;
import com.newmemo.newmemo.dto.MemoResponseDto;
import com.newmemo.newmemo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {
    private final MemoService memoService;

    @PostMapping("/memos")
    public MemoResponseDto createMemo2(@RequestBody MemoRequestDto memoRequestDto) {
        return memoService.createMemo2(memoRequestDto);
    }

    @GetMapping("/memos/{id}")
    public MemoResponseDto getMemo(@PathVariable Long id) {
        return memoService.getMemo(id);
    }

    @GetMapping("/memos")
    public List<MemoResponseDto> getMemos() {
        List<MemoResponseDto> memoResponseDtos = memoService.getMemos();
        return memoResponseDtos;
    }
    @PutMapping("/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto memoRequestDto) {
        return memoService.updateMemo(id, memoRequestDto);
    }
    @DeleteMapping("/memos/{id}")
    public void deleteMemo(@PathVariable Long id) {
        memoService.deleteMemo(id);
    }
}
