package CC12.lib.src.test.java.cc12;

import CC12.lib.src.main.java.cc12.Animal;
import CC12.lib.src.main.java.cc12.AnimalShelter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalShelterTest {
    @Test void testEnqueue(){    //test can insert only cats and dogs ensuring FIFO
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Animal("Cat","c"));
        shelter.enqueue(new Animal("dog","d"));
        shelter.enqueue(new Animal("lion","l"));
        Assertions.assertEquals(2,shelter.getLength());
        Assertions.assertEquals("Cat",shelter.getFront().getData());
        Assertions.assertEquals("dog",shelter.getBack().getData());
    }
    @Test void testDequeue(){    //test can remove cats and dogs ensuring FIFO
        AnimalShelter shelter = new AnimalShelter();
        Animal cat = new Animal("cat","c");
        shelter.enqueue(cat);
        shelter.enqueue(new Animal("dog","d"));
        shelter.dequeue("Cat");
        Assertions.assertEquals("dog",shelter.getFront().getData());
        shelter.dequeue("dog");
        Assertions.assertEquals(0,shelter.getLength());
    }

}
