import java.util.Scanner ;

public class ZooManagement {

    public static void main(String[] args) {
    int nbrCages;
    String zooName  ;
    Scanner sc = new Scanner(System.in) ;

    /*
    System.out.println("Enter zoo name: ");
    zooName = sc.nextLine();

    System.out.println("enter number of cages");
    nbrCages = sc.nextInt();

    System.out.println (zooName +" contains " + nbrCages +" cages");
*/
    Animal animal1 = new Animal("Felidae","Lion",5,true) ;
    Animal animal2 = new Animal("Felidae","giraffe",5,true) ;

    Animal[] animals= {animal1,animal2};

    Zoo myZoo = new Zoo(animals,"myZoo","tunis",15);

    System.out.println("Display Method");
    myZoo.Display();

    System.out.println(myZoo);

    System.out.println(myZoo.toString());    }


}
