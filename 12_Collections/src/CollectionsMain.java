import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {


    /**
     * So far: covered three of Java's list types (list interface, array list, and liked list)
     * These form part of the Java collections framework which also includes sets, maps, trees,
     * and queues.
     *
     * At the top level of collections framework is the collections class. This exposes static
     * methods that can operate on collections; they can also return collection objects such as
     * list method.
     *
     * The interfaces in the collection framework allow the framework to be extended. They also
     * define methods for all the fundamental operations that are required for various collections.
     *
     * One design goal for collections framework was; it should be good interoperability amongst
     * various collections, not just the ones included in the framework. But literally anything
     * that may be created in the future.
     *
     * Arrays aren't included in the collections framework, but the framework does include methods
     * that enable collections to be moved into arrays and vice versa; also methods to allow arrays
     * to be viewed as collections.
     *
     * The core components of collections framework are interfaces. These are abstract types, that
     * represent collections. Also included is aggregate operations.
     *
     * --------------
     *
     * Map interfaces:
     * Map interface is part of collections framework even though it isn't a true collections. Maps
     * have replaced the obsolete dictionaries abstract class.
     *
     */

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympic", 8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        List<Theatre.Seat> reversSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reversSeats);
        printList(reversSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for A02");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is: " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is: " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted SeatCopy");
//        printList(seatCopy);

//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        Collections.copy(newList, theatre.seats); //will result in an array

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=======================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for(int i = 0; i < list.size() -1; i++) {
//            for(int j = i+1; j < list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i , j);
//                }
//            }
//        }
//    }
}
