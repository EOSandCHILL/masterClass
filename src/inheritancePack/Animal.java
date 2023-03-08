package inheritancePack;

public class Animal {
    protected String type;
    // Conditional Encapsulation:
    // The private modifier specifies that the member can only be
    // accessed in its own class. The protected modifier specifies
    // that the member can only be accessed within its own package
    // (as with package-private) and, in addition, by a subclass of
    // its class in another package.
    private String size;
    private double weight;

    public Animal() {

    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed) {

        System.out.println(type + " moves " + speed);
    }
    public void makeNoise() {

        System.out.println(type + " makes some kind of noise");
    }
}
