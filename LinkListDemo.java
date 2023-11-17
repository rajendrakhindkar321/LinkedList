import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] s) {
        LinkedList<String> Animals = new LinkedList<>();


        Animals.add("Horse");
        Animals.add("Rhino");
        Animals.add("Tiger");
        Animals.add("Lion");
        Animals.add("Dog");

        System.out.println("LinkedList: " + Animals);

        // update linked list

        Animals.add(0,"Leopard");

        System.out.println("Updated LinkedList: " + Animals);

        // get the elements from the linked list

        String str = Animals.get(3);
        System.out.println("Element at index 3: " + str);

        // change element at index 2
        Animals.set(2, "Hippos");
        System.out.println("Updated element at index 2: " + Animals);

        //Remove element from the linked list
        String str1 = Animals.remove(5);
        System.out.println("Removed element: " + str1);

    }
}
