package com.ohgiraffers.section02.column;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

/*
 * 컬럼 매핑 시 @Column 어노테이션에 사용 가능한 속성들
 * 1. name : 매핑할 테이블의 컬럼 이름
 * 2. insertable : 엔티티 저장 시 필드 저장 여부 (default : true)
 * 3. updatable : 엔티티 수정 시 필드 수정 여부 (default : true)
 * 4. table : 엔티티와 매핑될 테이블 이름. 하나의 엔티티를 두 개 이상의 테이블에 매핑할 때 사용. (@SecondaryTable 사용)
 * 5. nullable : null값 허용 여부 설정. not null 제약조건에 해당함 (true 기본값)
 * 6. unique : 컬럼의 유일성 제약 조건
 * (두 개 이상 컬럼에 unique 제약조건을 설정하기 위해서는 클래스 레벨에서 @Table의 uniqueConstraints 속성에 설정)
 * 7. columnDefinition : 직접 컬럼의 DDL을 지정
 * 8. length : 문자열 길이. String 타입에서만 사용. (default : 255)
 * */

@Entity(name="member_section02")
@Table(name="tbl_member_section02")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Member {

    /*
     * Entity
     * - 프로젝트 내에 다른 패키지에도 동일한 엔티티가 존재할 경우 식별하기 위한 name 필수지정해야함.
     * - 기본 생성자는 필수 작성
     * - final 클래스, enum, interface, inner class 에서는 사용 할 수 없다.
     * - 저장할 필드에 final을 사용하면 안된다.
     * */


    // PK 가 우선시 되어 컬럼이 생기고, 일반 컬럼은 오름차순으로 생성된다.

    @Id
    @Column(name = "member_no")
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "enroll_date")
    private LocalDate enrollDate;

    @Column(name = "member_role")
    private String memberRole;

    @Column(name = "status")
    private String status;
}