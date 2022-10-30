package javahomeworkweek9;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
// Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programme8 {
    public static void main(String[] args) {
        Programme8 obj = new Programme8();
        obj.hashSetValue();

    }

    public void hashSetValue() {
        Set<Integer> number = new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);

        Iterator itr = number.iterator();

        while ((itr.hasNext())) {
            System.out.println(itr.next());
        }
    }
}
