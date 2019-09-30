package cn.dustdawn.dao;

import cn.dustdawn.entry.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String no);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String no);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}