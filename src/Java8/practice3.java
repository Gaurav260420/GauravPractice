package Java8;

import java.util.HashMap;
import java.util.Map;

public class practice3 {
    public static void main(String args[]){
        String name ="GauravRaj";
        String[] n = name.split("");
        Map<String,Integer> map=new HashMap<>();
        for(String s : n){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
    }

}
