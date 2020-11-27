package task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static List<? extends Number> findDuplicates(List<? extends Number> firstList,
                                                        List<? extends Number> secondList) {
        return firstList.stream()
                .distinct()
                .filter(secondList::contains)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 2, 2, 5, 7, 5, 8, 1, 3);
        List<Number> secondList = Arrays.asList(9, 3, 2, 4, 10, 1, 5, 1, 2, 2, 4);
        System.out.println(findDuplicates(firstList, secondList));
    }

}
