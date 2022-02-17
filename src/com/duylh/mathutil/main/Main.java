/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylh.mathutil.main;

import com.duylh.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args){
        //test thu ham tinh giai thua chay dung hay khong
        //kiem thu la so sanh giua expect vs actual
        // ta phai tuong tuong xem nguoi dung xai app nhu the nao, ta dun truoc ho
        //ta phai tuong tuong tinh huong ho sai 
        
        //CASE #1: check the getF() with valid argument (n=0..20)
        //n=0->expected =1 0! phai tra ve 1
        long expected = 1;
        long actual =MathUtil.getFactorial(0);
        //so sanh expected vs actual
        System.out.println("Check 0!; expected: " + expected +
                                                "; actual: " + actual);
        //CASE #2:
        //n=6--> expected= 720
        expected=720;
        actual=MathUtil.getFactorial(6);
        System.out.println("Check 6!; expected: " + expected +
                                                "; actual: " + actual);
        //CASE#..1,2,..20! VALID ARGUMENT
        //CASE#x check getF() with valid argument
        
    
    }
}
