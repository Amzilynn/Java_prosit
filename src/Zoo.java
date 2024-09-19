public class Zoo
{
    Animal [] animals = new Animal[25];
    String name;
    String city;
    int nbrCages ;

    public Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
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


