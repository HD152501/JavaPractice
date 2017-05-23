/**
 *
 */
package org.dimigo.abstractclass;

/**
 * Created by sun90 on 2017-05-17.
 */
public class SmartPhoneTest {

    public static void main(String[] args) {

        SmartPhone[] sp = {
                new IPhone("iPhone 7", "애플", 900000),
                new Galaxy("갤럭시 S8", "삼성", 800000)
        };

        for (SmartPhone sps : sp) {
            System.out.println(sps);
            sps.turnOn();
            sps.pay();
            sps.useSpecialFunction();
            sps.turnOff();
            System.out.println();
        }
    }
}
