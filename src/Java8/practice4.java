package Java8;

import java.util.Arrays;

public class practice4 {
    public static void main(String args[]){
        String [] strArray ={"java","Hibernate","springboot","microservices"};
        String longString = Arrays.stream(strArray).reduce((x,y)->x.length()>y.length() ?x :y).get();
        System.out.println(longString);

    }
}
