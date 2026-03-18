package Chapter20;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println("Содержимое коллекции: " + al);

        Integer[] nums = new Integer[al.size()];

        nums = al.toArray(nums);
        System.out.println("Размер массива nums: " + nums.length);
        int sum = 0;

        for (Integer i: nums) {
            sum += i;
        }
        System.out.println("Сумма содержимого nums: " + sum);
    }
}