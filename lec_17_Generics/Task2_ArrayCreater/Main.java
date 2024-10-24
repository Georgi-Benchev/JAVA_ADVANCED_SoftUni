package JAVA_ADVANCED.lec_17_Generics.Task2_ArrayCreater;

public class Main {
    public static void main(String[] args) {



        String[] stringArray =  ArrayCreator.create(String.class,5, "House");
        Integer[] intArray = ArrayCreator.create(5,10);
        for (String el:stringArray){
            System.out.println(el);
        }
        for (Integer el:intArray){
            System.out.println(el);
        }

    }
}
