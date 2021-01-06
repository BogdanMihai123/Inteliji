package lab4;

import com.sun.jdi.Value;

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
        } //3
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

    public int sumwhile(int Value1){
        int sum=0;
        while(Value1<=100){
            sum=sum+Value1;
            Value1++;
        }
        return sum;
    } //suma numerelor pana la 100 prin while

    public void whilenumar(int Value1){
        while(Value1<=100){
            System.out.println(Value1);
            Value1++;
        }
    } //while ex 1;

    public void whilenumar2(int Value1){
        if(Value1>=-100){
            while (Value1>=-100){
                System.out.println(Value1);
                Value1--;
            } }
            else if(Value1<=-100) {
            while (Value1 <=-100) {
                System.out.println(Value1);
                Value1++;
            }
        }
        } //while ex 2

    public void whilebetweennumbers(int Value1, int Value2){
        while (Value1<=Value2){
            System.out.println(Value1);
            Value1++;
        }
    } //while ex 3

    public void whilebetweennumbers2(int Value1, int Value2){
        if (Value1<=Value2){
            while (Value1<=Value2){
                System.out.println(Value1);
                Value1++;
            }
        }else if (Value1>=Value2){
            while (Value1>=Value2){
                System.out.println(Value2);
                Value2++;
            }
        }
    } // while ex. 4

    public void whileevennumbers(int Value1){
        while (Value1<=100){
            if (Value1%2==0){
                System.out.println(Value1);}
            Value1++;
        }
        } // while ex.5

    public void whilenotevennumbers(int Value1){
        while (Value1<=100){
            if (Value1%2==1){
                System.out.println(Value1);}
            Value1++;
        }
    } //while ex.6

    public void whilesumaverage(int Value1, int Value2){
        int count=1;
        long sum=Value1;
        while(Value1<Value2){
            sum=sum+Value1;
            count++;}
        double avg=sum/count;
        System.out.println("Suma este: " + sum + "Media este: "+ avg);
    } //while ex.7

    public double whileseven(int Value1, int Value2) {
        double average;
        double sum = 0;
        int count = 0;
        while (Value1 <= Value2) {
            if (Value1 % 7 == 0) {
                sum = sum + Value1;
                count++;
                            }
            Value1++;
        }
        average = sum / count;
        return average;
    } //while ex.8

    public void whilefibonacci() {
        int r = 0;
        int t = 1;
        int i=1;
        int sum = r + t, sum2;
        System.out.println(r);
        System.out.println(t);
        while (i <= 20) {
            System.out.println(r);
            sum=r+t;
            r=t;
            t=sum;
            i++;
        }
    } // while ex.9
    }




