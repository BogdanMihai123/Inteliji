package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int readInt(){
        int x = 0;
        boolean read = true;
        while(read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public double readIntdouble(){
        double x = 0;
        boolean read = true;
        while(read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextDouble();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return  x;
    }

    public long readIntlong(){
        long x = 0;
        boolean read = true;
        while(read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextLong();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return  x;
    }

    public void readarray(int[] array, int position){
        int x;
        for (int i=0; i<position;i++){
            Scanner scanner= new Scanner(System.in);
            x=scanner.nextInt();

        }
    } // ex.3

    public int readInt4(){
        int x = 0;
        boolean read = true;
        while(read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valore: ");
            try {
                x = scanner.nextInt();

            } catch (InputMismatchException e) {
                // System.out.println("Tipul valorii introduse nu este corect.");
                read = false;
            }
        }
        return x;
    } //ex .4



}

