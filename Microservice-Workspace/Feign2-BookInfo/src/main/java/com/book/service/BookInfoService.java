package com.book.service;
import org.springframework.stereotype.Service;

import com.book.entity.BookInfo;


@Service
public class BookInfoService {

    public BookInfo getBookById(int id) {
        if (id == 1) {
            return new BookInfo(1, "Spring Boot", "Rod Johnson", 550.0);
        } else if (id == 2) {
            return new BookInfo(2, "Microservices", "Martin Fowler", 650.0);
        } else {
            return new BookInfo(id, "Java Basics", "James Gosling", 400.0);
        }
    }
}