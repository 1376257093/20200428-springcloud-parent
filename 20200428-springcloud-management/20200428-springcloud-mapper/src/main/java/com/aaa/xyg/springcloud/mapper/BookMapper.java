package com.aaa.xyg.springcloud.mapper;

import com.aaa.xyg.springcloud.model.Book;
import lombok.Data;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Long bookId);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}