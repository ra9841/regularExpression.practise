package StreamApi.practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String[] name={"rabin","himal","rabin","keshav","himal","kabin","nabin","kabin"};

        List<String> li=Arrays.stream(name)
                //.skip(5) //skip until 5 length position
                //.limit(4)  //only print until 4 length position
                //.sorted()
                //.distinct()   //no dublicate
                //.filter(n -> n.length()>5)
                //.filter(n -> n.startsWith("r"))
                .collect(Collectors.toList());

        System.out.println(li);
    }
}
