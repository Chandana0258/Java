package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {


        //Declare arraylist

//    ArrayList al =new ArrayList();  // it will store heterogeneous data
//    AraryList<Integer>  al = new ArrayList<Integer>();  // only store homogenous data integer number
//    ArrayList<String> al = new ArrayList<String>();   // only store string data


            ArrayList al = new ArrayList();

            //Add new elements to the arrayList
            al.add(100);
            al.add("Python");
            al.add(25.89);
            al.add('A');
            al.add(true);
            System.out.println(al);  //[100, Pyhton, 25.89, A, true]

        //size
        System.out.println("Number of elements in array lists " + al.size());

        //remove
        al.remove(0);         // remove the index position
           //   [Pyhton, 25.89, A, true]

        al.remove("Python");     // remove the element
        System.out.println("After the remove the index of element : " + al);     //[25.89, A, true]

        //insert new element in middle  array
        al.add(1, "Java");
        al.add(2,500);
        System.out.println("After the insertion: " + al);  // [25.89, Java, 500, A, true]


        //retrive the specfice value of the array list

        System.out.println(al.get(3)); // A  , here 3 is index of the element/object


        //change/replace the elments
        al.set(1,"DSA");
        System.out.println("After the replace with new value"+ al);

        //search the elements -- contains();  returs--True/ False
        System.out.println(al.contains("DSA"));  //true
        System.out.println(al.contains("Java"));   //false

        //isEmpty()
      System.out.println(al.isEmpty());  //false



        //Read the data of the array List 3 approach
        // 1] for loop
        System.out.println("Reading elements using for loop");
        for(int i=0; i<al.size(); i++)
        {
           System.out.println(al.get(i));
        }

        // 2] for..each  loop
  /*      for(Object e:al) {
           System.out.println(e);
        }   */

        //3] iterator()
        System.out.println("Reading elements using iterator method");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }
        }
    }

