package Collection;

import java.util.LinkedList;

public class LinkedListCollections {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Karan");
        list.add("Nitin");
        list.add("Raj");
        list.add("Chris");
        list.add("Emily");

        // traversal using for each
        for (String str : list) {
            StringBuffer strbfr = new StringBuffer(str);
            System.out.println(str + "\t" + str.length() + "\t" + str.substring(1, 3) + "\t" + strbfr.reverse());
        }
        System.out.println("---------------------------------------------");

        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.indexOf("Emily"));
        System.out.println(list.size());
        System.out.println(list.removeLast());
        System.out.println(list.contains("Raj"));
        System.out.println(list.indexOf("Karan"));
        System.out.println(list.peek());
        System.out.println(list.isEmpty());
        System.out.println(list.removeAll(list));
        System.out.println(list);

    }
}
