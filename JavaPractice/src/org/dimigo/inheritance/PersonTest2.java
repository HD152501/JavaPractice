package org.dimigo.inheritance;

/**
 * Created by sun90 on 2017-05-08.
 */
public class PersonTest2 {

    public static void main(String[] args) {

        Person[] p = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for (Person pf : p) {
            greeting(pf);
        }
    }

    private static void greeting(Person p) {
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
}
