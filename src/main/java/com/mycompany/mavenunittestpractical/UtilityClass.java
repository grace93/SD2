/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenunittestpractical;

import java.math.BigInteger;

/**
 *
 * @author k00199763
 */
public class UtilityClass {
     public static String concatWords(String...words) 
    {
        int anInt=0;
        StringBuilder buf = new StringBuilder();
        for (String word : words) 
{
            buf.append(word);
        }
        return buf.toString();
    }

  public static String computeFactorial(int number) 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    throws IllegalArgumentException 
  {
        if (number < 1) 
{
            throw new IllegalArgumentException("zero or negative parameter (" + number + ')');
        }

        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= number; i++) 
{
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        return factorial.toString();
    }
    
}
