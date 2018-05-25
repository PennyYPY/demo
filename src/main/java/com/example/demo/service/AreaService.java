package com.example.demo.service;/**
 * Created by Administrator on 2018/5/22.
 */

import com.example.demo.entity.Area;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Mr.Wang
 * @create: 2018-05-22 15:23
 **/
public interface AreaService {
    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
