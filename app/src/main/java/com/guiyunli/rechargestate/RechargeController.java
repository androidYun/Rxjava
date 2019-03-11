package com.guiyunli.rechargestate;

import android.content.Context;

import java.math.BigDecimal;

/**
 * @Author Li Gui Yun
 * @date 2019年02月18日21:21
 * @email guiyun.li@aihuishou.com
 **/
public class RechargeController   {



    private RechargeState rechargeState;

    public void setQuitRecharge() {
        rechargeState = new QuitRechargeState();
    }

    public void setTransferRecharge() {
        rechargeState = new TransferRechargeState();
    }


    public void jumpActivity(Context context) {
        if(rechargeState==null){
            new Throwable("please set state");
        }
        rechargeState.jumpActivity(context);
    }


    public BigDecimal calculateArrivalAmount(BigDecimal rechargeAmount, BigDecimal serviceFee, BigDecimal minServiceCharge) {
        if(rechargeState==null){
            new Throwable("please set state");
        }
        return rechargeState.getArrivalAmount(rechargeAmount, serviceFee, minServiceCharge);
    }


    public BigDecimal calculateServiceAmount(BigDecimal rechargeAmount, BigDecimal serviceFee, BigDecimal minServiceCharge) {
        if(rechargeState==null){
            new Throwable("please set state");
        }
        return rechargeState.getServiceAmount(rechargeAmount, serviceFee, minServiceCharge);
    }
}
