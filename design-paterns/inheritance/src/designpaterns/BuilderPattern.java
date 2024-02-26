package designpaterns;

import java.util.List;

public class BuilderPattern {
    private int age;
    private String name;
    private List<String> foods;

    public BuilderPattern setAge(int age) {
        this.age = age;
        return this;
    }

    public BuilderPattern setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderPattern setFoods(List<String> foods) {
        this.foods = foods;
        return this;
    }

    public ImmutableClass build() {      // build method which returns an object of the original class
        return new ImmutableClass(age, name, foods);
    }

}
