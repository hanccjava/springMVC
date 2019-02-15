package com.han.dao.mapper;

import com.han.model.po.DepositBin;

public interface DepositBinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepositBin record);

    int insertSelective(DepositBin record);

    DepositBin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DepositBin record);

    int updateByPrimaryKey(DepositBin record);
}