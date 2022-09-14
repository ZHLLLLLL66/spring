package com.zhllllll.spring.bean;

import java.util.List;

public class BookStore {
    private List<String> bookList;

    @Override
    public String toString() {
        return "BookStore{" +
                "bookList=" + bookList +
                '}';
    }

    //    无参构造器，如果你没有其他的构造器，该无参构造器可以不写
//    但是你有其他的构造器，则必须显示的定义一下无参构造器
    public BookStore(List<String> bookList) {
        this.bookList = bookList;
    }

    public BookStore() {
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

}
