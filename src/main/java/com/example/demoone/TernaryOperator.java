package com.example.demoone;

class TernaryOperator
{
    public static void main (String[] args)
    {
        // Khởi tạo biến chuỗi với giá trị null
        String str = null;
        // Sử dụng toán tử ba ngôi để gán giá trị cho biến message
        String message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);

        // Khởi tạo biến chuỗi với giá trị không phải null
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
}
//    Toán Tử Ba Ngôi: Được sử dụng để chọn giá trị cho message dựa trên điều kiện.
//    Kết Quả:
//    Khi str là null, message là chuỗi rỗng ("").
//    Khi str là "Geeksforgeeks", message là "Geeks".
//    Chương trình này minh họa cách sử dụng toán tử ba ngôi trong Java để xử lý các trường hợp có thể có giá trị null và các chuỗi hợp lệ.






