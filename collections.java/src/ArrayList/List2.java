package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class List2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");


        //Group of elements(al) add some other elements in (al_duplicate)
        ArrayList al_dup = new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);  //[X, Y, Z, A, B, C, D]

        al_dup.removeAll(al);
        System.out.println("After removing: " + al_dup);  //After removing: []

        //sort---- Collections.sort();

        System.out.println("elements in the arrayList: " + al);   //[X, Y, Z, A, B, C, D]
        Collections.sort(al);
        System.out.println("Element in the array list after sorting:" +  al); //[A, B, C, D, X, Y, Z]

        //reverse order
       Collections.sort(al, Collections.reverseOrder());
        System.out.println("Element in the array list after sorting in reverse order:"  + al);   //[Z, Y, X, D, C, B, A]

        //Shuffing -Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("Elements in the array list after shuffling: " + al);  //[D, B, Z, A, C, Y, X]







    }
}
