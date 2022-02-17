/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhda.mathutil.test;

import com.linhda.mathutil.core.MathUtil;
import static com.linhda.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ADMIN
 */

//biến class chứa code của mình thành 1 member/implemnt
//cái interface Parameterized, tham số hóa, biến data cụ thể
//thành tham số hóa/ đặt tên biến, sau đó nhồi từ từ data vào thso
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //0! = 1
    //1! = 1
    //2! = 2
    //3! = 6
    //dữ liệu để test/test case/ test data
    //0,1       [2]
    //1,2       [2]
    //3,6       [2]
    //4,24      [2]
    //5,120     [2]
    //6,720     [2]
    //        [7][2]
    
    //1. tạo mảng chứa data. Framewoek/toll mà có UniTest xịn
    //có hỗ trợ kết nối file .cs, table trg DB luôn!!!, excel
    //hoặc để trg mảng trg code dc luôn
    
    //hàm này trả về màng 2 chiều, [7][2], kiue63 Obbj dùng Wrapper class
    //Integer, Double, Long, float, character, boolean, short, byte
    @Parameters
    public static Object[] initData() {
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {6, 720},           
                               };
    }
    
    //có dc bộ data rồi, ta trích từng cặp ra và test
    
    @Parameter(value = 0) //gắn biến này vs cột 0
    public int input; //n, ứng vs cột 0     map vào mảng 6!
    
    @Parameter(value = 1)//gắn biến vs cột 1
    public long expected; // ứng cột 1 gtri của n!      720
    
    @Test //trích xuất data dc r, nhồi vào assertEquals()
    public void testFactorialGivenValidArgumentReturnsWell() {
      
        assertEquals(expected, getFactorial(input));
    }
}
