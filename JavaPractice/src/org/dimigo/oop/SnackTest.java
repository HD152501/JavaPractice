package org.dimigo.oop;

/**
 * Created by sun90 on 2017-04-06.
 */
public class SnackTest {

    public static void main(String[] args) {

        Snack[] snack = {
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)
        };

        int sum = 0;

        for (Snack v : snack) {
            System.out.println(v);
            sum += v.calcPrice();
        }

        System.out.println(String.format("%,d", sum) + "원");
    }
}
