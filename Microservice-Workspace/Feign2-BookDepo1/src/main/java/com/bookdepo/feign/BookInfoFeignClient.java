package com.bookdepo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookdepo.entity.BookInfo;


@FeignClient(name = "BOOK-INFO-CLIENT", url = "http://localhost:8081")
public interface BookInfoFeignClient {

    @GetMapping("/book/{id}")
    BookInfo getBookInfo(@PathVariable("id") int id);
}