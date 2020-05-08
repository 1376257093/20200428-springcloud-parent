package com.aaa.xyg.springcloud.service;

import com.aaa.xyg.springcloud.mapper.BookMapper;
import com.aaa.xyg.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有图书
     * @return
     */
    public List<Book>selectAll(){
        return bookMapper.selectAll();
    }
}
