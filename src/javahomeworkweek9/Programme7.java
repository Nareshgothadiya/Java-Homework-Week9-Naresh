package javahomeworkweek9;

//Write a Java program to test an array list is empty or not. Define array list with underground tube names

import java.util.ArrayList;

public class Programme7 {

    public static void main(String[] args) {
        arrayListIsEmptyOrNot();
    }

    public static void arrayListIsEmptyOrNot() {
        ArrayList<String> tubeNames = new ArrayList();
        tubeNames.add("Bakerloo");
        tubeNames.add("Jubilee");
        tubeNames.add("Central");
        tubeNames.add("Metropolitan");
        tubeNames.add("Northern");
        tubeNames.add("Victoria");
        tubeNames.add("Picadilly");
        tubeNames.add("Overground");
        tubeNames.add("Circle");

        boolean ans = tubeNames.isEmpty();

        if (ans == true) {
            System.out.println("The Arraylist is Empty");
        } else {
            System.out.println("The Arraylist is Not Empty");
        }
    }
}

