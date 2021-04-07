package com.company.banknotes;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder resultPrint = new StringBuilder("Вы получили ");
    static int count = 0;
    static int progress = 0;
    static int sum = 0;
    static int or = 0;
    static int[][] banknotes = new int[][]{{2, 5000}
            , {0, 2000}
            , {2, 1000}
            , {3, 500}
            , {3, 200}
            , {2, 100}
            , {1, 50}
            , {2, 20}
            , {3, 10}
            , {0, 5}
            , {0, 3}
            , {0, 1}};

    public static void main(String[] args) {

        System.out.print("Введите желаемую сумму: ");
        int input = sc.nextInt();
        check(input);
        print(input);

    }
    private static void print(int input){
        if (progress != input) {
            if (progress == sum) {
                System.out.println("Вы можете снять только " + progress);
            } else {
                System.out.println("Вы можете снять только " + progress + " либо " + or);
            }
        }
    }
    private static void check(int input){
        for (int[] bill : banknotes) {
            sum = sum + (bill[0] * bill[1]);
            while (bill[0] > 0) {
                if (progress + bill[1] <= input) {
                    progress = progress + bill[1];
                    bill[0]--;
                    count++;
                } else if (or > progress + bill[1]) {
                    or = progress + bill[1];
                    break;
                } else if (progress == input) {
                    break;
                } else if (or == 0) {
                    or = progress + bill[1];
                    break;
                } else break;
            }
            if (0 < count) {
                if (bill[1] <= 10) {
                    resultPrint.append("x ").append(bill[1]).append(" ");
                } else {
                    resultPrint.append(count).append(" x ").append(bill[1]).append(" ");
                }
            }
            if (progress == input) {
                System.out.println(resultPrint + " Всего = " + progress);
                break;
            }
            count = 0;
        }
    }

}


/*
                    Pseudocode of atm operation
       Construct a new 'resultPrint' object of StringBuilder.
       count <- 0
       progress <- 0
       sum <- 0
       or <- 0
       banknotes <- [[2, 5000]
            , [0, 2000]
            , [2, 1000]
            , [3, 500]
            , [3, 200]
            , [2, 100]
            , [1, 50]
            , [2, 20]
            , [3, 10]
            , [5, 5]
            , [5, 3]
            , [10, 1]]

       OUTPUT["Введите желаемую сумму: "]
       input <- USERINPUT
       METHOD check
           FOR array of bill <-0 from LEN(banknotes)
                sum <- sum + (first item of bill * second item of bill)
                WHILE first item of bill > 0
                     IF progress + first item of bill <= input
                       THEN
                           progress <- progress + first item of bill
                           substracting first item of bill by 1
                           adding count by 1
                     ELSE IF  or > progress = first element of bill AND progress + first item of bill < sum
                       THEN
                           or <- progress + first item of bill
                           BREAK
                     ELSE IF progress = input
                       THEN
                           BREAK
                     ELSE IF or = 0
                       THEN
                           or <- progress + first itme of bill
                           BREAK
                     ELSE  BREAK

                     ENDIF
               ENDWHILE

               IF 0 < count
                 THEN
                     IF first item of bill <=10
                      THEN
                          resulPrint append["x "].append[first item of bill].append[" "]
                     ELSE
                          resulPrint append[count].append[" x "].append[first item of bill].append[" "]
                     ENDIF
               ENDIF

               IF progress = input
                 THEN
                      OUTPUT [resultPrint + " Всего = " + progress]
                      BREAK
               ENDIF

               count <- 0

           ENDFOR
       ENDMETHOD

       METHOD print
           IF progress != input
              THEN
                  IF progress = sum
                     THEN
                         OUTPUT ["Вы можете снять только " + progress]
                  ELSE
                         OUTPUT ["Вы можете снять только " + progress + " либо " + or]
                  ENDIF
           ENDIF
       ENDMETHOD



       THAT'S ALL:D

 */
