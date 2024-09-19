public class Zoo
{
    public static final int MAX_ANIMALS = 25;
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = new Animal[MAX_ANIMALS];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void Display(){

    System.out.println("Zoo Name: " + this.name + ", Location: " + this.city + ", Number of Animals: " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo Name: " + this.name + ", Location: " + this.city + ", Number of Animals: " + this.nbrCages;
    }

    }


