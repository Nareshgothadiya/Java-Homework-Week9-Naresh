package javahomeworkweek9;

//6. Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;
import java.util.List;


public class Programme6 {

    public static void main(String[] args) {
        Programme6 obj = new Programme6();
        obj.retrievAnElementFromArrayList();
    }
    public void retrievAnElementFromArrayList() {
        ArrayList<String> javaTeam = new ArrayList<>();
        javaTeam.add("Naresh");
        javaTeam.add("Virenbhai");
        javaTeam.add("Nimeshbhai");
        javaTeam.add("Savitri");
        javaTeam.add("Vidhi");
        javaTeam.add("Palakben");
        javaTeam.add("Nimishaben");

        System.out.println(javaTeam.get(5));
    }
}


