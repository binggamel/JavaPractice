package org.dimigo.oop;

class FamilyMember {
    private static int memberCnt ;
    private String memberName;

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        memberCnt ++;
    }

    public String getMemberName() {
        return memberName;
    }

    public static void printMemberCnt(){

        System.out.println("가족 총 인원 수 : " + memberCnt + "명");
        return;

    }
}
