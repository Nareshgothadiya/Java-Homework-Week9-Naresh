package javahomeworkweek9;

//create a new array list, add some colours (string) and printout the collection using for each loop.

import java.util.ArrayList;

public class Programme4 {

    public static void main(String[] args) {
        ArrayList<String> cityName = new ArrayList<>();
        cityName.add("London");
        cityName.add("Newyork");
        cityName.add("Tokyo");
        cityName.add("Dubai");
        cityName.add("Singapore");
        cityName.add("Mexico");
        cityName.add("Surat");
        cityName.add("Amreli");
        cityName.add("Adtala");
        for (String cityList : cityName) {
            System.out.println(cityList);
        }
    }
}
