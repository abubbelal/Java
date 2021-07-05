package MySets;

public class DogMain {

    public static void main(String[] args) {
        Labradaor rover = new Labradaor("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));

    }

}
