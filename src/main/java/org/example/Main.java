package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Kaç Derece ? : ");
        temp = inp.nextInt();

        if (temp < 5) {
            System.out.print("Kayak Yapabilirsiniz. ");
        } else if (temp >= 5 && temp <= 25) {
            if (temp <= 15) {
                System.out.print("Sinemaya Gidebilirsimiz. ");
            }
            if (temp >= 10) {
                System.out.print("Pikniğe Gidebilirsiniz. ");
            }
        }else {
            System.out.print("Yüzmeye Gidebilirsiniz. ");
        }

    }
}