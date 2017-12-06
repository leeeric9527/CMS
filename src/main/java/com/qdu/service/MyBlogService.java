package com.qdu.service;

import java.util.List;

import com.qdu.pojo.MyBlog;

public interface MyBlogService {

	public MyBlog selectMyBlogById(int blogId);

	public List<MyBlog> selectMyBlogByUserId(String blogAuthor);

	public int insertMyBlog(MyBlog myBlog);

}