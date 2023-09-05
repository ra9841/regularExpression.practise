package regularExpressionDemo;

import java.util.regex.Pattern;
//Pattern class split() method
public class Test4 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\s");
        //Pattern p=Pattern.compile("a");
        // Pattern p=Pattern.compile("o");
           String[] s=p.split("rabin software solution");//group of token
        for(String st:s){
            System.out.println(st);
        }
    }
}
