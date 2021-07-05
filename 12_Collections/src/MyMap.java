import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Java added successfully");
        }

        languages.put("Java", "a compiled high level, object-oriented, platform independent laguage");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners all purpose symbolic instruction code"));//value is added but not shown
        System.out.println(languages.put("Lisp", "Therein lies madness")); //value is added but not shown

//        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "Java is fun to program")); //value is updated but will still show old value
        System.out.println(languages.get("Java")); //value is updated

        System.out.println("====================");
//        languages.remove("Lisp");

        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        System.out.println(languages.replace("Scala", "this will not be added"));

        // Keys are ordered in the order it was added.
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
