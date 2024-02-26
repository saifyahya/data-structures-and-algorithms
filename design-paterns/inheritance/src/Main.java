import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //hide an inherited variable
        System.out.println("Hello world!");
        Lion animal = new Lion();
        animal.printName();
        //enums
        Electronics electronics = Electronics.LAPTOP;
        electronics.printColor();
        electronics.hello();

int count=0,x=3;
while(count++<3) {
    int y = (1 + 2 * count) % 3;
    switch (y) {
        case 0:
            x -= 1;
            break;
        case 1:
            x += 5;
        default:

    }
}
        System.out.println(x);


// functional programming
        Animal animal2 = new Animal();
        animal2.functionalMethod(animal2,a->a.name.equalsIgnoreCase("Animal")); // use lambda to send function to predicate
        animal2.name="cat";
        animal2.functionalMethod(animal2,Animal::isAnimal); //use method reference to send boolean method to the predicate

        List<Animal> list=new ArrayList<>(List.of(new Animal("Cat"), new Animal() )); //use comparator to sort list of Animals
        System.out.println(list);
        Collections.sort(list,(a,b)->a.name.compareTo(b.name));  //sol1
        Collections.sort(list, Comparator.comparing(b->b.name));  //sol2
        Collections.sort(list, Comparator.comparing(Animal::getName));  //sol3

        System.out.println(list);
    }
}

