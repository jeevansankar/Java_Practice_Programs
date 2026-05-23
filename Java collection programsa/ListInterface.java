import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        // CREATE LIST
        List<String> list = new ArrayList<>();

        // -------------------------------------------------
        // add(E e)
        // -------------------------------------------------
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("After add():");
        System.out.println(list);

        // -------------------------------------------------
        // add(index, element)
        // -------------------------------------------------
        list.add(1, "Spring");

        System.out.println("\nAfter add(index, element):");
        System.out.println(list);

        // -------------------------------------------------
        // addAll(Collection)
        // -------------------------------------------------
        List<String> list2 = new ArrayList<>();

        list2.add("Hibernate");
        list2.add("React");

        list.addAll(list2);

        System.out.println("\nAfter addAll():");
        System.out.println(list);

        // -------------------------------------------------
        // addAll(index, collection)
        // -------------------------------------------------
        List<String> temp = new ArrayList<>();

        temp.add("HTML");
        temp.add("CSS");

        list.addAll(2, temp);

        System.out.println("\nAfter addAll(index, collection):");
        System.out.println(list);

        // -------------------------------------------------
        // get(index)
        // -------------------------------------------------
        System.out.println("\nget(3):");
        System.out.println(list.get(3));

        // -------------------------------------------------
        // set(index, element)
        // -------------------------------------------------
        list.set(0, "JAVA");

        System.out.println("\nAfter set():");
        System.out.println(list);

        // -------------------------------------------------
        // contains()
        // -------------------------------------------------
        System.out.println("\ncontains(\"React\"):");
        System.out.println(list.contains("React"));

        // -------------------------------------------------
        // containsAll()
        // -------------------------------------------------
        System.out.println("\ncontainsAll(list2):");
        System.out.println(list.containsAll(list2));

        // -------------------------------------------------
        // size()
        // -------------------------------------------------
        System.out.println("\nsize():");
        System.out.println(list.size());

        // -------------------------------------------------
        // isEmpty()
        // -------------------------------------------------
        System.out.println("\nisEmpty():");
        System.out.println(list.isEmpty());

        // -------------------------------------------------
        // indexOf()
        // -------------------------------------------------
        System.out.println("\nindexOf(\"Python\"):");
        System.out.println(list.indexOf("Python"));

        // -------------------------------------------------
        // lastIndexOf()
        // -------------------------------------------------
        list.add("React");

        System.out.println("\nlastIndexOf(\"React\"):");
        System.out.println(list.lastIndexOf("React"));

        // -------------------------------------------------
        // iterator()
        // -------------------------------------------------
        System.out.println("\niterator():");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // -------------------------------------------------
        // listIterator()
        // -------------------------------------------------
        System.out.println("\nlistIterator() forward:");

        ListIterator<String> lit = list.listIterator();

        while(lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("\nlistIterator() backward:");

        while(lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        // -------------------------------------------------
        // remove(object)
        // -------------------------------------------------
        list.remove("CSS");

        System.out.println("\nAfter remove(object):");
        System.out.println(list);

        // -------------------------------------------------
        // remove(index)
        // -------------------------------------------------
        list.remove(0);

        System.out.println("\nAfter remove(index):");
        System.out.println(list);

        // -------------------------------------------------
        // removeAll()
        // -------------------------------------------------
        list.removeAll(list2);

        System.out.println("\nAfter removeAll(list2):");
        System.out.println(list);

        // -------------------------------------------------
        // retainAll()
        // -------------------------------------------------
        List<String> list3 = new ArrayList<>();

        list3.add("Spring");
        list3.add("HTML");

        list.retainAll(list3);

        System.out.println("\nAfter retainAll(list3):");
        System.out.println(list);

        // -------------------------------------------------
        // toArray()
        // -------------------------------------------------
        Object[] arr = list.toArray();

        System.out.println("\ntoArray():");

        for(Object x : arr) {
            System.out.println(x);
        }

        // -------------------------------------------------
        // subList()
        // -------------------------------------------------
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println("\nsubList(1,4):");
        System.out.println(nums.subList(1,4));

        // -------------------------------------------------
        // forEach()
        // -------------------------------------------------
        System.out.println("\nforEach():");

        nums.forEach(x -> System.out.println(x));

        // -------------------------------------------------
        // replaceAll()
        // -------------------------------------------------
        nums.replaceAll(x -> x * 2);

        System.out.println("\nAfter replaceAll():");
        System.out.println(nums);

        // -------------------------------------------------
        // sort()
        // -------------------------------------------------
        nums.sort(null);

        System.out.println("\nAfter sort():");
        System.out.println(nums);

        // -------------------------------------------------
        // stream()
        // -------------------------------------------------
        System.out.println("\nstream():");

        nums.stream().forEach(System.out::println);

        // -------------------------------------------------
        // removeIf()
        // -------------------------------------------------
        nums.removeIf(x -> x > 50);

        System.out.println("\nAfter removeIf():");
        System.out.println(nums);

        // -------------------------------------------------
        // equals()
        // -------------------------------------------------
        List<Integer> nums2 = new ArrayList<>();

        nums2.add(20);
        nums2.add(40);

        System.out.println("\nequals(nums2):");
        System.out.println(nums.equals(nums2));

        // -------------------------------------------------
        // hashCode()
        // -------------------------------------------------
        System.out.println("\nhashCode():");
        System.out.println(nums.hashCode());

        // -------------------------------------------------
        // clear()
        // -------------------------------------------------
        nums.clear();

        System.out.println("\nAfter clear():");
        System.out.println(nums);

        // -------------------------------------------------
        // final isEmpty()
        // -------------------------------------------------
        System.out.println("\nisEmpty() after clear:");
        System.out.println(nums.isEmpty());
    }
}
/*
After add():
[Java, Python, C++]

After add(index, element):
[Java, Spring, Python, C++]

After addAll():
[Java, Spring, Python, C++, Hibernate, React]

After addAll(index, collection):
[Java, Spring, HTML, CSS, Python, C++, Hibernate, React]

get(3):
CSS

After set():
[JAVA, Spring, HTML, CSS, Python, C++, Hibernate, React]

contains("React"):
true

containsAll(list2):
true

size():
8

isEmpty():
false

indexOf("Python"):
4

lastIndexOf("React"):
8

iterator():
JAVA
Spring
HTML
CSS
Python
C++
Hibernate
React
React

listIterator() forward:
JAVA
Spring
HTML
CSS
Python
C++
Hibernate
React
React

listIterator() backward:
React
React
Hibernate
C++
Python
CSS
HTML
Spring
JAVA

After remove(object):
[JAVA, Spring, HTML, Python, C++, Hibernate, React, React]

After remove(index):
[Spring, HTML, Python, C++, Hibernate, React, React]

After removeAll(list2):
[Spring, HTML, Python, C++]

After retainAll(list3):
[Spring, HTML]

toArray():
Spring
HTML

subList(1,4):
[20, 30, 40]

forEach():
10
20
30
40
50

After replaceAll():
[20, 40, 60, 80, 100]

After sort():
[20, 40, 60, 80, 100]

stream():
20
40
60
80
100

After removeIf():
[20, 40]

equals(nums2):
true

hashCode():
1621

After clear():
[]

isEmpty() after clear:
true3333333333 */