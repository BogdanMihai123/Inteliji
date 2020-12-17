package lab4;

public class Logic {

    public void printToHundred(int startValue) {
        for (int i = startValue; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printToHundredWhile(int startValue){
        while (startValue<=100){
            System.out.println(startValue);
            startValue++;
        }
    }

    public void printBetweenNumbers(int Value1, int Value2){
        for( int i=Value1; i>=Value2; i--){
            System.out.println(i);
        }
    }

    public void comparison(int Value1,int Value2){
        if(Value1>Value2){
            for(int i = Value2; i<=Value1; i++){
                System.out.println(i);
            }
        }else{
            for(int i=Value1; i<=Value2;i++){
                System.out.println(i);  //ex.4
            }
        }
    }

    public void evennumbers(int Value1) {
        for (int i = Value1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    } //ex.5

    public void notevennumbers(int Value1) {
        for (int i = Value1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    } //ex.6

    public int adition(int Value1){
        int sum=0;
        for(int i=Value1; i<=100; i++){
            sum=sum+i;
        }
        return sum;
    }// ex.7

    public double average(int Value1){
        double sum=0;
        for(int i=Value1; i<=100; i++){
            sum=sum+i;
        }
        double avg=sum/100;
        return avg;
    } // ex.8

    public int sumwhile(int Value1){
        int sum=0;
        while(Value1<=100){
            sum=sum+Value1;
            Value1++;
        }
        return sum;
    } //suma numerelor pana la 100 prin while

    public void minus(int Value1){
        if(Value1>-100){
            for(int i=Value1; i>=-100;i--){
                System.out.println(i);
            }
        }else{
            for (int i=Value1; i<=-100; i++){
                System.out.println(i);
            }
        }
    } //2
}
