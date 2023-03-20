package interfacePack;

public class Main {
    public static void main(String[] args) {
        // interface = a template that can be applied to a class.
        // similar to inheritance, but specifies what a class has/must do.
        // classes can apply more than one interface,
        // while inheritance is limited to 1 super
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        System.out.print(" and ");
        Hawk hawk = new Hawk();
        hawk.hunt();
        Catfish catfish = new Catfish();
        System.out.println();
        catfish.flee();
        System.out.print(" and ");
        catfish.hunt();
    }
 }