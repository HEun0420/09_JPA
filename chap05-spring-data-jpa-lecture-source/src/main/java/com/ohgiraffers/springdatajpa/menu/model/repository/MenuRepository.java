package com.ohgiraffers.springdatajpa.menu.model.repository;

import com.ohgiraffers.springdatajpa.menu.model.entity.Menu;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// EntityManagerFactory, EntityManager, EntityTransaction -> 자동 구현
// JpaRepository <엔티티명, pk타입>
public interface MenuRepository extends JpaRepository<Menu, Integer> {

        List<Menu> findByMenuPriceGreaterThan(Integer menuPrice, Sort menuPrice1);
        List<Menu> findByMenuPriceGreaterThanOrderByMenuPriceDesc(Integer menuPrice);

    // menuPrice랑 같은 금액의 메뉴목록 조회
    List<Menu> findByMenuPriceEquals(Integer menuPrice);

}
