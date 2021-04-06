package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int array1 [] = array1(sc);
        int array2 [] = array2(sc);
        int array3 [] = array3(array1,array2);
        display(array3);
    }
    public static int[] array1(Scanner sc) {
        int[] array1 = new int[5];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
            i++;
        }
        return array1;
    }
        public static int[] array2(Scanner sc){
        int [] array2 = new int[5];
        int i = 0;
        while (i < array2.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
            i++;
        }
        return array2;
    }
    public static int[] array3(int [] array1, int [] array2){
        int array3 [] = new int[array1.length + array2.length-1];
        for (int i = 0; i < array1.length ; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0 ; j < array2.length ; j++) {
            array3[array1.length-1+j] = array2[j];
        }
        return array3;
    }
    public static void display(int [] array3){
        for( int a : array3){
            System.out.println("newArray : " + a);
        }
    }

}
