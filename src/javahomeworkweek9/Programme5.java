package javahomeworkweek9;

//Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5 {

    public static void main(String[] args) {
        ArrayList<String>
                names = new ArrayList<String>();

        names.add("Naresh");
        names.add("Virenbhai");
        names.add("Nimeshbhai");
        names.add("Prime");


        System.out.println("Using for loop :");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Using Advanced for loop :");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Using Iterator :");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using while  loop :");
        int index = 0;
        while (names.size() > index) {
            System.out.println(names.get(index));
            index++;
        }
    }
}

