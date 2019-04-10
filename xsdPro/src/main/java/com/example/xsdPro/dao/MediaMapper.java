package com.example.xsdPro.dao;

import com.example.xsdPro.model.Media;
import com.example.xsdPro.model.MediaKey;

public interface MediaMapper {
    int deleteByPrimaryKey(MediaKey key);

    int insert(Media record);

    int insertSelective(Media record);

    Media selectByPrimaryKey(MediaKey key);

    int updateByPrimaryKeySelective(Media record);

    int updateByPrimaryKey(Media record);
}