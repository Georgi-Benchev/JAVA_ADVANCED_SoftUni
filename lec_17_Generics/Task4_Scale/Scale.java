package JAVA_ADVANCED.lec_17_Generics.Task4_Scale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;


    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHevier() {
        if (left.compareTo(right) == 0) {
            return null;
        } else if (left.compareTo(right) > 0) {
            return left;
        } else {
            return right;
        }
    }

}
