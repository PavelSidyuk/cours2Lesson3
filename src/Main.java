import java.util.*;

public class Main {
    public static  void main (String[] args) {

        String[] words = {"cat", "dog","elephant", "tiger", "dog", "elephant"};
        Set<String> collectionWords = new HashSet<>(Arrays.asList(words));
        System.out.println(collectionWords);
        numbWords(words);


        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Ivanov", "555543376");
        directory.add("Petrov", "849495021");
        directory.add("Sidorov", "595969388");
        directory.add("Ivanov", "556677433");
        System.out.println(directory.getNumb("Ivanov"));



    }
    public static void numbWords (String[] args) {
        Map<String, Integer> numbWords = new HashMap<>();

        for (String s : args) {

            if (!numbWords.containsKey(s)) {
                numbWords.put(s, 1);
            } else {
                numbWords.put(s, numbWords.get(s) + 1);
            }
        }
        System.out.println(numbWords);

    }


}
