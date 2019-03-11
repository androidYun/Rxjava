package com.guiyunli.rechargestate;

import android.content.Context;

import java.math.BigDecimal;

/**
 * @Author Li Gui Yun
 * @date 2019年02月18日21:06
 * @email guiyun.li@aihuishou.com
 **/
public interface RechargeState {

    void jumpActivity(Context context);

    BigDecimal getArrivalAmount(BigDecimal rechargeAmount,BigDecimal serviceFee,BigDecimal minServiceCharge);

    BigDecimal getServiceAmount(BigDecimal rechargeAmount, BigDecimal serviceFee, BigDecimal minServiceCharge);
}
