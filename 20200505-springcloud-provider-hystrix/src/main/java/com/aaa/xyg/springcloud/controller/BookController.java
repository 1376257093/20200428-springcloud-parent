package com.aaa.xyg.springcloud.controller;

import com.aaa.xyg.springcloud.model.Book;
import com.aaa.xyg.springcloud.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/all")
   /* @HystrixCommand(fallbackMethod = "selectAllFallbacl" )*/
    public List<Book> selectAllBook() throws Exception {
        List<Book> bookList = bookService.selectAll();
        if (bookList.size()>0){
            throw new Exception("故意抛出异常");
        }
        return bookList;
    }
    /*public List<Book> selectAllFallbacl(){
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
        book.setBookId(1000L);
        book.setBookName("测试熔断");
        bookList.add(book);
        return bookList;
    }*/
}
