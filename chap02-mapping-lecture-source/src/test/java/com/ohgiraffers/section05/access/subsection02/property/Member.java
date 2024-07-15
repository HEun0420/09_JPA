package com.ohgiraffers.section05.access.subsection02.property;

import jakarta.persistence.*;

@Entity(name = "member_section05_sub02")
@Access(AccessType.PROPERTY)
/*
* 클래스래벨에 @Access(AccessType.PROPERTY)를 선언할 때
* @Id 어노테이션이 필드에 있다면 엔티티를 생성하지 못한다.
 */
public class Member {

    @Column(name="member_no")
    private int memberNo;

    @Column(name= "member_id")
    private String memberID;

    @Column(name= "member_pwd")
    private String memberPwd;

    @Column(name = "nickname")
    private String nickname;

    @Id
    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getNickname() {
        System.out.println("🎇🎇🎇🎇 getNickname() 메소드 확인");
        return nickname+ "님";
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNo=" + memberNo +
                ", memberID='" + memberID + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }


}
