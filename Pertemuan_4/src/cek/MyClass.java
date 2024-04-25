package cek;

public class MyClass {

    static int y;

    public MyClass() {

        y = 10;

    }

    public static void main(String[] args) {

        MyClass obj1 = new MyClass();

        MyClass obj2 = new MyClass();

        System.out.println(obj1.y);

    }

}