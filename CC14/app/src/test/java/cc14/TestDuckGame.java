package CC14.app.src.test.java.cc14;

import CC14.app.src.main.java.cc14.QueueDuckGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuckGame {

    @Test public void testDuckGame() {
        String [] circle = {"A","B","C","D","E"};
        Assertions.assertEquals("D",QueueDuckGame.DUCKDuckGoose(circle,3));
        Assertions.assertEquals("E",QueueDuckGame.DUCKDuckGoose(circle,1));
    }
}
