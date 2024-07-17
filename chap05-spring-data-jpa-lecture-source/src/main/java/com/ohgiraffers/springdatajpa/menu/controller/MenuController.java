package com.ohgiraffers.springdatajpa.menu.controller;

import com.ohgiraffers.springdatajpa.menu.dto.MenuDto;
import com.ohgiraffers.springdatajpa.menu.model.entity.Menu;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }
    // 메뉴 단일 조회 기능
    @GetMapping("/{menuCode}")
    public String findMenuByMenuCode(@PathVariable("menuCode") int menuCode, Model model) {
        log.info("Menu Code : {}", menuCode);

        MenuDto menu = menuService.findMenuByCode(menuCode);

        model.addAttribute("menu", menu);
        return "menu/detail";

    }

    @GetMapping("/list")
    public String findMenuList(Model model){

        List<MenuDto> menuList = menuService.findMenuList();

        model.addAttribute("menuList",menuList);

        return "menu/list";

    }



}
