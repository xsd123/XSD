package com.example.xsdPro.dao;

import com.example.xsdPro.model.Media;
import com.example.xsdPro.model.MediaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaMapper {
    int countByExample(MediaExample example);

    int deleteByPrimaryKey(Integer mediaId);

    int insert(Media record);

    int insertSelective(Media record);

    List<Media> selectByExample(MediaExample example);

    Media selectByPrimaryKey(Integer mediaId);

    int updateByExampleSelective(@Param("record") Media record, @Param("example") MediaExample example);

    int updateByExample(@Param("record") Media record, @Param("example") MediaExample example);

    int updateByPrimaryKeySelective(Media record);

    int updateByPrimaryKey(Media record);
}