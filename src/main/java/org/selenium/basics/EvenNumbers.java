package org.selenium.basics;

public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers " + count);
    }
}
