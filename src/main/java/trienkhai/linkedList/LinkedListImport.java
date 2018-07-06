package trienkhai.linkedList;

import java.util.LinkedList;

public class LinkedListImport {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add(0, "D");
        list.add(1, "E");
        list.add(2, "F");
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        list.addLast("G");
        list.addLast("H");
        list.addLast("K");

        list.remove(1);

        System.out.println(list.size());
        System.out.println("-----------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }

        System.out.println("\n"+ "-----------------------------");
        System.out.println(list.clone());

        list.getFirst();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
