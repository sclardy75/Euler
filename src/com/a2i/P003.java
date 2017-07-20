package com.a2i;

import java.math.BigInteger;

public class P003 {

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?

    public static void main(String[] args) {

        System.out.printf("Largest prime factor of number '%d' is %d %n",
                600_851_475_143L, P003(600_851_475_143L));

    }

    private static int P003(long number) {

        int i;
        long copyOfInput = number;

        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }
            return i;

        }
}