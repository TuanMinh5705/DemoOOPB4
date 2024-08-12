package com.example.demoone;

class IllegalArgumentException
{
    public static void main (String[] args)
    {
        // Chuỗi s được đặt là chuỗi rỗng và gọi hàm getLength()
        String s = "";
        try
        {
            System.out.println("Tổng độ dài của chuỗi rỗng là " + getLength(s));
        }
        catch(java.lang.IllegalArgumentException e)
        {
            System.out.println("Ngoại lệ IllegalArgumentException đã được bắt");
        }

        // Chuỗi s được gán một giá trị và gọi hàm getLength()
        s = "GeeksforGeeks";
        try
        {
            System.out.println("Tổng độ dài của chuỗi 'GeeksforGeeks' là " + getLength(s));
        }
        catch(java.lang.IllegalArgumentException e)
        {
            System.out.println("Ngoại lệ IllegalArgumentException đã được bắt");
        }

        // Gán s là null và gọi hàm getLength()
        s = null;
        try
        {
            System.out.println("Tổng độ dài của chuỗi null là " + getLength(s));
        }
        catch(java.lang.IllegalArgumentException e)
        {
            System.out.println("Ngoại lệ IllegalArgumentException đã được bắt");
        }
    }

    // Hàm để trả về độ dài của chuỗi s. Nó ném ra
    // IllegalArgumentException nếu s là null.
    public static int getLength(String s)
    {
        if (s == null)
            throw new java.lang.IllegalArgumentException("Đối số không thể là null");
        return s.length();
    }
}

//    Hàm getLength() được thiết kế để trả về độ dài của một chuỗi, nhưng nếu chuỗi là null, nó sẽ ném ra ngoại lệ IllegalArgumentException.
//    Chương trình in ra 0 và 13 cho các chuỗi hợp lệ, và in ra "IllegalArgumentException caught" khi gặp chuỗi null.
//    Ngoại lệ IllegalArgumentException xảy ra khi một đối số không hợp lệ, chẳng hạn như null, được truyền vào hàm.