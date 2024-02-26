import java.util.function.Predicate;

public class Animal {
    String name = "Animal";
    public void printName(){
        System.out.println(name);
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public  boolean  isAnimal(){
        return this.name.equalsIgnoreCase("animal");
  }

  public void functionalMethod(Animal animal,Predicate<Animal> predicate){
        if(predicate.test(animal)){
            System.out.println("it is animal");
        }
        else
            System.out.println("not animal");
  }


}
