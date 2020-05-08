package com.aaa.xyg.springcloud.controller;


import com.aaa.xyg.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     *
     *      查询所有的图书信息(服务的消费者)
     *      getForObject():中两个参数
     *      第一个参数是String类型
     *          需要远程访问的项目地址
     *          localhost:8081/all
     *      第二个参数Class类型
     *          所要接收的返回值类型
    **/
    @RequestMapping("/bookAll")
    public List<Book> selectAll() {
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}
