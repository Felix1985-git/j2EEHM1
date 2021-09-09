package academy.belhard;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(12, "Boris", "Black");
        cat.say();
        cat.run();
        cat.kus();
        cat.GetParents(cat);

        Cat kitty = new Kitty(1, "Vaska", "Red");
        kitty.say();
        kitty.run();
        kitty.kus();

        Dog dog = new Dog(26, "Asia", "Black");
        dog.say();
        dog.run();
        dog.getTapki();
        dog.kus();

        // Дополнительное задание 2
        List<Animals> animals = new ArrayList();
        animals.add(cat);
        animals.add(kitty);
        animals.add(dog);

        allOverride(animals);

    }

    // Метод для вызова переопределенного метода всех элементов дочерних класов (доп. задание 2)
    public static void allOverride(List<Animals> animals) {
        animals.forEach(animals1 -> animals1.say());
    }
}