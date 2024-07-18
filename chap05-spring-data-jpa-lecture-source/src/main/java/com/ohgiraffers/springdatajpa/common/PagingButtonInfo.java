package com.ohgiraffers.springdatajpa.common;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PagingButtonInfo {
    private int currentPage;
    private int startPage;
    private int endPage;
}
