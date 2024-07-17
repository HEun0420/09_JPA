package com.ohgiraffers.springdatajpa.menu.controller;

import com.ohgiraffers.springdatajpa.menu.dto.MenuDto;
import com.ohgiraffers.springdatajpa.menu.model.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.model.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }

    public MenuDto findMenuByCode(int menuCode) {

        // MenuDto -> 일반클래스
        // Menu -> Entity

        /*
        * findById 메소드는 이미 구현이 되어있다.
        * 반환값은 Optional 타입이고 Optional Type은 NOE 방치하기 위해 다양한 기능을 제공
         */
        Menu menu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        log.info("menu===================={}" , menu);

    return modelMapper.map(menu, MenuDto.class);

    }

    public List<MenuDto> findMenuList() {

        List<Menu> menuList = menuRepository.findAll();
//                menuRepository.findAll(Sort.by("menuPrice")).descending());

        return menuList.stream()
                .map(menu -> modelMapper.map(menu, MenuDto.class))
                .collect(Collectors.toList());



    }
}
