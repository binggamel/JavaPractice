package org.dimigo.inheritance;

public class SmartPhoneTest {

    public static void main(String[] args) {
        SmartPhone[] phones1 = {
                new IPhone("iPhone XS","애플",1370000),
                new Galaxy("캘럭시 S10","삼성",1500000)
        };

        for( SmartPhone phone : phones1) {
            System.out.println(phone);
            phone.turnOn();
            phone.pay();

            phone.useSpecialFunction();

            phone.turnOff();

            System.out.println();

        }
    }


}
