package lab2.AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private int healthlevel;
    private int hungerlevel;
    private int moodlevel;
    private String FavouriteFood;
    private String FavouriteReactionalActivity;

    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getage(){
        return age;
    }

    public void setAge(int age){
        this.age= age;
    }

    public int gethealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel){
        this.healthlevel=healthlevel;
    }

    public int gethungerlevel(){
        return hungerlevel;
    }

    public void setHungerlevel(int hungerlevel){
        this.hungerlevel=hungerlevel;
    }

    public int getmoodlevel(){
        return moodlevel;
    }

    public void setMoodlevel(int moodlevel){
        this.moodlevel=moodlevel;
    }

    public String getfavouritefood(){
        return FavouriteFood;
    }

    public void setFavouriteFood(String FavouriteFood){
        this.FavouriteFood=FavouriteFood;
    }

    public String getfavouriteReactionalActivity(){
        return FavouriteReactionalActivity;
    }

    public void setFavouriteReactionalActivity(String FavouriteRecreationaActivity){
        this.FavouriteReactionalActivity=FavouriteRecreationaActivity;
    }


}
