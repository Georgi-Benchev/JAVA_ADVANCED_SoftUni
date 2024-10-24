package JAVA_ADVANCED.lec_17_Generics.Task1_CreateJar;

public class Main {

    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();


        jar.add("Blue Cookie");
        jar.add("Red Cookie");
        jar.add("Pink Cookie");

        System.out.println(jar.remove());
        System.out.println(jar.remove());

    }
}
