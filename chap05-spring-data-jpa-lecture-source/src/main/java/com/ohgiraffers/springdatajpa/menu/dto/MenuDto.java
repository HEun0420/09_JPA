package com.ohgiraffers.springdatajpa.menu.dto;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MenuDto {

        private int menuCode;

        private String menuName;

        private int menuPrice;

        private int categoryCode;

        private String orderableStatus;

    }


