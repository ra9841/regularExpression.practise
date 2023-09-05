package regularExpressionDemo;

import java.util.regex.Pattern;
//Pattern class split() method
public class Test5 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\.");
        String[] s=p.split("www.rabinsoftware.com");//group of token
        for(String st:s){
            System.out.println(st);
        }
    }
}
