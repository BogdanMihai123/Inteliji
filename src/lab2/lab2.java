package lab2;

public class lab2 {

    public static void main(String[] args) {
        int result = sum(2,3);
        System.out.println(result);
        result = dif(213,123);
        System.out.println(result);
        double result2=  imp(12,5, 2);
        System.out.println(result2);
        result=inm(55,2);
        System.out.println(result);
    }

    static int sum(int firstnumber, int secondnumber){
        return (firstnumber + secondnumber);
    }

    static int dif(int x, int y){
        return (x-y);
    }

    static double imp(double a, double b, double z){
        return (a/b/z);
    }

    static int inm(int c, int d){
        return (c*d);
    }
}
