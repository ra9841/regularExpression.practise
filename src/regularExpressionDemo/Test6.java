package regularExpressionDemo;
//String class split() method
public class Test6 {
    public static void main(String[] args) {
        String s="rabin software solution";
        //String[] str=s.split("\\s");
        String[] str=s.split("");
        for(String st:str){
            System.out.println(st);
        }

    }
}
