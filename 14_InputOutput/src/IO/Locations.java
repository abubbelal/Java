package IO;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException { // no need to create catch block since the method throws exception the caller has to handle it
//        FileWriter localFile = null;
//        try {
//            localFile = new FileWriter("locations.txt");
//            for(Location location : locations.values()) {
//                localFile.write(location.getLocationID() + ": " + location.getDescription() + "\n");
////                throw new IOException("TESTing exception thrown while writing"); //not good to keep test exceptions in code, ok for debugging
//            }
////        } catch (IOException e) {
////            System.out.println("IN catch block");
////            e.printStackTrace();
//        } finally {
////            try {
//                if (localFile != null) {
//                    System.out.println("Closing localFile");
//                    localFile.close(); //very important to close the stream once finished using it
//                }
////            }
////            } catch (IOException e) {
////                System.out.println("Closing stream failed");
////                e.printStackTrace();
////            }
//        }

        /**
         * Try with resources was introduced with Java 7. Has some great advantages, automatically closes the stream
         * regardless of if the code executes normally or with exception. It does behave differently to the code above.
         * The difference is when an exception is thrown when closing the stream in addition to an error in the try
         * block in addition to an error in the try block.
         *
         * In the try finally the first exception would be hidden if there was an exception in the finally. While in
         * this method the first exception would be visible.
         */
        try (FileWriter localFile = new FileWriter("locations.txt");
        FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location location : locations.values()) {
                localFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            }
        }
    }

    static {

//        Map<String, Integer> tempExit = new HashMap<String, Integer>();
//        locations.put(0, new Location(0, "Java is fun",null));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 2);
//        tempExit.put("E", 3);
//        tempExit.put("S", 4);
//        tempExit.put("N", 5);
//        locations.put(1, new Location(1, "Python is fun",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 5);
//        locations.put(2, new Location(2, "Javascript is fun",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("W", 1);
//        locations.put(3, new Location(3, "C++ is fun",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("N", 1);
//        tempExit.put("W", 2);
//        locations.put(4, new Location(4, "C# is fun",tempExit));
//
//        tempExit = new HashMap<String, Integer>();
//        tempExit.put("S", 1);
//        tempExit.put("W", 2);
//        locations.put(5, new Location(5, "C is not fun",tempExit));

//        Scanner scanner = null;
        try(Scanner scanner = new Scanner(new FileReader("locations_big.txt"))) {
//            scanner = new Scanner(new FileReader("locations_big.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } finally {
//            if(scanner != null) {
//                scanner.close();
//            }
//        }

        //now reading the exits
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {
//            scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()){
                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction,destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } finally {
//            if(scanner != null) {
//                scanner.close();
//            }
//        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
