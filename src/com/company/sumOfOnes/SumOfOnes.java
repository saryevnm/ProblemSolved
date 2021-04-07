package com.company.sumOfOnes;

import java.util.Scanner;

public class SumOfOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder printResult = new StringBuilder();
        System.out.print("Введите количество элементов: ");
        int input = scanner.nextInt();
        printCompute(input,printResult);

    }

    private static void printCompute(int input,StringBuilder printResult) {
        int count = 0;
        int i =1;
        int sum = 0;
        while (count<input){
            if (count==input-1){
                printResult.append(i);
            }else{
                printResult.append(i).append(" + ");
            }
            sum = sum+i;
            count++;
            i = i*10+1;
        }
        System.out.println("Результат: \n"+printResult+"\n"+"Сумма: "+sum);
    }
}
