package task;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static List<? extends Number> exceptDuplicates(List<? extends Number> firstList,
                                                        List<? extends Number> secondList) {
        return Stream.concat(firstList.stream().distinct().filter(x -> !secondList.contains(x)),
                secondList.stream().distinct().filter(x -> !firstList.contains(x)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 2, 2, 5, 7, 5, 8, 1, 3);
        List<Number> secondList = Arrays.asList(9, 3, 2, 4, 10, 1, 5, 1, 2, 2, 4);
        System.out.println(exceptDuplicates(firstList, secondList));
    }

}
