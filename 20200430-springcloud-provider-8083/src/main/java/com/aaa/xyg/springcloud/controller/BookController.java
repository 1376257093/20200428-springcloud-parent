package com.aaa.xyg.springcloud.controller;

import com.aaa.xyg.springcloud.model.Book;
import com.aaa.xyg.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    /**
     * 查询所有图书
     * @return
     */
    @RequestMapping("/all")
    private List<Book> selectAllBook() {
        System.out.println("8083");
        return bookService.selectAll();

    }


}
