package coba;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(Factorial(number));
    }

    static java.math.BigInteger Factorial(int number){
        java.math.BigInteger result = new java.math.BigInteger("1");
        for (int i = 1; i<=number;i++){
            result = result.multiply(java.math.BigInteger.valueOf(i));
        }
        return result;
    }
}


