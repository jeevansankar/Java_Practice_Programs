import java.util.*;

public class ArrayListClass {

    public static void main(String[] args) {

        // ------------------------------------------------
        // ArrayList Constructor
        // ------------------------------------------------
        ArrayList<String> list =
                new ArrayList<>(10);

        System.out.println("Initial List:");
        System.out.println(list);

        // ------------------------------------------------
        // add()
        // ------------------------------------------------
        list.add("Java");
        list.add("Python");
        list.add("Spring");

        System.out.println("\nAfter add():");
        System.out.println(list);

        // ------------------------------------------------
        // ensureCapacity()
        // ------------------------------------------------
        list.ensureCapacity(50);

        System.out.println("\nensureCapacity(50) executed");

        // ------------------------------------------------
        // clone()
        // ------------------------------------------------
        ArrayList<String> copy =
                (ArrayList<String>) list.clone();

        System.out.println("\nCloned List:");
        System.out.println(copy);

        // ------------------------------------------------
        // modify original list
        // ------------------------------------------------
        list.add("Hibernate");

        System.out.println("\nOriginal List After Modification:");
        System.out.println(list);

        System.out.println("\nCloned List After Original Modified:");
        System.out.println(copy);

        // ------------------------------------------------
        // trimToSize()
        // ------------------------------------------------
        list.trimToSize();

        System.out.println("\ntrimToSize() executed");

        // ------------------------------------------------
        // subclass to access removeRange()
        // ------------------------------------------------
        MyArrayList<Integer> nums =
                new MyArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("\nBefore removeRange():");
        System.out.println(nums);

        nums.callRemoveRange(1,4);

        System.out.println("\nAfter removeRange(1,4):");
        System.out.println(nums);
    }
}

// ------------------------------------------------
// subclass because removeRange() is protected
// ------------------------------------------------
class MyArrayList<E> extends ArrayList<E> {

    public void callRemoveRange(int from, int to) {
        removeRange(from, to);
    }
}
/*
Initial List:
[]

After add():
[Java, Python, Spring]

ensureCapacity(50) executed

Cloned List:
[Java, Python, Spring]

Original List After Modification:
[Java, Python, Spring, Hibernate]

Cloned List After Original Modified:
[Java, Python, Spring]

trimToSize() executed

Before removeRange():
[10, 20, 30, 40, 50]

After removeRange(1,4):
[10, 50] */