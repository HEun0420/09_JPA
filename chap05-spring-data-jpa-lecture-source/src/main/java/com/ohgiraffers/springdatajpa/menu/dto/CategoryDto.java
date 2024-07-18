package com.ohgiraffers.springdatajpa.menu.dto;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CategoryDto {

    private int categoryCode;
    private String categoryName;
    private Integer refCategoryCode;

}