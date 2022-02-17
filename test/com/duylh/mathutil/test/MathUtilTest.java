/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylh.mathutil.test;

import com.duylh.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilTest {
    @Test
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected=1;
        long actual= MathUtil.getFactorial(0);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected=720;
        long actual= MathUtil.getFactorial(6);
        
        assertEquals(expected, actual);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    
}
