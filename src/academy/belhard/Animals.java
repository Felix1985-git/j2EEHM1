package academy.belhard;

public abstract class Animals {
    private int weight;
    private String name;
    private String color;

    public Animals(int weight, String name, String color) {
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract void say();

    public abstract void run();


}
