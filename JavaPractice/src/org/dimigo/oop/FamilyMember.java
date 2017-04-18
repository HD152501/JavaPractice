package org.dimigo.oop;

/**
 * Created by sun90 on 2017-04-18.
 */
public class FamilyMember {

    private static int memberCnt;
    private String memberName;

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        memberCnt++;
    }

    public String getMemberName() {
        return memberName;
    }

    public static void printMemberCnt() {
        System.out.print(memberCnt);
    }
}
