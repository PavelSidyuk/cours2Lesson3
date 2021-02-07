import java.util.*;

public class PhoneDirectory {
    Map<String, ArrayList<String>>numb;


    public PhoneDirectory () {
        numb = new HashMap<>();
    }

    public void add (String name, String number){
        if (numb.containsKey(name)){
            numb.get(name).add(number);
        }
        else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            numb.put(name,numbers);
        }
    }

    public ArrayList<String> getNumb(String name){ return numb.get(name);}
}