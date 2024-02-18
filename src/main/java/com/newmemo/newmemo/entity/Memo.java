package com.newmemo.newmemo.entity;


import com.newmemo.newmemo.dto.MemoRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String password;

    public Memo(MemoRequestDto memoRequestDto) {
        this.title = memoRequestDto.getTitle();
        this.content = memoRequestDto.getContent();
        this.password = memoRequestDto.getPassword();
    }
}