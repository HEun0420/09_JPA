package com.ohgiraffers.section05.access.subsection01.field;


import jakarta.persistence.*;
import lombok.*;

/*
 * @Entity 어노테이션은 JPA에서 사용되는 엔티티 클래스임을 표시한다.
 * 이 어노테이션을 사용하면 해당 클래스가 데이터베이스의 테이블과 매핑된다.
 * @Entity 어노테이션은 클래스 선언 위에 위치해야 한다.
 * 또한, `name` 속성을 사용하여 엔티티 클래스와 매핑될 테이블의 이름을 지정할 수 있다.
 * 생략하면 자동으로 클래스 이름을 엔티티 명으로 사용한다.
 */

/*
* 필드 접근에 기본값이므로 설정을 제거해도 동일하게 작동된다.
* 클래스에도 적용을 시키고, 필드에도 적용을 시키면, 필드에 적용시킨 내용이 우선적으로 적용이된다.
 */

@Entity(name="member_section05_sub01")  // section02를 하기 위해 잠시 주석처리
@Table(name="tbl_member_section05_sub01")
@NoArgsConstructor
@AllArgsConstructor
@Access(AccessType.FIELD) // 모든 필드에 대해서 필드 직접 접근 방식을 사용
@Setter
@ToString
public class Member {


    // PK 가 우선시 되어 컬럼이 생기고, 일반 컬럼은 오름차순으로 생성된다.
    @Id
    @Column(name = "member_no")
    @Access(AccessType.FIELD)
    private int memberNo;

    @Column(name ="member_id")
    @Access(AccessType.FIELD)
    private String memberId;

    @Column(name ="member_pwd")
    @Access(AccessType.FIELD)
    private String memberPwd;

    @Column(name ="nickname")
    @Access(AccessType.FIELD)
    private String nickname;

}
