package regularExpressionDemo;

import java.util.StringTokenizer;

//String tokenizer
//The default Regular Expression is space for string tokenizer
public class Test7 {
    public static void main(String[] args) {
        //StringTokenizer st=new StringTokenizer("rabin software solution");
        StringTokenizer st=new StringTokenizer("9-4-2023","-");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
