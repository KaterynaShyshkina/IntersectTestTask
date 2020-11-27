package task;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static List<? extends Number> findDuplicates(List<? extends Number> firstList,
                                                        List<? extends Number> secondList) {
        return firstList.stream()
                .distinct()
                .filter(x -> secondList.contains(x))
                .collect(Collectors.toList());
    }

}
