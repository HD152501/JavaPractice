package org.dimigo.oop;

import java.util.Scanner;

/**
 * Created by sun90 on 2017-03-31.
 */
public class Question {

    public static void main(String[] args) {

        String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
        String[] answers = {"빅뱅", "조인성", "응용 프로그래밍"};
        String answer;

        Scanner scanner = new Scanner(System.in);

        int i;
        for (i = 0; i < 3; i++) {
            System.out.println(questions[i]);
            answer = scanner.nextLine();

            if (answers[i].equals(answer)) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다!");
            }
        }

        System.out.println(new StringBuilder("<< 결과 출력 >>"));

        for (i = 0; i < 3; i++) {
            StringBuilder sb = new StringBuilder(questions[i]);
            System.out.println(sb.append(" ").append(answers[i]).append("입니다."));
        }
    }
}
