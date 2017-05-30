package org.dimigo.exception;

/**
 * Created by sun90 on 2017-05-29.
 */
public class Movie {

    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        this.limitAge = limitAge;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void buyTicket(int age) {
        try {
            if (age < limitAge) {
                throw new Exception();
            } else {
                System.out.println(title + " 즐감하세요.");
            }
        } catch (Exception e) {
            System.out.println(title + "은(는) " + limitAge + "세 이상 관람가입니다.");
        }
    }
}
