package com.newmemo.newmemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoResponsDto {
    private Long id;
    private String title;
    private String content;
    public MemoResponsDto(Long id,String title,String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
