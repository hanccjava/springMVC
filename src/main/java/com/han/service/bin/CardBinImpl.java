package com.han.service.bin;

import com.han.dao.mapper.DepositBinMapper;
import com.han.model.po.DepositBin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 卡bin实现类
 * author:hanpeiyi
 * Date:2019/2/15
 * Time:14:49
 */
@Service
public class CardBinImpl implements CardBin {
    @Resource
    private DepositBinMapper depositBinMapper;
    @Override
    public DepositBin findCardInfoByBin(Integer bin) throws Exception {
        return depositBinMapper.selectByPrimaryKey(bin);
    }
}
