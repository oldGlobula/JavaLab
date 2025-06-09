import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int maxNumber = 1000000;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("type the task number");

        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

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

    static void fillCollections(HashMap<Integer, Integer> hashMap,
                                LinkedList<Integer> linkedList, TreeSet<Integer> treeSet) {
        for (int i = 0; i < maxNumber; i++) {
            hashMap.put(i, i);
            linkedList.add(i);
            treeSet.add(maxNumber-1-i);
        }
    }

    static void compute1(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            hashMap.put(-i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no head): " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            linkedList.addFirst(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add to head total time: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            treeSet.add(-i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add to head total time: " + (end - start));
    }
    static void compute2(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            hashMap.put(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no tail): " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            linkedList.addLast(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add to tail total time: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add to tail total time: " + (end - start));
    }
    static void compute3(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            hashMap.put(i, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap add total time (no index): " + (end - start));
        fillCollections(hashMap, linkedList, treeSet);
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            linkedList.add(maxNumber/2 + i/2, i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add in the middle total time: " + (end - start));
        treeSet.clear();
        for (int i = 0; i < maxNumber; i++) {
            treeSet.add(i);
            treeSet.add(maxNumber*2 + i);
        }
        start = System.currentTimeMillis();
        for (int i = maxNumber; i < 2*maxNumber; i++) {
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet add in the middle total time: " + (end - start));
    }
    static void compute4(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet);
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            hashMap.remove(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashMap remove total time (no order): " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            linkedList.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove first total time: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) {
            treeSet.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet remove first total time: " + (end - start));
    }
    static void compute5(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet);
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) hashMap.remove(i);
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
    static void compute6(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet);
        long start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) hashMap.remove(i);
        long end = System.currentTimeMillis();
        System.out.println("HashMap remove total time (no order): " + (end - start));

        for (int i = 0; i <= maxNumber; i++) {
            linkedList.add(i);
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber-20; i++) linkedList.remove(maxNumber/2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove from the middle total time: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber-20; i++) treeSet.remove(i+10);
        end = System.currentTimeMillis();
        System.out.println("TreeSet remove from the middle total time: " + (end - start));
    }
    static void compute7(HashMap<Integer, Integer> hashMap, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet)
    {
        fillCollections(hashMap, linkedList, treeSet);
        long start = System.currentTimeMillis();
        int currentValue = 0;
        for (int i = 0; i < maxNumber; i++) currentValue = hashMap.get(i);
        long end = System.currentTimeMillis();
        System.out.println("HashMap get by index total time: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) currentValue = linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList get by index total time: " + (end - start));
        boolean contains = false;
        start = System.currentTimeMillis();
        for (int i = 0; i < maxNumber; i++) contains = treeSet.contains(i);
        System.out.println("TreeSet search by value total time (no index): " + (end - start));
    }

}