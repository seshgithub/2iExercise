import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListExercise {
    public static void main(String args[]){

        List<Integer> test = Arrays.asList(1,2,2,3,3,1,5,99,99,20,18,19,88,34);
        System.out.println(removeDuplicatesAndReverse(test));
    }

    public static List<Integer> removeDuplicatesAndReverse(List<Integer> listOfIntegers) {

        List<Integer> sortedList = listOfIntegers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        Collections.reverse(sortedList);

        return sortedList;

    }
}
