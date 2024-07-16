package com.ohgiraffers.section01.manytoone;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "menu_and_category")
@Table(name = "tbl_menu")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class MenuAndCategory {

    @Id
    @Column(name = "menu_code")
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @JoinColumn(name = "category_code")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Category category;

    @Column(name = "orderable_status")
    private String orderableStatus;

    /*
    * @JoinColum
    * - 외래키를 매핑하기 위해 사용되는 이노테이션
    *
    * JoinColumn 이노테이션에서 사용할 수 있는 속성
    * - 'name' : 참조하는 테이블의 칼럼명을 지정한다.
    * - 'referencedColumName' : 참조되는 테이블의 칼럼명을 지정한다.
    * - 'nullable' : 참조하는 테이블의 칼럼에 null 값을 허용할 지 지정한다.
    * - 'unique' : 참조하는 테이블의 컬럼에 유일성 제약조건을 추가할지 지정한다.
    * - 'insertable' : 새로운 엔티티가 저장될 때, 이 참조 컬럼이 SQL Insert에 포함될지 지정한다.
    * - 'updatable' : 엔티티가 업데이트될 때, 이 참조 컬럼이 SQL UPDATE에 포함될지 지정한다.
    * - 'columnDefinition' : 이 참조 컬럼에 대한 SQL DDL을 직접 저장한다.
    * - 'table' : 참조하는 테이블의 이름을 지정한다.
    * - 'foreginKey' : 참조하는 테이블에 생성될 외래 키에 대한 추가 정보를 지정한다.
    *
     */

    /*
    * @ManyToOne
    * - 디테일 연관관계에서 사용되는 이노테이션
    *
    *  ManyToOne 어노테이션에서 사용할 수 있는 속성
    * - 'casecede' : 연관된  엔티티에 대한 영속성 정의를 설정한다.
    * - 'fetch' : 연관된 엔티티를 로딩하는 전략을 설정한다.
    * - 'optional' : 연관된 엔티티가 필수인지 선택인지를 설정한다.
     */
}
