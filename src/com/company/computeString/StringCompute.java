package com.company.computeString;

import java.util.Scanner;

public class StringCompute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String wordInput = scanner.next();
        compute(wordInput);
    }

    private static void compute(String wordInput) {
        if (wordInput.length()%2!=0){
            int middleIndex = wordInput.length()/2;
            System.out.println("Результат: "+wordInput.substring(middleIndex-1,middleIndex+2));
        }else {
            System.out.println("Результат: "+wordInput.substring(0,wordInput.length()-2));
        }
    }
}
