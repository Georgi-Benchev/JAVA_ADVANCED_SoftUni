package JAVA_ADVANCED.lec_17_Generics.Task4_Scale;

public class Main {
    public static void main(String[] args) {


        Scale<Integer> newIntScale = new Scale<>(12, 15);
        Scale<String> newStringScale = new Scale<>("11", "12");
        Scale<String> newStringScale2 = new Scale<>("12", "12");

        System.out.println(newIntScale.getHevier());
        System.out.println(newStringScale.getHevier());
        System.out.println(newStringScale2.getHevier());

    }
}
