package com.xjm.service;

import com.xjm.pojo.Books;

import java.util.List;

/**
 * @author Panda
 * @create 2021-03-03 16:42
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //根据ID查询一本书
    Books queryBookById(int id);

    //查询所有书
    List<Books> queryAllBook();

    //根据书名查询书籍
    Books queryBookByName(String bookName);
}
