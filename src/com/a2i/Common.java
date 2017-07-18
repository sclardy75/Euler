package com.a2i;

import static java.lang.Math.abs;

/*******************************************************************************
 *  Copyright (c) 2017, Archarithms, Inc.
 *
 *  Concept developed in: Huntsville, AL
 *  Design developed in:  Huntsville, AL 
 *  Produced in:          Huntsville, AL
 *******************************************************************************/
class Common {
    // return true if value n is a palindrome (reads the same backward or forward)
    static boolean isPalindrome(long n) {
        long rev = 0;
        long num = n;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev == n;
    }

    // return greatest common divisor of m and n
    static long gcd(long m, long n) {
        while (m != 0) {
            long m_old = m;
            m = n % m;
            n = m_old;
        }
        return abs(n);
    }


    // recursive version
    // return greatest common divisor of m ans n
    static long gcd2(long m, long n) {
        if (m == 0) {
            return abs(n);
        } else {
            return gcd2(n % m, m);
        }
    }

}
