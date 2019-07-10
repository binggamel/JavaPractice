package org.dimigo;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu = 0 ;
//        String[] craft = {"마법사","영주","기사","농민"}
        int blood = 100;
//        String craftname = "";

//        String craftname = "";
//
//        int craftnum = new Random().nextInt(4)+1;
//
//        switch ( craftnum ){
//            case 1:
//                craftname = "마법사";
//                break;
//            case 2:
//                craftname = "영주";
//                break;
//            case 3:
//                craftname = "기사";
//                break;
//            case 4:
//                craftname = "농민";
//                break;
//        }

        String craftname = "";


        do{

            System.out.println("--------------------");

            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");

            System.out.println("--------------------");

            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            if ( menu == 1){



                int craftnum = new Random().nextInt(4)+1;

                switch ( craftnum ){
                    case 1:
                        craftname = "마법사";
                        break;
                    case 2:
                        craftname = "영주";
                        break;
                    case 3:
                        craftname = "기사";
                        break;
                    case 4:
                        craftname = "농민";
                        break;
                }

                System.out.println(craftname+"(으)로 설정되었습니다.");



            } else if ( craftname == "" ){

                System.out.println("먼저 캐릭터를 설정하세요!!");

            } else if ( menu != 1 && menu != 2 && menu != 3 && menu != 9 ){
                System.out.println("없는 메뉴입니다!!");
            }

            else if ( craftname != "" ) {

                switch (menu) {
                    case 2:
                        blood = blood + 10;
                        System.out.print(craftname + " 공격력이 증가되었습니다.");
                        System.out.println(" 현재 공격력 : " + blood);
                        break;
                    case 3:
                        blood = blood - 10;
                        System.out.print(craftname + " 공격력이 감되었습니다.");
                        System.out.println(" 현재 공격력 : " + blood);
                        break;
                    case 9:
                        System.out.println("이제 공부하세요!");
                        break;

                }
            }

//            switch ( menu ){
//                case 1:
//
//
//
//                case 2:
//                    System.out.println(craftname+"공격력이 증가되었습니다. 현재 공격력 : "+(blood + 10) );
//
//                    break;
//                case 9:
//                    System.out.println("이제 공부하세요!!");
//                default:
//                    System.out.println("없는 메뉴입니다!!");




        }while ( menu != 9 );
    }
}
