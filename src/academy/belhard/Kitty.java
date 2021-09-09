package academy.belhard;

public class Kitty extends Cat {


    public Kitty(int weight, String name, String color) {
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

}
