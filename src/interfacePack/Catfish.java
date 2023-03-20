package interfacePack;

public class Catfish implements Predator, Prey {
    @Override
    public void hunt() {
        System.out.print("The catfish can hunt");
    }

    @Override
    public void flee() {
        System.out.print("the catfish can flee");
    }
}
