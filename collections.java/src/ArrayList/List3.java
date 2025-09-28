package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class List3 {

    public static void main(String[] args) {


        //Array convert to the arrayList

        String arr[] = {"Dog", "Cat", "Elephant"};  // string array
        for(String value : arr)
        {
            System.out.println(value);
        }

        //convert array to array list
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);   //[Dog, Cat, Elephant]
    }
}
