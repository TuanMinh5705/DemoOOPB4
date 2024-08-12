package com.example.demoone;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    // Phương thức tạo mảng ngẫu nhiên
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100); // Tạo số ngẫu nhiên từ 0 đến 99
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Xuống dòng sau khi in mảng
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();

        // Kiểm tra chỉ số và hiển thị giá trị phần tử
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        } finally {
            scanner.close(); // Đảm bảo Scanner được đóng sau khi sử dụng
        }
    }
}
