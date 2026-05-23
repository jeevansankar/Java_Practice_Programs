import java.util.*;

public class IteratorInterface{

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Spring");

        System.out.println("Original List:");
        System.out.println(list);

        // Create Iterator
        Iterator<String> it = list.iterator();

        System.out.println("\nUsing hasNext() and next():");

        while(it.hasNext()) {

            String value = it.next();

            System.out.println(value);

            // remove current element safely
            if(value.equals("Python")) {
                it.remove();
            }
        }

        System.out.println("\nAfter remove():");
        System.out.println(list);

        // New iterator required after traversal completed
        Iterator<String> it2 = list.iterator();

        System.out.println("\nUsing forEachRemaining():");

        it2.forEachRemaining(x -> System.out.println(x));
    }
}
/*
Original List:
[Java, Python, C++, Spring]

Using hasNext() and next():
Java
Python
C++
Spring

After remove():
[Java, C++, Spring]

Using forEachRemaining():
Java
C++
Spring */