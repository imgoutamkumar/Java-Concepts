package Collection;

import java.util.TreeSet;

public class TreeSetCollections {
    public static void main(String[] args) {

        TreeSet<Number> number = new TreeSet<>();
        number.add(2);
        number.add(10);
        number.add(89);
        number.add(47);
        number.add(0);
        number.add(33);

        // get sorted elements
        // no dublicated allowed
        System.out.println(number);
        number.add(2);
        System.out.println(number);
        System.out.println(number.isEmpty());
    }
}
