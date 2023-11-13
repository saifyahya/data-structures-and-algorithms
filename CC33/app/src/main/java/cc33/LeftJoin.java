package CC33.app.src.main.java.cc33;

import CC30.lib.src.main.java.cc30.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {
    public static List<List<String>> leftJoin(HashMap map1, HashMap map2){
        List<List<String>> leftJoinTable= new ArrayList<>();
        List<String> keysOfMap1=map1.keys();
        for(String key:keysOfMap1){
            List<String> leftJoinColumns=new ArrayList<>();
            leftJoinColumns.add( key);
            leftJoinColumns.add((String) map1.get(key));
            if(map2.contains(key)){
                leftJoinColumns.add((String) map2.get(key));
            }
            else {
                leftJoinColumns.add(null);
            }
            leftJoinTable.add(leftJoinColumns);
        }
        return leftJoinTable;
    }
}
