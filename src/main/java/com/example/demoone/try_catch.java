package com.example.demoone;

import java.util.Scanner;

public class try_catch {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scn.nextLine());

            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception " + ex);
        }
    }
}

//Khối try: Xử lý các phép toán và chuyển đổi dữ liệu từ đầu vào.
//Khối catch: Bắt và xử lý các ngoại lệ liên quan đến lỗi toán học (ArithmeticException) và lỗi định dạng số (NumberFormatException).
//Chương trình này cho thấy cách xử lý các lỗi có thể xảy ra khi đọc dữ liệu từ người dùng và thực hiện các phép toán trong Java.