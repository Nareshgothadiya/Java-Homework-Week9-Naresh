package javahomeworkweek9;

//Write a Java program to reverse an array of integer values.

import java.util.Scanner;

public class Programme3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println(" ");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the Element in Array : " + (i + 1));
            a[i] = sc.nextInt();
        }
        for (int i = (a.length - 1); i < a.length; i--) {
            if (i > 0) {
                System.out.println(a[i] + ",");

            } else {
                System.out.println(a[i]);
            }
            if (i == 0) break;
            sc.close();
        }
    }
}