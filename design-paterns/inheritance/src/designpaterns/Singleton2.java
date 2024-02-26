package designpaterns;

public class Singleton2 {
    private static volatile Singleton2 instance;   //volatile to ensure not access the obj before initialize
private Singleton2(){}
    public static  Singleton2 getInstance(){  //lazy initialize + synchronize to insure not 2 threads can access this methods at the same time
        if(instance==null){
            synchronized (Singleton2.class){
                if(instance==null)
                    instance= new Singleton2();
            }}
            return instance;
        }
}
