package com.example.demoone;

class ThrowExcep {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[]) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}

//    Ngoại lệ NullPointerException được ném ra trong phương thức fun().
//    Nó được bắt trong phương thức fun() và sau đó được ném lại để phương thức main() xử lý.
//    Chương trình cho thấy cách thức xử lý ngoại lệ trong Java và cách "ném lại" một ngoại lệ để nó có thể được xử lý ở cấp độ cao hơn.