package inheritancePack;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt", "big", 50); // superclass === parent class
        // super is like "this()" when calling a constructor inside of a constructor.
        // except super calls a constructor on the parent class. We're using it here
        // to call Animals default constructor since we never created our own.
        // Remember Java automatically creates default constructors
        // if the programmer does not.
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
}
