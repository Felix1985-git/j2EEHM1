package academy.belhard;

public class Cat extends Animals implements KusatLudey {

    public Cat(int weight, String name, String color) {
        super(weight, name, color);
    }

    @Override
    public void say() {
        System.out.println("voice " + this.getClass().getSimpleName() + " " + getName());
    }

    @Override
    public void run() {
        System.out.println("run " + this.getClass().getSimpleName() + " " + getName());
    }

    @Override
    public void kus() {
        System.out.println("kus' " + this.getClass().getSimpleName() + " " + getName());
    }

    // Пункт 6 задания
    public void GetParents(Animals animals) {
        animals.say();
    }

}
