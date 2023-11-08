/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC31.app.src.test.java.cc31;

import CC31.app.src.main.java.cc31.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test
    void testFirstRepeatedWord(){
    String text1 = "Once upon a time, there was a brave princess who...";
    String text2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness";
    String text3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

    Assertions.assertEquals("a", App.firstRepeatedWord(text1));
    Assertions.assertEquals("it", App.firstRepeatedWord(text2));
    Assertions.assertEquals("summer", App.firstRepeatedWord(text3));

}
}
