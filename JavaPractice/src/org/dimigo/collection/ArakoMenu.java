package org.dimigo.collection;

import java.io.*;

/**
 * Created by sun90 on 2017-06-14.
 */
public class ArakoMenu {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             Writer writer = new BufferedWriter(new FileWriter("JavaPractice/files/menu.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("JavaPractice/files/menu.txt"))) {

            // 키보드로 메뉴를 한 줄씩 입력받아 파일에 저장하기
            String menu;

            while ((menu = br.readLine()) != null) {
                writer.write(menu + "\n");
            }
            // Ctrl+Z 또는 Ctrl+D를 누를 때까지 계속 입력 받기
            // 한 줄씩 입력 : BufferedReader의 readLine() 이용하기

            writer.flush();

            System.out.println("<< 메뉴 출력 >>");
            // 파일에서 한 줄씩 읽어와서 모니터로 출력하기
            while ((menu = reader.readLine()) != null) {
                System.out.println(menu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
