package com.itheima.dao;

import com.itheima.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBookId(@Param("bookID") int id);

    int updateBook(Books books);


    Books queryBookById(@Param("bookID") int id);

    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);



}
