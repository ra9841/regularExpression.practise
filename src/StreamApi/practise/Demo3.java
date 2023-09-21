package StreamApi.practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo3 {

    public static Map.Entry<String,Integer> getNthHighestSalary(int num,Map<String,Integer>map1){
        return map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num-1);
    }






    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("rabin",1000);
        map.put("sunil",3000);
        map.put("hari",500);
        map.put("sabin",500);
        map.put("keshav",3000);
        map.put("nabin",2500);
        map.put("resham",2880);

        System.out.println(getNthHighestSalary(3,map));

    }
}
