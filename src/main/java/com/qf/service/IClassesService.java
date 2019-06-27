package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassesService {

    public List<Classes> queryAll();
    public Classes queryById(Integer cid);
}
