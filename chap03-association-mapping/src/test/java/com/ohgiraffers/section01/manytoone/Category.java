package com.ohgiraffers.section01.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "category")
@Table(name = "tbl_category")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Category {

    @Id
    @Column(name = "category_code")
    private int categoryCode;

    @Column (name="category_name")
    private String categoryName;

    @Column (name = "ref_category_code")
    private int reCategoryCode;

}
