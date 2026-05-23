
import java.util.*;

public class CollectionInterface {

    public static void main(String[] args) {

        // Collection reference
        Collection<String> c1 = new ArrayList<>();

        // ---------------- ADD ----------------
        c1.add("Java");
        c1.add("Python");
        c1.add("C++");

        System.out.println("After add():");
        System.out.println(c1);

        // ---------------- SIZE ----------------
        System.out.println("\nsize():");
        System.out.println(c1.size());

        // ---------------- CONTAINS ----------------
        System.out.println("\ncontains(\"Java\"):");
        System.out.println(c1.contains("Java"));

        // ---------------- ISEMPTY ----------------
        System.out.println("\nisEmpty():");
        System.out.println(c1.isEmpty());

        // ---------------- ITERATOR ----------------
        System.out.println("\niterator():");

        Iterator<String> it = c1.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // ---------------- FOREACH ----------------
        System.out.println("\nforEach():");

        c1.forEach(x -> System.out.println(x));

        // ---------------- TOARRAY ----------------
        System.out.println("\ntoArray():");

        Object[] arr = c1.toArray();

        for(Object x : arr) {
            System.out.println(x);
        }

        // ---------------- REMOVE ----------------
        c1.remove("Python");

        System.out.println("\nAfter remove(\"Python\"):");
        System.out.println(c1);

        // ---------------- ADDALL ----------------
        Collection<String> c2 = new ArrayList<>();

        c2.add("Spring");
        c2.add("Hibernate");

        c1.addAll(c2);

        System.out.println("\nAfter addAll():");
        System.out.println(c1);

        // ---------------- CONTAINSALL ----------------
        System.out.println("\ncontainsAll(c2):");
        System.out.println(c1.containsAll(c2));

        // ---------------- REMOVEALL ----------------
        c1.removeAll(c2);

        System.out.println("\nAfter removeAll(c2):");
        System.out.println(c1);

        // ---------------- RETAINALL ----------------
        Collection<String> c3 = new ArrayList<>();

        c3.add("Java");
        c3.add("React");

        c1.retainAll(c3);

        System.out.println("\nAfter retainAll(c3):");
        System.out.println(c1);

        // ---------------- HASHCODE ----------------
        System.out.println("\nhashCode():");
        System.out.println(c1.hashCode());

        // ---------------- EQUALS ----------------
        Collection<String> c4 = new ArrayList<>();

        c4.add("Java");

        System.out.println("\nequals(c4):");
        System.out.println(c1.equals(c4));

        // ---------------- STREAM ----------------
        System.out.println("\nstream():");

        c1.stream().forEach(System.out::println);

        // ---------------- CLEAR ----------------
        c1.clear();

        System.out.println("\nAfter clear():");
        System.out.println(c1);

        // ---------------- ISEMPTY AGAIN ----------------
        System.out.println("\nisEmpty() after clear:");
        System.out.println(c1.isEmpty());
    }
}
/*
After add():
[Java, Python, C++]

size():
3

contains("Java"):
true

isEmpty():
false

iterator():
Java
Python
C++

forEach():
Java
Python
C++

toArray():
Java
Python
C++

After remove("Python"):
[Java, C++]

After addAll():
[Java, C++, Spring, Hibernate]

containsAll(c2):
true

After removeAll(c2):
[Java, C++]

After retainAll(c3):
[Java]

hashCode():
2301506

equals(c4):
true

stream():
Java

After clear():
[]

isEmpty() after clear:
true */