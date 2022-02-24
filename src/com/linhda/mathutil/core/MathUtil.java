package com.linhda.mathutil.core;
//class này chứa các hàm tiện ích lqan đến toán hc
//dùng cho app tính toán sau này
//tiện ích nghĩa là ai cũng cần dùng-> đồ dùng chung, do đó
//hàm sẽ mang danh nghĩa static

public class MathUtil {
    
    //hàm này nhận vào n và trả về n! = 1.2.3...n
    //n! gtri tăng rất nhanh
    //20! vừa đủ theo kiểu long, 18 số 0
    //k có âm giai thừa
    //0! = 1! = 1
    public static long getFactorial(int n) {
        long product = 10;
        
        if (n > 20 || n < 0) 
            throw new IllegalArgumentException("n must be between 0...20");
        
        if (n == 0 || n == 1) 
            return 1;
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
    
}
