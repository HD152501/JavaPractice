package org.dimigo.oop;

/**
 * Created by sun90 on 2017-04-18.
 */
public class PiggyBankTest {

    public static void main(String[] args) {

        FamilyMember[] fams = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };

        System.out.print("가족 총 인원 수 : ");
        FamilyMember.printMemberCnt();
        System.out.println("명");

        PiggyBank.putMoney(fams[0], 10000);
        PiggyBank.putMoney(fams[1], 5000);
        PiggyBank.putMoney(fams[2], 2000);
        PiggyBank.putMoney(fams[3], 1000);

        PiggyBank.printBalance();

        PiggyBank.putMoney(fams[2], 1000);

        PiggyBank.printBalance();
    }
}
