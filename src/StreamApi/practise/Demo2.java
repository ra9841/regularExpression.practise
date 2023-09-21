package StreamApi.practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
//Nth highest saLary
public class Demo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("rabin",1000);
        map.put("sunil",3000);
        map.put("hari",500);
        map.put("sabin",500);
        map.put("keshav",3000);
        map.put("nabin",2500);
        map.put("resham",2880);


        Map.Entry<String,Integer> result =map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList())
                .get(0);//lowest number
        System.out.println(result);

        Map.Entry<String,Integer> result1 =map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(0);//highest number
        System.out.println(result1);


    }
}
