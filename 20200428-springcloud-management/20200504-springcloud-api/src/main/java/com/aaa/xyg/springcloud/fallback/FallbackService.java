package com.aaa.xyg.springcloud.fallback;

import com.aaa.xyg.springcloud.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

import java.util.List;

@Component
public class FallbackService implements FallbackFactory<IBookService> {

    public IBookService create(Throwable throwable) {
        IBookService bookService = new IBookService() {
            public List<Book> selectAllBook() {
                System.out.println("我是熔断 我被调用了");
                return null;
            }
        };
        return bookService;
    }
}
