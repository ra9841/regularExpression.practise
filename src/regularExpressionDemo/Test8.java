package regularExpressionDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//10 digits mobile number

public class Test8 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        Matcher m=p.matcher("510-646-1234");
        if(m.find() && m.group().equals("510-646-1234")){
            System.out.println("valid mobile number");
        }else{
            System.out.println("invalid");
        }


    }
}
