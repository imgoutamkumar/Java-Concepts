package Collection;

import java.util.ArrayList;

public class ArrayListCollections {
    public static void main(String[] args) {

        // Type safe collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Shreya");
        names.add("Balram");
        names.add("Amitabh");
        names.add("Mukesh");
        names.add("Malini");

        // traversal using for each
        for (String str : names) {
            StringBuffer strbfr = new StringBuffer(str);
            System.out.println(str + "\t" + str.length() + "\t" + str.substring(1, 3) + "\t" + strbfr.reverse());
        }

        System.out.println("---------------------------------------------");

        System.out.println(names);
        System.out.println("names at index 2 : " + names.get(2));
        names.set(1, "Rohan");
        System.out.println(names);
        System.out.println("Size of the names arrayList : " + names.size());
    }
}
