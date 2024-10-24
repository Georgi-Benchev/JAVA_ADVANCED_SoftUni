package JAVA_ADVANCED.lec_17_Generics.Task1_CreateJar;

import java.util.ArrayDeque;

public class Jar<T> {
    public ArrayDeque<T> stack;

    public Jar(){
        this.stack=new ArrayDeque<>();
    }

    public void add(T element){
        this.stack.push(element);
    }

    public T remove(){
        return this.stack.pop();
    }
}
