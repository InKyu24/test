package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MemberDTO {
    private Long id;
    private String name;
    private int age;
}
