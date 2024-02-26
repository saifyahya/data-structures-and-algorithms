package designpaterns;

import java.util.List;

public final class  ImmutableClass {  // all fields are final and set only in the constructor
    private final int age;
    final private String  name;
private final List<String> foods;
    public ImmutableClass(int age, String name,List<String> foods) {
        this.age = age;
        this.name = name;
        this.foods=foods;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int getFoodSize(){  //no access to reference of mutable objects
        return foods.size();
    }
    public String getFood(int index){   //no access to reference of mutable objects
        return foods.get(index);
    }
}
