package lektionnio.exseven;

import java.util.ArrayList;
import java.util.List;

public class ExSeven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);
        System.out.println(list);
        System.out.println(insertionSort(list));
    }

    public static List<Integer> insertionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();

        for (Integer integer : list) {
            if (sortedList.isEmpty()) {
                sortedList.add(integer);
            }
            else {
                for (int i = 0; i < sortedList.size(); i++) {
                    Integer checkNumber = sortedList.get(i);

                    if (checkNumber > integer) {
                        sortedList.add(i, integer);
                        break;
                    }
                    
                }
            }
        }
        return sortedList;
    }
}