package com.example.demo.dao;

import com.example.demo.entity.Area;

import java.util.List;

/**
 * Created by Administrator on 2018/5/22.
 */
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
