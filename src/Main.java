import org.jetbrains.annotations.Nullable;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int maxNumber = 13000000;
    static final long indexingNumber = 13_000_000_000L;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("type the task number");

        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();

        HashMap<Long, Long> hashMap = new HashMap<>();
        LinkedList<Long> linkedList = new LinkedList<>();
        TreeSet<Long> treeSet = new TreeSet<>();

        switch (taskNumber) {
            case 1:
                compute1(hashMap, linkedList, treeSet);
                break;
            case 2:
                compute2(hashMap, linkedList, treeSet);
                break;
            case 3:
                compute3(hashMap, linkedList, treeSet);
                break;
            case 4:
                compute4(hashMap, linkedList, treeSet);
                break;
            case 5:
                compute5(hashMap, linkedList, treeSet);
                break;
            case 6:
                compute6(hashMap, linkedList, treeSet);
                break;
            case 7:
                compute7(hashMap, linkedList, treeSet);
                break;
        }
    }
    static void fillCollections(@Nullable HashMap<Long, Long> hashMap,@Nullable LinkedList<Long> linkedList,
                                @Nullable TreeSet<Long> treeSet, long startIndex, long endIndex)
    {
        for (long i = startIndex; i < endIndex; i++) {
            if (hashMap != null) hashMap.put(i, i);
            if (linkedList != null && i <= Integer.MAX_VALUE) linkedList.add(i);
            if (treeSet != null) treeSet.add(i);
        }
    }

    static void compute1(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            hashMap.put(-i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no head): " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            linkedList.addFirst(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add to head total time: " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            treeSet.add(-i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add to head total time: " + (end - start));
    }
    static void compute2(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            hashMap.put(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no tail): " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            linkedList.addLast(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add to tail total time: " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add to tail total time: " + (end - start));
    }
    static void compute3(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet, 0, maxNumber/3);
        fillCollections(hashMap, linkedList, treeSet, maxNumber/3*2, maxNumber);
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber/3; i++) {
            hashMap.put(maxNumber/3+i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no index): " + (end - start));

        start = System.currentTimeMillis();
        for (long i = maxNumber/3; i < maxNumber*2/3; i++) {
            treeSet.add(i+maxNumber/3);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add in the middle total time: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber/3; i++) {
            linkedList.add(maxNumber/3+i, (long)i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add in the middle total time: " + (end - start));
    }
    static void compute4(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet, 0, maxNumber);
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            hashMap.remove(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap remove total time (no order): " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            linkedList.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove first total time: " + (end - start));
        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) {
            treeSet.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet remove first total time: " + (end - start));
    }
    static void compute5(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet, 0, maxNumber);
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber; i++) hashMap.remove(i);
        long end = System.currentTimeMillis();
        System.out.println("HashMap remove total time (no order): " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) linkedList.removeLast();
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove last total time: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) treeSet.removeLast();
        end = System.currentTimeMillis();
        System.out.println("TreeSet remove last total time: " + (end - start));
    }
    static void compute6(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet, 0, maxNumber);
        long start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber/2; i++) hashMap.remove(maxNumber/2-i);
        long end = System.currentTimeMillis();
        System.out.println("HashMap remove total time (no order): " + (end - start));

        start = System.currentTimeMillis();
        for (long i = 0; i < maxNumber/2; i++) treeSet.remove(i+maxNumber/2);
        end = System.currentTimeMillis();
        System.out.println("TreeSet remove from the middle total time: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber/2; i++) linkedList.remove(maxNumber/2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove from the middle total time: " + (end - start));
    }
    static void compute7(HashMap<Long, Long> hashMap, LinkedList<Long> linkedList, TreeSet<Long> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet,  0, indexingNumber);
        long start = System.currentTimeMillis();
        long currentValue = 0;
        for (long i = 0; i < indexingNumber; i++) currentValue = hashMap.get(i);
        long end = System.currentTimeMillis();
        System.out.println("HashMap get by index total time: " + (end - start));

        boolean contains = false;
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) contains = treeSet.contains(i);
        end = System.currentTimeMillis();
        System.out.println("TreeSet search by value total time (no index): " + (end - start));

        start = System.currentTimeMillis();
        int maxIndexForList = Integer.MAX_VALUE;
        for (int i = 0; i < maxIndexForList; i++) currentValue = linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList get by index total time (max collection size): " + (end - start));

    }

}