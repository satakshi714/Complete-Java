package com.bookdepo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookdepo.entity.BookDepo;
import com.bookdepo.entity.DepoBookResponse;
import com.bookdepo.service.BookDepoService;

@RestController
public class BookDepoController {

    @Autowired
    private BookDepoService bookDepoService;

    @GetMapping("/depo/{id}")
    public BookDepo getDepo(@PathVariable int id) {
        return bookDepoService.getDepoById(id);
    }

    @GetMapping("/depo-book/{depoId}/{bookId}")
    public DepoBookResponse getDepoBookDetails(@PathVariable int depoId, @PathVariable int bookId) {
        return bookDepoService.getDepoWithBook(depoId, bookId);
    }
}