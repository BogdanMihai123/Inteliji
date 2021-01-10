package lab5;

public class Logic {

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void populateArrayWithValues(int[] array, int maxValue) {
        for (int i = 0; i < maxValue; i++) {
            array[i] = i + 1;
        }
    }

    public int[] setConsecutiveValuesToArray(int minim, int maxValue) {
        int[] array = new int[maxValue];
        for (int i = minim - 1; i < maxValue; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; // sum +=myArray[i];

        }
        return sum / array.length;
    } // array ex.4

    public boolean isValueInArray(int[] array, int ceva) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ceva)
                return true;
        }
        return false;
    }

    public void evenArray(int min, int max) {
        int[] array = new int[max];
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                array[i] = i;
            }
        }
        for (int i = 0; i < max; i++) {
            if (array[i] != 0)
                System.out.println(array[i]);
        }


    } // Array ex.3

    public void Arraywithoutvalue(int[] array, int ceva) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ceva) {
                System.out.println(array[i]);
            }

        }
    } // Array ex.8

    public void secondminArray(int[] array){
        int min=10000000;
        int min2=10000000;
        for(int i=1;i<array.length; i++){
            if(array[i]<min){
                min2=min;
                min=array[i];
            }else if(array[i]<min2){
                min2=array[i];
            }
        }
        System.out.println(min2);
    } // array ex 9

    public void copyArray(int[] array1, int[] array2){
        for(int i=0; i<array1.length;i++){
            array2[i]=array1[i];
        }
        for (int i=0; i<array2.length;i++){
            System.out.println(array2[i]);
        }
    } // array ex.10

    public void positionArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println(i);
            }
        }

} // array ex.6

    public void showArray(String[] array){
        for(int i=1; i<=10;i++){
            for(int j=0; j<array.length;j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }
    } // array ex.7

    public boolean valueArray(String[] array, String Value){
        for(int i=0;i<array.length;i++){
            if (array[i]==Value){
                return true;
            }
        } return false;
    } // array ex.5

    public void insertposition(int[] array, int value, int value2){
        for(int i=0; i<array.length;i++){
            if(i==value){
                array[i]=value2;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    } // array optional ex.1

    public void minmaxArray(int[] array){
        int min=array[0];
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }else if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Maximul este:"+ max+ "Minimul este:"+min);
    } // array optional ex.2

    public void reverseArray(int[] array, int[] array2){
        int i=array.length-1;
        int j=0;
        while (i>=0){
            array2[j]=array[i];
            i--;
            j++;
        }
        for (int t=0; t<array2.length; t++){
            System.out.println(array2[t]);
        }
    } // array optional ex.3
}



