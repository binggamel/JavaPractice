package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {



        FamilyMember[] Fam = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };

        FamilyMember.printMemberCnt();

        PiggyBank.putMoney(10000,Fam[0]);
        PiggyBank.putMoney(5000,Fam[1]);
        PiggyBank.putMoney(2000,Fam[2]);
        PiggyBank.putMoney(1000,Fam[3]);

        PiggyBank.printBalance();

        PiggyBank.putMoney(1000,Fam[2]);

        PiggyBank.printBalance();









    }
}
