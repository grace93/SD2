/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenunittestpractical;

/**
 *
 * @author k00199763
 */
public class EasyMaths {
     private EasyMaths () {}

    /**
     * Checks whether the given integer arrays are equal.
     */
    public static boolean equal(int[] array1, int[] array2) 
    {
        if ((array1 == null) || (array2 == null)) 
{
                throw new IllegalArgumentException("null argument");
        	}

        if (array1.length != array2.length) 
{
            	return false;
        	}

        for (int i = 0; i < array1.length; i++) 
{
            	if (array1 [i] != array2 [i]) 
{
                return false;
            	}
        }

        return true;
    }
    
    
    /**
     * Scalar multiplication of given integer arrays.
     */
    public static int scalarMultiplication(int[]array1, int[]array2) 
    {
        if ((array1 == null) || (array2 == null)) 
{
            throw new IllegalArgumentException("null argument");
        }

        if (array1.length != array2.length) 
{
            throw new IllegalArgumentException(
                    "different size arrays ("
                    + array1.length + ", " + array2.length + ')');
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) 
{
            sum += array1[i] * array2[i];
        }
        return sum;
    }
    
}
