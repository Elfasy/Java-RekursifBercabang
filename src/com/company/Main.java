package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int n = input.nextInt();
        int hasilFibonacci = fibonacci(n);
        System.out.println("nilai fibonacci ke-"+ n +" adalah " + hasilFibonacci);
    }

    private static int fibonacci(int n){
        //tidak efektif untuk pengoperasian angka dg jumlah besar
        if(n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
}
