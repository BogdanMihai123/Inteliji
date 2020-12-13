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
        printmodel();
        result2=med(3,5,5);
        System.out.println();
        System.out.println(result2);
        printmodel2();
        result=rest(10,3);
        System.out.println(result);
        result2=celsius(124);
        System.out.println(result2);
        result2=distance(100);
        System.out.println(result2);
        speed(5000,0,0,1);
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

    public static void printmodel(){
        System.out.println(   "     J    a    v     v   a\n" +
                "     J   a a    v   v   a a\n" +
                " J   J  aaaaa    v v   aaaaa\n" +
                "  JJ   a    a     v    a    a" ); //3
    }

    static double med(double f, double g, double h){
        return ((f+g+h)/3) ; //4
    }

    public static void printmodel2(){
        System.out.println("  +\"\"\"\"\"+\n" +
                "[ | o o | ]\n" +
                "  |  ^  |\n" +
                "  | '_' |\n" +
                "  +-----+\n" +
                " "); //5
    }

    static int rest(int m, int n){
        return(m%n);//6
    }

    static double celsius(double F){
        double C;
        C= (5.0 / 9) * (F - 32);
        return C; //7
    }

    static double distance(double I){
        double M;
        M=I*0.0254;
        return M; //8
    }

    public static void speed(double distance,int seconds, int minutes, int hour){
        double mps = distance/((hour*3600)+(minutes*60)+seconds);
        System.out.println(mps);
        double kph = mps* 3.6;
        System.out.println(kph);
        double mlph = kph/1.609;
        System.out.println(mlph); //9 dar nu sunt sigur

    }
}
