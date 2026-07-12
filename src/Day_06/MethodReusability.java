package Day_06;

public class MethodReusability {
    static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[]args){
        System.out.println(multiply(10,5));
        System.out.println(multiply(19,1));
        System.out.println(multiply(23,3));
    }
}


//Write once >>>>> Reuse many times >>>>> advantage of methods