package com.newmemo.newmemo.dto;

import com.newmemo.newmemo.entity.Memo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoResponseDto {
    private Long id;
    private String title;
    private String content;
    public MemoResponseDto(Memo memo){
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.content = memo.getContent();
    }
}
