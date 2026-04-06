package com.bookdepo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookdepo.entity.BookDepo;
import com.bookdepo.entity.BookInfo;
import com.bookdepo.entity.DepoBookResponse;
import com.bookdepo.feign.BookInfoFeignClient;


@Service
public class BookDepoService {

    @Autowired
    private BookInfoFeignClient feignClient;

    public BookDepo getDepoById(int depoId) {
        if (depoId == 101) {
            return new BookDepo(101, "Kolkata");
        } else if (depoId == 102) {
            return new BookDepo(102, "Delhi");
        } else {
            return new BookDepo(depoId, "Mumbai");
        }
    }

    public DepoBookResponse getDepoWithBook(int depoId, int bookId) {
        BookDepo depo = getDepoById(depoId);
        BookInfo bookInfo = feignClient.getBookInfo(bookId);

        return new DepoBookResponse(
                depo.getDepoId(),
                depo.getDepoAddress(),
                bookInfo
        );
    }
}