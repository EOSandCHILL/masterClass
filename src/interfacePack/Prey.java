package interfacePack;

public interface Prey {
    void flee();
}

class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.print("The rabbit is fleeing");
    }
}

class Fish {

}