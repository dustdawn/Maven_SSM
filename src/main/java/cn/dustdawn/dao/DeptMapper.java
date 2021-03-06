package cn.dustdawn.dao;

import cn.dustdawn.entry.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(String dno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(String dno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}