package academy.belhard;

public class Dog extends Animals implements Get, KusatLudey {
    public Dog(int weight, String name, String color) {
        super(weight, name, color);
    }

    @Override
    public void say() {
        System.out.println("Voice " + this.getClass().getSimpleName() + " " + getName());
    }

    @Override
    public void run() {
        System.out.println("Run " + this.getClass().getSimpleName() + " " + getName());
    }

    @Override
    public void getTapki() {
        System.out.println("Припер Тапки " + this.getClass().getSimpleName() + " " + getName());
    }

    @Override
    public void kus() {
        System.out.println("Kus' " + this.getClass().getSimpleName() + " " + getName());
    }
}
