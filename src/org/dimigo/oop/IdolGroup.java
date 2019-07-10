package org.dimigo.oop;

public class IdolGroup {
    public static void main(String[] args) {
        String[] groupName = {"방탄","보덴소년단","BTS"};

        String[][] memberName = {

                {"김남준","김석진","민윤기","정호석","박지민"},
                {"김태형","전정국","BTS","BT21"},
                {"RM","진","AgustD","BTS"}

        };

        for( int i = 0 ; i < groupName.length ; i ++ ){
            System.out.println("<< "+groupName[i]+" >>");
            for ( int j = 0 ; j < memberName[i].length ; j ++ ){
                System.out.println(memberName[i][j]);

            }
            System.out.println("");
        }

    }

//    private static void printArr(String[][] memberName) {
//        for(String[] arr : memberName){
//            System.out.println();
//            for(String value : arr){
//                System.out.println(value);
//            }
//            System.out.println("");
//        }
    }

