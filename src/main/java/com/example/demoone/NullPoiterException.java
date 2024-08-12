package com.example.demoone;

class NullPoiterException
{
    public static void main (String[] args)
    {
        // Khởi tạo biến chuỗi với giá trị null
        String ptr = null;

        // Kiểm tra nếu ptr là null bằng cách sử dụng try-catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}
//    Khởi Tạo: Biến ptr được gán giá trị null.
//    Kiểm Tra An Toàn: Sử dụng equals để so sánh chuỗi mà không gây ra NullPointerException.
//    Kết Quả: Chương trình sẽ in "Not Same" và không vào vào khối catch.
//    Chương trình này minh họa cách so sánh chuỗi trong Java mà không gặp phải lỗi NullPointerException khi một trong các chuỗi là null.
