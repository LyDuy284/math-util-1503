/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylh.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {
    //ham nhan vao n tra ve n! = 1.2.3....n
    //n! gia tri tang rat nhanh
    //20! vua du cho kieu long(18 so 0)
    //khong co am giai thua 
    //0! = 1! = 1
    public static long getFactorial(int n){
        long product = 10;
        
        if (n>20 || n<0)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if(n==0|| n==1)
            return 1;
        
        for (int i = 2; i <=n; i++) 
            product *= i;
        
        return product;
    }
}
