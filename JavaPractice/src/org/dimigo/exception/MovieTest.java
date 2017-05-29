package org.dimigo.exception;

/**
 * Created by sun90 on 2017-05-29.
 */
public class MovieTest {

    public static void main(String[] args) {
        Movie[] movies = {
                new Movie("에이리언:커버넌트", 15),
                new Movie("가디언즈 오브 갤럭시", 12)
        };

        int age = 13;

        for (Movie m : movies) {
            m.buyTicket(age);
        }
    }
}
