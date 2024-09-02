package Collection;

import java.util.HashSet;

public class HashSetCollections {
    public static void main(String[] args) {

        HashSet<Number> number = new HashSet<>();

        number.add(2);
        number.add(10);
        number.add(89);
        number.add(47);
        number.add(0);
        number.add(33);
        // elements are unique
        System.out.println(number);

        // no dublicated allowed
        number.add(2);

        // iterating Using for each
        for (Number n : number) {
            System.out.println(n);
        }
        System.out.println(number);
        System.out.println(number.isEmpty());

    }
}
