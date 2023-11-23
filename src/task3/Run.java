package task3;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Printable[] printables = new Printable[10];
        for (int i = 0; i < 10; i++) {
            if (i<5){
                printables[i] = new Magazine("magazine_"+i);
            } else {
                printables[i] = new Book("book_"+i);
            }
        }

        printables[1].print();

        printMag(printables);
        printBook(printables);


    }

    public static void test() {
        System.out.println(":");
    }

    public static void test(String a) {
        System.out.println(":"+a);
    }
    public static void test(String a, String b) {
        System.out.println(":"+a+b);

    }

    public static void printMag(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine){
                p.print();
            }
        }
    }
    public static void printBook(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book){
                p.print();
            }
        }
    }
}
