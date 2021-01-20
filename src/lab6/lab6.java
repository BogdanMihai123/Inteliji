package lab6;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class lab6 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(1);
        myList.add(21);
        myList.add(3);
        myList.add(4);

        Logic logic= new Logic();

        //logic.printList(myList);
        //logic.addnumbertoList(myList,22);
        //logic.printListfromnumber(myList,3);
        // logic.printreverselist(myList);
        //logic.addnumbertofirstposition(myList,100);
        //logic.printdetailedlist(myList);
        //int max;
        //max= logic.biggestvaluefromlist(myList);
        //System.out.println(max);

        //List<String> Mylist= new ArrayList<>();

       // Mylist.add("YES");
        //Mylist.add("NO");
       // Mylist.add("Maybe");
        //logic.stringList(Mylist,2,"NEVER");

        logic.switchposition(myList,0,1);
    }
}
