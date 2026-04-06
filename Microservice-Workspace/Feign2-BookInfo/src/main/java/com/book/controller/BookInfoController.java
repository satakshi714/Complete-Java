package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.BookInfo;
import com.book.service.BookInfoService;


@RestController
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;

    @GetMapping("/book/{id}")
    public BookInfo getBookInfo(@PathVariable int id) {
        return bookInfoService.getBookById(id);
    }
}