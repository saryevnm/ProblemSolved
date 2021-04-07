package com.company.salary;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input salary: ");
        int salary = scanner.nextInt();
        printAllBonuses(salary);
    }

    private static void printAllBonuses(int salary) {
       double result = (((double)salary/2)*0.05)+((salary*0.3)*0.08)+((salary*0.2)*0.1);
        System.out.println((int)result);
    }
}
