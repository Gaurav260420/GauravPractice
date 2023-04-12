package Java8;

import java.util.Arrays;
import java.util.List;

public class practice2 {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream().map(e -> e*2).forEach(System.out::println);
    }
}
