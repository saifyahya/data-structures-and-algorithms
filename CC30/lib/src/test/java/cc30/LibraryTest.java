/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC30.lib.src.test.java.cc30;

import CC30.lib.src.main.java.cc30.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;



class LibraryTest {
    @Test
    public void testSetMap(){
HashMap<Integer,String> students = new HashMap<>(5);
students.set(1,"saif");
        students.set(2,"ali");
        students.set(3,"mohammed");
        List<Integer> keys = new ArrayList<>();
        keys.add(1);
        keys.add(2);
        keys.add(3);
        Assertions.assertEquals(keys,students.keys());

    }
    @Test
    public void testGetMap(){
        HashMap<Integer,String> students = new HashMap<>(5);
        students.set(1,"saif");
        students.set(2,"ali");
        students.set(3,"mohammed");
        Assertions.assertTrue(students.get(2).equals("ali"));

    }
    @Test
    public void testUniqueMap(){
        HashMap<Integer,String> students = new HashMap<>(5);
        students.set(1,"saif");
        students.set(2,"ali");
        students.set(1,"mohammed");
        Assertions.assertTrue(students.get(1).equals("mohammed"));
    }
    @Test
    public void testCollisionMap(){
        HashMap<String,Integer> students = new HashMap<>(1);
        students.set("apple",1);
        students.set("banana",2);
        students.set("cherry",3);
        Assertions.assertTrue(students.get("apple").equals(1));
        Assertions.assertEquals(students.hash("cherry"),students.hash("banana"));
        Assertions.assertTrue(students.get("banana").equals(2));
        Assertions.assertTrue(students.get("cherry").equals(3));
    }
    @Test
    public void testComputeMap(){
        String text = "Once upon a time, there was a brave princess who...";
        HashMap<String,Integer> callResult = new HashMap<>(10);
        HashMap<String,Integer> result = callResult.compute(text);
        Assertions.assertEquals(2,result.get("a"));
    }
    @Test
    public void testComputeOnPlaceMap(){
        String text = "Once upon a time, there was a brave princess who...";
        HashMap<String,Integer> result = new HashMap<>(1);
        result.computeOnPlace(text);
        Assertions.assertEquals(2,result.get("a"));
    }
    @Test
    public void testComputeMap2(){
        String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        HashMap<String,Integer> callResult = new HashMap<>(23);
        HashMap<String,Integer> result = callResult.compute(text);
        Assertions.assertEquals(2,result.get("was"));
        Assertions.assertEquals(2,result.get("I"));
        Assertions.assertEquals(2,result.get("summer"));
    }
    @Test
    public void testKeyWithMaxValueMap(){
        String text = "Once upon a time, there was a brave princess who...";
        HashMap<String,Integer> callResult = new HashMap<>(10);
        HashMap<String,Integer> result = callResult.compute(text);
        Assertions.assertEquals("a",result.keyWithMaxValue());
    }
    @Test
    public void testKeyWithMaxValueMap2(){
        String text = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        HashMap<String,Integer> callResult = new HashMap<>(23);
        HashMap<String,Integer> result = callResult.compute(text);
        Assertions.assertEquals("I",result.keyWithMaxValue());
    }
    @Test
    public void testKeyWithMaxValueMap3(){
        String text = "english arabic english";
        HashMap<String,Integer> callResult = new HashMap<>(3);
        HashMap<String,Integer> result = callResult.compute(text);
        Assertions.assertEquals("english",result.keyWithMaxValue());
    }
}
