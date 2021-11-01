package com.sapana.day9.FactoryMethod.Paymentfactory;

import com.sapana.day9.FactoryMethod.request.PaymentRequest;

public abstract class Payment {

    protected PaymentRequest paymentRequest;


    public void initializeRequest(PaymentRequest paymentRequest){
        this.paymentRequest=paymentRequest;
    }

    public Boolean validate() {
        //amount 0.0
        if (paymentRequest.getAmount() != null){
            int ValueSign =paymentRequest.getAmount().compareTo(0.0D);

            if(ValueSign==1){
                return true;
            }
            return false;

        }
        return true;

    }



    public  abstract Object pay();

}
