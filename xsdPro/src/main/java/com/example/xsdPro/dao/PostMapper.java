package com.example.xsdPro.dao;

import com.example.xsdPro.model.Post;
import com.example.xsdPro.model.PostKey;

public interface PostMapper {
    int deleteByPrimaryKey(PostKey key);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(PostKey key);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}