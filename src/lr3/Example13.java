package lr3;

import java.util.*;

public class Example13 {
    private static final int SIZE = 1_000_000;

    public static void main(String[] args) {
        addElement();
        deleteElement();
        findElement();
    }

    private static List<Integer> fillArrayList(long size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> fillLinkedList(long size) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    private static Deque<Integer> fillArrayDeque(long size) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < size; i++) {
            deque.addLast(i);
        }
        return deque;
    }

    private static void addElement() {
        System.out.println("\n1. Время добавления элемента:");

        // ArrayList (в начало, середину, конец)
        List<Integer> arrayList = fillArrayList(SIZE);
        long start = System.nanoTime();
        arrayList.add(0, SIZE);
        long end = System.nanoTime();
        System.out.println("ArrayList (вставка в начало): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayList.add(arrayList.size() / 2, SIZE);
        end = System.nanoTime();
        System.out.println("ArrayList (вставка в середину): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayList.add(SIZE);
        end = System.nanoTime();
        System.out.println("ArrayList (вставка в конец): " + (end - start) + " нс");

        arrayList.clear();
        System.gc();

        // LinkedList (в начало, середину, конец)
        List<Integer> linkedList = fillLinkedList(SIZE);
        start = System.nanoTime();
        linkedList.add(0, SIZE);
        end = System.nanoTime();
        System.out.println("LinkedList (вставка в начало): " + (end - start) + " нс");

        start = System.nanoTime();
        linkedList.add(linkedList.size() / 2, SIZE);
        end = System.nanoTime();
        System.out.println("LinkedList (вставка в середину): " + (end - start) + " нс");

        start = System.nanoTime();
        linkedList.add(SIZE);
        end = System.nanoTime();
        System.out.println("LinkedList (вставка в конец): " + (end - start) + " нс");

        linkedList.clear();
        System.gc();

        // ArrayDeque (в начало, в конец)
        Deque<Integer> arrayDeque = fillArrayDeque(SIZE);
        start = System.nanoTime();
        arrayDeque.addFirst(SIZE);
        end = System.nanoTime();
        System.out.println("ArrayDeque (добавление в начало): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayDeque.addLast(SIZE);
        end = System.nanoTime();
        System.out.println("ArrayDeque (добавление в конец): " + (end - start) + " нс");

        arrayDeque.clear();
        System.gc();
    }

    private static void deleteElement() {
        System.out.println("\n2. Время удаления элемента:");

        // ArrayList (удаление из начала, середины, конца)
        List<Integer> arrayList = fillArrayList(SIZE);
        long start = System.nanoTime();
        arrayList.remove(0);
        long end = System.nanoTime();
        System.out.println("ArrayList (удаление из начала): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayList.remove(arrayList.size() / 2);
        end = System.nanoTime();
        System.out.println("ArrayList (удаление из середины): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        end = System.nanoTime();
        System.out.println("ArrayList (удаление из конца): " + (end - start) + " нс");

        arrayList.clear();
        System.gc();

        // LinkedList (удаление из начала, середины, конца)
        List<Integer> linkedList = fillLinkedList(SIZE);
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        System.out.println("LinkedList (удаление из начала): " + (end - start) + " нс");

        start = System.nanoTime();
        linkedList.remove(linkedList.size() / 2);
        end = System.nanoTime();
        System.out.println("LinkedList (удаление из середины): " + (end - start) + " нс");

        start = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        end = System.nanoTime();
        System.out.println("LinkedList (удаление из конца): " + (end - start) + " нс");

        linkedList.clear();
        System.gc();

        // ArrayDeque (удаление из начала, конца)
        Deque<Integer> arrayDeque = fillArrayDeque(SIZE);
        start = System.nanoTime();
        arrayDeque.removeFirst();
        end = System.nanoTime();
        System.out.println("ArrayDeque (удаление из начала): " + (end - start) + " нс");

        start = System.nanoTime();
        arrayDeque.removeLast();
        end = System.nanoTime();
        System.out.println("ArrayDeque (удаление из конца): " + (end - start) + " нс");

        arrayDeque.clear();
        System.gc();
    }

    private static void findElement() {
        System.out.println("\n3. Время поиска/доступа к элементу:");

        // ArrayList (доступ по индексу)
        List<Integer> arrayList = fillArrayList(SIZE);
        long start = System.nanoTime();
        arrayList.get(SIZE / 2);
        long end = System.nanoTime();
        System.out.println("ArrayList (доступ по индексу): " + (end - start) + " нс");
        arrayList.clear();
        System.gc();

        // LinkedList (доступ по индексу)
        List<Integer> linkedList = fillLinkedList(SIZE);
        start = System.nanoTime();
        linkedList.get(SIZE / 2);
        end = System.nanoTime();
        System.out.println("LinkedList (доступ по индексу): " + (end - start) + " нс");
        linkedList.clear();
        System.gc();

        // ArrayDeque (contains и peekMiddle via iterator)
        Deque<Integer> arrayDeque = fillArrayDeque(SIZE);
        start = System.nanoTime();
        boolean contains = arrayDeque.contains(SIZE / 2);
        end = System.nanoTime();
        System.out.println("ArrayDeque (contains): " + (end - start) + " нс");
        arrayDeque.clear();
        System.gc();
    }
}