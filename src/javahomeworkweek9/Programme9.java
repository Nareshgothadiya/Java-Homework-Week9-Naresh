package javahomeworkweek9;

//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class Programme9 {

    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.hashMapObject();

    }

    public void hashMapObject() {
        Map<Integer, String> villageList = new HashMap<>();
        villageList.put(1, " Adtala");
        villageList.put(2, " Amreli");
        villageList.put(3, " Rajkot");
        villageList.put(4, " Surat");
        villageList.put(5, " Bhavnagar");
        villageList.put(6, " Junagadh");
        villageList.put(7, " Botad");

        for (Map.Entry<Integer, String> district : villageList.entrySet()) {
            System.out.println(district);
        }
    }
}
