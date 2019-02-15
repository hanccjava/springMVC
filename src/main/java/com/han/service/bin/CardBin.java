package com.han.service.bin;

import com.han.model.po.DepositBin;

/**
 * 卡biN 操作
 * author:hanpeiyi
 * Date:2019/2/15
 * Time:14:46
 */
public interface CardBin {
    /**
     * 根据卡BIN查找卡信息
     *
     * @param bin 卡bin
     * @return DepositBin
     * @throws Exception 异常
     */
    DepositBin findCardInfoByBin(Integer bin) throws Exception;
}
