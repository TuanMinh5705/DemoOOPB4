package com.example.demoone;

// Định nghĩa một ngoại lệ tùy chỉnh MyException
class MyException extends Exception {
    public MyException(String s)
    {
        // Gọi constructor của lớp cha Exception
        super(s);
    }
}

// Một lớp sử dụng ngoại lệ tùy chỉnh MyException
public class MainException {
    // Chương trình chính
    public static void main(String args[])
    {
        try {
            // Ném một đối tượng của ngoại lệ tùy chỉnh
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            // In thông điệp từ đối tượng MyException
            System.out.println(ex.getMessage());
        }
    }
}
