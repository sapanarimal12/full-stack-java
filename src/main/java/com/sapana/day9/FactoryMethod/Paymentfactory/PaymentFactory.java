package com.sapana.day9.FactoryMethod.Paymentfactory;

public class PaymentFactory {

   public static Payment get(PaymentType paymentType){

      switch (paymentType){
         case ESEWA:
            return new EsewaPayment;
            break;
      }
      return null;
   }
}
