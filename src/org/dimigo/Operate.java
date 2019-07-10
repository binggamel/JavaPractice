package org.dimigo;

public class Operate {
    public static void main(String[] args) {
        System.out.println("<< 디미벅스 연간 인건비 >>\n");
        long a = 1700000L;
        int b = 3;
        int c = 1500;

        long K = a*12*b*c;

        System.out.printf("월 평균 급여 : %,d원\n",a);
        System.out.printf("점포 내 직원 수 : %d명\n",b);
        System.out.printf("점포 수 : %,d개\n",c);

        System.out.printf("\n연간 인건비 : %,d원",K);

    }
}
