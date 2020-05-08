package com.aaa.xyg.springcloud.controller;


import com.aaa.xyg.springcloud.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private IBookService iBookService;
    @RequestMapping("/all")
    public List<Book>selectAll(){
        return iBookService.selectAllBook();

    }

}
