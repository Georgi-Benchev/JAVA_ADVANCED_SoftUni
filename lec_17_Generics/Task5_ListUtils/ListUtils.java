package JAVA_ADVANCED.lec_17_Generics.Task5_ListUtils;

import java.util.Collections;
import java.util.List;

public class ListUtils {

    public static  <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return Collections.max(list);
    }
    //easy way

    // and hard way
    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        T minSoFar = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T curentEl = list.get(i);
            if (curentEl.compareTo(minSoFar) < 0) {
                minSoFar = curentEl;
            }
        }
        return minSoFar;

    }

}
