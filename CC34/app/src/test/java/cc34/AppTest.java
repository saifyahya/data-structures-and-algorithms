/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC34.app.src.test.java.cc34;

import CC34.app.src.main.java.cc34.FirstOccurrenceWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void  testFirstMostRepeatedWord(){
        String text = "No. Try not. Do or do not. There is no try.";
        String text2="Taco cat ate a taco";
        String text3="In a galaxy far far away";
        Assertions.assertEquals("no" ,FirstOccurrenceWord.firstRepeatedWord(text));
        Assertions.assertEquals("taco",  FirstOccurrenceWord.firstRepeatedWord(text2));
        Assertions.assertEquals("far", FirstOccurrenceWord.firstRepeatedWord(text3));

    }

}
