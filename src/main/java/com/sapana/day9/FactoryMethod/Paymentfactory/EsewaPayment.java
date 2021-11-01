package com.sapana.day9.FactoryMethod.Paymentfactory;

import com.sapana.day9.FactoryMethod.request.PaymentRequest;

public class EsewaPayment extends Payment{

    public EsewaPayment(PaymentRequest paymentRequest) {
        super(paymentRequest);
    }

    @Override
    public Object pay() {
        //Esewa hits
        return "Payed amount:"+paymentRequest.getAmount()+ "successful for the product" +paymentRequest.getProduct();
    }
}
