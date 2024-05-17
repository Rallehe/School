package lektionnio.exeight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.print.attribute.standard.Sides;

public class ExEight {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        startOfList(new ArrayList<>());
        long diff = System.currentTimeMillis() - startTime;
        System.out.println("Array Start " + diff);

        startTime = System.currentTimeMillis();
        startOfList(new LinkedList<>());
        diff = System.currentTimeMillis() - startTime;
        System.out.println("Linked start " + diff);   

        startTime = System.currentTimeMillis();
        endOfList(new ArrayList<>());
        diff = System.currentTimeMillis() - startTime;
        System.out.println("Array end " + diff);

        startTime = System.currentTimeMillis();
        endOfList(new LinkedList<>());
        diff = System.currentTimeMillis() - startTime;
        System.out.println("Linked end " + diff);

        

    }

    public static int startOfList(List<Integer> startList) {

        for (int i = 0; i < 500000; i++) {
            startList.add(0, i);
        }
        return startList.size();
    }

    public static int endOfList(List<Integer> endList) {

        for (int i = 0; i < 500000; i++) {
            endList.add(i);
        }
        return endList.size();
    }
}