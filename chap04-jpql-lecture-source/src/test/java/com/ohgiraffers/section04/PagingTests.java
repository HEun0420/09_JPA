package com.ohgiraffers.section04;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PagingTests {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    /*
    * JPA는 페이징을 API를 통해 추상화 하여 간단한게 처리할 수 있다.
    *
    * - setFirstResult(int startPosition): 조회를 시작할 위치
    * - setMaxResults(int maxResult) : 조회를 할 데이터의 수
     */

    @Test
    @DisplayName("페이징 APR를 이용한 조회 테스트")
    public void test () {

        //given
        int offset = 0 ;// 조회를 건너띌 행의 수
        int limit = 5; // 한번에 조회할 행의 수

        //when
      String jpql = "select m from menu_section04 m order by m.menuCode desc";

        List<Menu> menuList = entityManager.createQuery(jpql, Menu.class)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();

        //then

        assertNotNull(menuList);
        menuList.forEach(System.out::println);
    }

}
