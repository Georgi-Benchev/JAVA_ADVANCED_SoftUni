package JAVA_ADVANCED.lec_17_Generics.Task3_AnimalExample;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sleep();
        Zookeeper<Animal> zookeeper = new Zookeeper<>();
        Zookeeper<Tiger> zookeeper2 = new Zookeeper<>();

        zookeeper.sleepAllAnimals();
        zookeeper2.sleepAllAnimals();
    }
}
