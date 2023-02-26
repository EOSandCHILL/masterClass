package section7;

public class Car {

    // variables can and should be private (encapsulation)
    // these are fields because they're described in the class code
    // block  or body of the class and not in the method.
    // class variable should have an access modifier like public or
    // private for encapsulation purposes
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // if we want to access these variables outside of the car class we could
    // just make the variables public but this is a bad practice and not encapsulation
    // so we must use setters and getters through methods on this class.

    //Methods unlike fields will often be public because we want to give
    // users a way to interact with the object(s)

    // Getters and Setters are used to control, protect, and access private fields
    // Getters - method on a class that retrieves the value of a private field and returns it
    // Setters - a method on a class that sets the value of a private field

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    };
    // Getters and Setters are used to control, protect, and access private fields
    // Getters - method on a class that retrieves the value of a private field and returns it
    // Setters - a method on a class that sets the value of a private field
}
