package interfacePack;

public interface Predator {
    void hunt();
}

class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.print("The hawk is on the hunt");
    }
}