package com.nextu.dao;

import com.nextu.model.Registers;
import com.nextu.util.MyMapper;

public interface RegistersMapper extends MyMapper<Registers> {
public String selectSexById (String id);
public Registers selectById (String id);
}