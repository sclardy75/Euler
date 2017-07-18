package com.a2i;

import java.util.Arrays;
import java.util.stream.IntStream;

/*******************************************************************************
 *  Copyright (c) 2017, Archarithms, Inc.
 *
 *  Concept developed in: Huntsville, AL
 *  Design developed in:  Huntsville, AL
 *  Produced in:          Huntsville, AL
 *******************************************************************************/

class P001 {

    public static void main(String[] args) {
        System.out.println("1001 th prime = " + Primes.nthPrime(1001));

        boolean[] primes = Primes.getPrimes(25);
        System.out.println(Arrays.toString(primes));

        System.out.println("is 13 prime = " + primes[13]);

        System.out.println("isPalindrome(1234321 = " + Common.isPalindrome(1234321));
        System.out.println("isPalindrome(1244321 = " + Common.isPalindrome(1244321));

        System.out.println("gcd(144, 72) == gcd(144, 72) = " + (Common.gcd(144, 72) == Common.gcd2(144, 72)));
        System.out.println("gcd(15200, 123400) == gcd(144, 72) = " + (Common.gcd(15200, 123400) == Common.gcd2(144, 72)));

        System.out.println("gcd(144, 72) =" + Common.gcd(144, 72));

        System.out.println("euler 1 test case solve = " + solve(10));
        System.out.println("euler 1 solve = " + solve(1000));
        System.out.println("euler 1 solveStream = " + solveStream(1000));
        System.out.println("euler 1 solveStream2 = " + solveStream2(1000));

        System.out.println("prime factors of 1234568 = " + Primes.primeFactors(1234568));


    }

    private static Integer solve(Integer n) {

        Integer sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static Integer solveStream(Integer n) {

        Integer res = IntStream
                .range(3, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();

        return res;
    }

    private static Integer solveStream2(Integer n) {

        return IntStream.range(3, 1000).filter(i -> i % 3 == 0 || i % 5 == 0).sum();

    }

}
