/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CC33.app.src.main.java.cc33;

import CC30.lib.src.main.java.cc30.HashMap;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        HashMap map1=new HashMap(5);
        map1.set("diligent","employed");
        map1.set("fond","enamored");
        map1.set("guide","usher");
        map1.set("outfit","garb");
        map1.set("wrath","anger");

        HashMap map2=new HashMap(5);
        map2.set("diligent","idle");
        map2.set("fond","averse");
        map2.set("guide","follow");
        map2.set("flow","jam");
        map2.set("wrath","delight");
        List<List< String>> result= LeftJoin.leftJoin(map1,map2);
        System.out.println(result);

}

}
