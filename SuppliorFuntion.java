package com.java_8;

import java.util.function.Supplier;

public class SuppliorFuntion {

    public static void main(String[] args) {

        Supplier<String> s = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());
        String a = s.get();
        // System.out.print(a);
        // get capchur code;

        String chaptur = "ABCDEFGHIJKLMNPOQRSTUVWXYZ";

        Supplier<String> s1 = () -> {
            String otp1 = "";
            for (int i = 0; i < 6; i++) {
                otp1 = otp1 + chaptur.charAt((int) (Math.random() * 10));
            }
            return otp1;
        };
        System.out.println("Chapture OTP " + s1.get());
    }
}
