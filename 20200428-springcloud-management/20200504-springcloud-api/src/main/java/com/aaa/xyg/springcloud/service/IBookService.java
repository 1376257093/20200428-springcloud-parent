package com.aaa.xyg.springcloud.service;


import com.aaa.xyg.springcloud.fallback.FallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient(value = "book-provider",fallbackFactory = FallbackService.class)
public interface IBookService {
    @RequestMapping("/all")
    List<Book>selectAllBook();
}
