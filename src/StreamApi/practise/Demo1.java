package StreamApi.practise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {


        String name = "rabinshrestha";
        String[] str = name.split("");
        System.out.println(Arrays.toString(str));

        for(int i=str.length-1;i>=0;i--){
            System.out.println(str[i]);
        }
        
        StringBuilder sb=new StringBuilder(name).reverse();
        System.out.println(sb);



    }
}
