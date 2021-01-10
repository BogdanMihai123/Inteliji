package lab5;

public class lab5 {
    public static void main(String[] args) {
        Logic logic = new Logic();

        int[] myArray = logic.setConsecutiveValuesToArray(1, 100);

//        logic.printArray(myArray);



        /*double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i]; // sum +=myArray[i];

        }
        double average = sum / myArray.length;
//        System.out.println(average);


        int[] secondArray = {3, 5, 5, 2, 3, 4};

        int valueToFind = 5;

        System.out.println(logic.isValueInArray(secondArray, valueToFind));

        int x=1,y=100;

        logic.evenArray(x,y); */

        int[] thirdArray = {1,6,12,24,7,2};
        int[] emptyArray= new int[thirdArray.length];

        int Value=12;
        // logic.Arraywithoutvalue(thirdArray,Value);

        //logic.secondminArray(thirdArray);

        //logic.copyArray(thirdArray,emptyArray);

        // logic.positionArray(thirdArray,Value);

        //String[] newString= {"-","-","-","-","-","-","-","-","-","-"};
        //logic.showArray(newString);

        String[] newString2={"Yes", "No", "Maybe", "Next"};
        String value="BAD";
        System.out.println(logic.valueArray(newString2,value));
    }


}
