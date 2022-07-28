import java.security.KeyStore;
import java.util.*;


public class Main {

    static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfStudents, V value) {
        List<K> listOfKeys = null;

        if(mapOfStudents.containsValue(value)) {

            listOfKeys = new ArrayList<>();

            for (Map.Entry<K, V> entry : mapOfStudents.entrySet()) {
                if (entry.getValue().equals(value)) {
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        return listOfKeys;
    }
    public static void main(String[] args){

        HashMap<String, String> classInfo = new HashMap<String, String>();
        Students Tom = new Students("Tom","Yoga");
        Students Anna = new Students("Anna", "Karate");
        Students Erica = new Students("Erica","Yoga");

        classInfo.put(Tom.getName(), Tom.getTakesclass());
        classInfo.put(Anna.getName(), Anna.getTakesclass());
        classInfo.put(Erica.getName(), Erica.getTakesclass());

        List<String> listOfKeys = Main.getAllKeysForValue(classInfo,"Yoga");

        System.out.println(listOfKeys);
    }

}
