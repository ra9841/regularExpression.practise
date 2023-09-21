package StreamApi.practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo4 {


    public static Map.Entry<Integer, List<String>> getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num - 1);
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
        map.put("kabin",2500);
        map.put("jabin",2500);

        System.out.println(getDynamicNthHighestSalary(3, map));
    }
}
