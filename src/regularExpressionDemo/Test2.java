package regularExpressionDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
//        Pattern p=Pattern.compile("[^abc]");
//        Matcher m=p.matcher("a7b@z#9");
        Pattern p=Pattern.compile("\\s");
        Matcher m=p.matcher("a7b@ z#9");
        while(m.find()){
            System.out.println(m.start()+"..."+m.group());
        }
    }
}
