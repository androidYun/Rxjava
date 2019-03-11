package com.guiyunli.rechargestate;

import android.content.Context;
import android.content.Intent;

import com.guiyunli.rxjava.MainActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author Li Gui Yun
 * @date 2019年02月18日21:11
 * @email guiyun.li@aihuishou.com
 **/
public class QuitRechargeState implements RechargeState {

    @Override
    public void jumpActivity(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    public BigDecimal getArrivalAmount(BigDecimal rechargeAmount, BigDecimal serviceFee, BigDecimal minServiceCharge) {
        return rechargeAmount.subtract(getRechargeFee(rechargeAmount, serviceFee));
    }

    @Override
    public BigDecimal getServiceAmount(BigDecimal rechargeAmount, BigDecimal serviceFee, BigDecimal minServiceCharge) {

        if (getRechargeFee(rechargeAmount, serviceFee).compareTo(minServiceCharge) < 0) {
            return minServiceCharge;
        } else {
            return getRechargeFee(rechargeAmount, serviceFee);
        }
    }

    private BigDecimal getRechargeFee(BigDecimal rechargeAmount, BigDecimal serviceFee) {
        return rechargeAmount.multiply(serviceFee).setScale(2, RoundingMode.HALF_UP);
    }
}
