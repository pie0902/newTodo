package com.newmemo.newmemo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoRequestDto {
    private String title;
    private String content;
    private String password;
}
