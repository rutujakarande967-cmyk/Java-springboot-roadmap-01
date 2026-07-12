package Day_06;

public class MethodOverloadingDemo {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b){
        return a+b;
    }
    public static void main(String[]args){
        System.out.println(add(12,10));
        System.out.println(add(12,10,90));
        System.out.println(add(12.8,10.7));
    }
}
