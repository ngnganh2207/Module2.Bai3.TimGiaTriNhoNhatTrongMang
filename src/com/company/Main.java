package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Row");
        int row= sc.nextInt();
        System.out.println("Enter Column");
        int column= sc.nextInt();
        int arr[][]= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter "+i+ ","+j+"value");
                arr[i][j]=sc.nextInt();
            }
        }
        int min= arr[0][0];
        row=0;
        column=0;
        for (int i = 0; i < arr.length; i++){
            for (int j =0 ; j <arr[0].length; j++){
                if (arr[i][j] < min ) {
                    min = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Min number is: " +min+ " at row "+row+", column "+column);

        
    }
}
