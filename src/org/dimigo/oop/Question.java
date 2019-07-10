package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        String[] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };



        String[] answers = {
                "J-HOPE",
                "정해인",
                "자료구조"
        };



        Scanner scanner = new Scanner(System.in);

        int menu = 0 ;


        do {
            System.out.println("------------------");

            System.out.println("1.질문 선택");
            System.out.println("2.정답 공개");
            System.out.println("9.프로그램 종료");

            System.out.println("------------------");

            System.out.print("메뉴 선택 =>");
            menu = scanner.nextInt();

            if( menu == 1 ){
                int craftnum = new Random().nextInt(3);

                System.out.println(questions[craftnum]);
                String answer = scanner.next();

                if (answer.equals(answers[craftnum])){
                    System.out.println("정답입니다!");
                }else{
                    System.out.println("틀렸습니다!");
                }


            }

            else if( menu == 2 ){
                System.out.println("<< 정답 출력 >>");
                StringBuilder sb = new StringBuilder();
                for( int i = 0 ; i < 3; i ++ ){
                    sb.append(questions[i]).append(" ");
                    sb.append(answers[i]);
                    sb.append("입니다.\n");

                }
                System.out.println(sb);
            }

            else if ( menu != 1 && menu != 2 && menu != 9 ){
                System.out.println("없는 메뉴입니다.");
            }


        }while ( menu != 9);


        System.out.println("Bye~");


    }
}
