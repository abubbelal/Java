import java.lang.management.MemoryManagerMXBean;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericsMain {


    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        System.out.println("######################################################################");

        Football joe = new Football("Joe");
        Baseball pat = new Baseball("Pat");
        Soccer beck = new Soccer("Beck");

        Team<Football> adelaide = new Team<>("Adelaide");
        adelaide.addPlayer(joe);
//        adelaide.addPlayer(pat);
//        adelaide.addPlayer(beck);

        Team<Baseball> baseballTeam = new Team<>("New York Knicks");
        baseballTeam.addPlayer(pat);

        Team<Soccer> brokenTeam = new Team<>("PFG");
        brokenTeam.addPlayer(beck);

        Team<Football> Toronto = new Team<>("Toronto FC");
        Football bank = new Football("Bank");
        Toronto.addPlayer(bank);

        Team<Football> germany = new Team<>("Germany");
        Team<Football> france = new Team<>("France");

        germany.matchResult(france, 1,0);
        germany.matchResult(adelaide,5,2);

        adelaide.matchResult(france,2,5);
        adelaide.matchResult(germany, 1,4);

        System.out.println("Rankings");
        System.out.println(adelaide.getName() + ": " + adelaide.ranking());
        System.out.println(Toronto.getName() + " : " + Toronto.ranking());
        System.out.println(germany.getName() + " : " + germany.ranking());
        System.out.println(france.getName() + " : " + france.ranking());


        System.out.println(adelaide.compareTo(Toronto));
        System.out.println(adelaide.compareTo(france));
        System.out.println(france.compareTo(germany));


        System.out.println(adelaide.numPlayers());

        System.out.println("######################################################################");
        League<Team<Football>> footballLeague = new League<>("CFL");

        footballLeague.add(Toronto);
        footballLeague.add(france);
        footballLeague.add(germany);
        footballLeague.add(adelaide);
//        footballLeague.add(baseballTeam); //will return an error since it's a different generic type

        footballLeague.showLeagueTable();
    }

    private static void printDoubled(ArrayList<Integer> n) {
//        for(Object i : n) {
//            System.out.println((Integer) i * 2);
//        }

        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}
