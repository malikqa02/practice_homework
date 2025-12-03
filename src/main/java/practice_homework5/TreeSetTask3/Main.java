package practice_homework5.TreeSetTask3;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static Integer findMax(TreeSet<Integer> treeSet){
        AtomicReference<Integer> maxNum = new AtomicReference<>(0);
        treeSet.forEach(
                treeSet1 -> {
                    if (treeSet1 > maxNum.get()){
                        maxNum.set(treeSet1);
                    }
                }
        );
        return maxNum.get();
    }
    public static Integer findMin(TreeSet<Integer> treeSet){
        AtomicReference<Integer> minNum = new AtomicReference<>(999999999);
        treeSet.forEach(
                treeSet1 -> {
                    if (treeSet1 < minNum.get()){
                        minNum.set(treeSet1);
                    }
                }
        );
        return minNum.get();
    }
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(333);
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));
    }
}
