package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal myDog = new Animal();
        Adopter theadopter = new Adopter();
        AnimalFood  newfood = new AnimalFood();
        RecreationActivity newactivity= new RecreationActivity();
        Veterenariar newvet = new Veterenariar();

        myDog.setName("koko");
        System.out.println(myDog.getname());
        myDog.setAge(2);
        System.out.println(myDog.getage());
        theadopter.setAdoptername("GIONI");
        System.out.println(theadopter.getadoptername());
        newfood.setAvailability("NO STOCK");
        System.out.println(newfood.getAvailability());
        newactivity.setName1("WALKING");
        System.out.println(newactivity.getName1());
        newvet.setVetname("HORHE");
        System.out.println(newvet.getVetname());
    }
}
