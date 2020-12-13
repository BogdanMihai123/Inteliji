package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal myDog = new Animal();
        Adopter theadopter = new Adopter();
        AnimalFood  newfood = new AnimalFood();
        RecreationActivity newactivity= new RecreationActivity();
        Veterenariar newvet = new Veterenariar();

        System.out.println(myDog.FavouriteFood);
        System.out.println((theadopter.name));
        System.out.println(newfood.price);
        System.out.println(newactivity.name3);
        System.out.println(newvet.name);

    }
}
