/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhda.mathutil.test;


import com.linhda.mathutil.core.MathUtil;
import java.sql.SQLException;
import org.junit.Test;//JUnit 4
import static org.junit.Assert.*;
//junit là bộ thư viện test code java
//phía sau là tên class
//JUnit 5 Maven
//download netbean 12
/**
 *
 * @author ADMIN
 */

public class MathUtilTest {
    
    //các hàm để test các class bên code chính sẽ đặt ở đây
    //k đặt trg main nữa
    //tách riêng code để test và code chính ra 2 nơi
    
    //test case #2: check getF() with valid argument
    //n = 6 (6!), expected = 720, actual = ? đoán xem!!! 
    @Test // annotation, toàn bộ thư viện quy ước phải biết điều này
    //máy ảo JVM biết phải lm gì? -> biến hàm dưói thành main()
    public void testFactorialGivenValidArgumentReturnsWell() {
        
        long expected = 720;//hy vọng 6!= 720
        long actual = MathUtil.getFactorial(6);
        
        assertEquals(expected, actual);
    }

    //case #3: ngoại lệ thì test làm s??
    //ngoại lệ k ohai3 gtri để so sánh!!
    //mó k chỉ có ở hình dạng là: mà xh value
    //k thể xài hàm assrtEquasl(cần value để so sánh)
    //nếu ta đưa vào n = -5 thì ta sẽ nhận về ngoại lệ
    //thiết kế đúng, đưa âm, vượt qua 20 -> Exception 
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenInvalidArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    //chạy như thiết kế thì phải là màu xanh cho dù có Excep
    //nh Excep dc phép xh
}
