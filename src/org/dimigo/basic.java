package org.dimigo;

public class basic {
    public static void main(String[] args) {
        String name = "아이유";
        boolean isMale = false;
        int age = 25;
        double height = 161.8;
        float weight = 44.3f;
        char bloodType = 'A';
        String titleSong = "삐삐";

        System.out.printf("<<아이유 프로필>>\n");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("성별 : ");
        System.out.println(isMale ? "남자" : "여자");
//        System.out.println("나이 : %n세\n키 : %fcm\n몸무게 : %lfkg\n혈액형 : %c\n대표곡 : %s",age,height,weight,bloodType,titleSong);
        System.out.println("나이 : "+age+"세");
        System.out.println("키 : "+height+"cm");
        System.out.println("몸무게 : "+weight+"kg");
        System.out.println("혈액형 : "+bloodType+"형");
        System.out.println("대표곡 : "+titleSong);
    }
}
