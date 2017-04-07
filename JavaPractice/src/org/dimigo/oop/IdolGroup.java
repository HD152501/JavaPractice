package org.dimigo.oop;

/**
 * Created by sun90 on 2017-04-07.
 */
public class IdolGroup {

    public static void main(String[] args) {

        String[] groupName = {"트와이스", "레드벨벳", "여자친구"};

        String[][] memberName = {
                {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"},
                {"웬디", "아이린", "슬기", "조이", "예리"},
                {"소원", "예린", "은하", "유주", "신비", "엄지"},
        };

        for (int i = 0; i < memberName.length; i++) {
            System.out.println("<< " + groupName[i] + " >>");
            for (int j = 0; j < memberName[i].length; j++) {
                System.out.println(memberName[i][j]);
            }
            System.out.println();
        }

    }
}
