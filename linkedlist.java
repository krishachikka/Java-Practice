import java.util.*;

class linkedlistDemo {
    public static void main(String[] argss) {
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("Cherry");
        linkedlist.add("apple");
        linkedlist.add("eww");
        linkedlist.add("adi");
        System.out.println(linkedlist);

        // Iterating using for Loop
        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }

        // removing elements
        linkedlist.remove(0);
        linkedlist.remove((linkedlist.size() - 1));

        // Iterating using enhanced for loop
        for (String str : linkedlist) {
            System.out.println(str);
        }

        // adding new names
        linkedlist.add(0, "Anjali");
        linkedlist.add(3, "Urvashi");

        // Iterating using Iterator
        Iterator<String> iterate = linkedlist.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}

/*
 Output:
[Cherry, apple, eww, adi]
Cherry
apple
eww
adi
apple
eww
Anjali
apple
eww
Urvashi

 */