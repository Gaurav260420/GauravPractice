package Java8;

import java.util.Arrays;
import java.util.List;

public class practice1 {
    public static void main(String args[]){
        List<String> list = Arrays.asList("java","python","angular","R","c++","javaScript");
        Long count = list.stream().filter(e -> e.length()>=3).count();
        System.out.println(">>>>>>>"+count);
    }
}
