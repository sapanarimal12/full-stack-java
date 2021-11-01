package com.sapana.day9.FactoryMethod;

import com.sapana.day9.FactoryMethod.Paymentfactory.Payment;
import com.sapana.day9.FactoryMethod.Paymentfactory.PaymentFactory;
import com.sapana.day9.FactoryMethod.Paymentfactory.PaymentType;
import com.sapana.day9.FactoryMethod.request.PaymentRequest;

public class FactoryMain {

    public static void main(String[] args) {
        String operator =args[0];
        Double operand1=Double.parseDouble(args[1]);
        Double operand2=Double.parseDouble(args[2]);

        if(args[0]!=null){
            operator=args[0];
        }
        MathCommand mathCommand =MathCommandfactory.get(operator);

        System.out.println(mathCommand.calculate(operand1,operand2));

        Payment payment= PaymentFactory.get(PaymentType.ESEWA);
        payment.initializeRequest(new PaymentRequest("DairyMilk",70D));
        System.out.println(payment.pay());
    }

}
