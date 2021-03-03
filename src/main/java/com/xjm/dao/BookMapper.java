package com.xjm.dao;

import com.xjm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Panda
 * @create 2021-03-03 16:24
 */
public interface BookMapper {

    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //根据ID查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询所有书
    List<Books> queryAllBook();

    //根据书名查询书籍
    Books queryBookByName(@Param("bookName") String bookName);
}
