package JAVA_ADVANCED.lec_17_Generics.Task3_AnimalExample;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper <T extends Animal>{
    List<T> animals;

    public Zookeeper(){
        animals=new ArrayList<>();
    }


    public void sleepAllAnimals (){
        for (T animal : animals) {
            animal.sleep();
        }

    }
}
