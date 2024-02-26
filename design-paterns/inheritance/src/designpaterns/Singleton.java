package designpaterns;

public class Singleton {
    private int age;
    private final static Singleton instance = new Singleton();   // return object of my singleton class and sharable by multiple classes
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
public  int getAge(){
        return age;
}
    public void addAge(int number){
        age+=number;
    }

}
