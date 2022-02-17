package com.linhda.mathutil.main;

import com.linhda.mathutil.core.MathUtil;



public class Main {

    public static void main(String[] args) {
        //test thử coi hàm tính giai thừa chạy đúng hay k??
        //kiểm thử là so sánh actual vs. expected
        //ta fai tưởng tượng xem ng dùng/test case
        //như thế nào
        //ta fai tg tượng các tình huống họ xài
        
        //CASE #1: check the getF() with valid argument (n = 0...20)
        //n = 0 -> expected = 1 0! fai trả về 1 nhu7nki2 vọng
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        //so sánh giữa expected vs actual
        System.out.println("check 0!; expected: " + expected + 
                                     "; actual: " + actual);
        
        //CASE #2:
        //n = 6 -> expected 6! = 720 ms đúng kì vọng
        expected = 720;
        actual = MathUtil.getFactorial(6);
        System.out.println("check 6!; expected: " + expected + 
                                     "; actual: " + actual);
        
        //CASE #.. 1, 2, ... 20! valid argument
        
        //CASE #x check getF() with invalid argument
        //expected = ??? cgi đây khi mình tính -5!
        //hy vọng cả t là thấy dc ngoại lệ, IllegalArgumentException
        //sure -5! fai xuất hiện ngoại lệ
        //nếu getF(-5) mà ném ra ngoại lệ, ta mừng
        System.out.println("Check if an exception is thrown!!");
        MathUtil.getFactorial(-5);
    }
    
}
