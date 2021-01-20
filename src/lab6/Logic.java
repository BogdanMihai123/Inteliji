package lab6;

import java.util.List;

public class Logic {

    public void printList(List<Integer> myList){
        for (int i=0;i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    } // list ex.1

    public void addnumbertoList(List<Integer> myList, int number){
        myList.add(number);
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    } // list ex.2

    public void printListfromnumber(List<Integer> myList, int number){
        for( int i=number;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    } //list ex.3

    public void printreverselist(List<Integer> myList){
        for(int i=myList.size()-1;i>=0;i--){
            System.out.println(myList.get(i));
        }
    } //list ex.4

    public void addnumbertofirstposition(List<Integer> Mylist, int number){
        Mylist.add(0,number);
        Mylist.remove(1);
        for (int i=0; i<Mylist.size();i++){
            System.out.println(Mylist.get(i));
        }
    } // list ex.6

    public void printdetailedlist(List<Integer> mylist){
        for (int i=0; i<mylist.size();i++){
            System.out.println("Pe pozitia" + " " + i + " "+"este valoarea" + " " + mylist.get(i));
        }
    } // list ex.7

    public int biggestvaluefromlist(List<Integer> mylist){
        int max=mylist.get(0);
        for (int i=1;i<mylist.size();i++){
            if (mylist.get(i)>max){
                max=mylist.get(i);
            }
        }
        return max;
    } //list ex.8

    public void stringList(List<String> myList, int number, String valoare){
        myList.add(number,valoare);
        for (int i=0; i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    } // list ex. 5

    public void switchposition(List<Integer> myList, int position1, int position2){
        int aux, val1, val2;
        val1=myList.get(position1);
        val2=myList.get(position2);
        aux=val1;
        val1=val2;
        val2=aux;
        myList.add(position1,val1);
        myList.add(position2,val2);
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
