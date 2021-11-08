import java.util.*;
import java.lang.*;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("\n--------------------------------[Task Three]--------------------------------");
        System.out.println("The program combine two arraylist in one and allow users to find an athlete by name using binary search");
        System.out.println("--------------------------------------------------------------------------");

        /**
         * // Below Class allow user enter athlete's name. For faster testing purpose, I have pre-setup 5 athletes details to arraylist.
         TaskThree project = new TaskThree();
         project.Allow_user_to_enter();
         **/

        add_to_list_name("Ryan");
        add_to_list_name("Bella");
        add_to_list_name("Jack");
        add_to_list_name("Nats");
        add_to_list_name("Rafi");
        // this is for testing error message
        add_to_list_name("John");

        //Replace the two arrays with one array
        System.out.println("--------------------------------------------------------------------------");
        Comb.add(String.valueOf(aName));
        Comb.add(String.valueOf(aHeight));
        System.out.println("Your entered athlete's name & height(cm) are: " + Comb);

        //Replace the sequential access algorithm to operate on the arrays with a binary search algorithm.
        System.out.println("--------------------------------------------------------------------------");
        Collections.sort(aName);
        System.out.println("Sorted athlete's list: " + aName);
        System.out.println("Please enter athlete's name to find index by using binary search: ");
        binary_search(userInput.next());

    }

    // Define data structure & create TaskThree attributes
    int hRyan, hBella, hJack, hNats, hRafi;

    // Constructor for athletes height Int
    TaskThree() {
        // pre-set the initial value for the TaskThree attributes
        hRyan = 170;
        hBella = 165;
        hJack = 175;
        hNats = 168;
        hRafi = 178;
    }

    // Declare a combined ArrayList to store athletes name & height
    static ArrayList<String> Comb = new ArrayList<>();
    // Declare an ArrayList to store athletes name
    static ArrayList<String> aName = new ArrayList<>(5);
    // Declare an ArrayList to store athletes height
    static ArrayList<Integer> aHeight = new ArrayList<>(5);
    // Create a Scanner object
    static Scanner userInput = new Scanner(System.in);
    // Create instance of Random class
    static Random random = new Random(); //random number


    /**
     * Below code Class allow user enter athlete's name and height. For faster testing purpose, I have pre-setup 5 athletes details to arraylist.
     * Create class allow user input athletes name and height
     **/
    private void Allow_user_to_enter() {
        for (int i = 0; i < 5; i++) {
            System.out.format("Please enter athlete %d Name: ", i + 1); // loop enter athlete name
            String nam = userInput.next();
            String cap = nam.substring(0, 1).toUpperCase() + nam.substring(1).toLowerCase();
            System.out.format("Please enter athlete %d Height(cm): ", i + 1); // loop enter athlete height
            Integer hei = Integer.valueOf(userInput.next());
            add_to_list(cap, hei);
            if (aName.size() == 5 || aHeight.size() == 5) {
                break;
            }
        } // loop will stop when reach 5 elements
        if (aName.size() == 5 || aHeight.size() == 5) {
            System.out.println("\n======[Array is full]======");
        } // display array is full message
    }

    /**
     * Define a class to store an athlete’s information into the arrays with two parameter data (name & height).
     **/
    public static void add_to_list(String name, Integer height) {
        if (aName.size() < 5 && aHeight.size() < 5) {
            aName.add(name);
            aHeight.add(height);
            System.out.println("name: " + name + " height: " + height + " -- [added successfully]");
        } else {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Attention: ===[ Arraylist is full ]===");
        }
    }

    /**
     * Replace the two parameters (name and height) with one parameter(name). Use the data structure to describe the parameter data.
     */
    public static void add_to_list_name(String name) {
        // Create an object of class Main (This will call the constructor)
        TaskThree heights = new TaskThree();
        if (aName.size() < 5) {
            if (name.equals("Ryan")) {
                aName.add(name);
                aHeight.add(heights.hRyan);
                System.out.println("name: " + name + " -- [added successfully]");
            } else if (name.equals("Bella")) {
                aName.add(name);
                aHeight.add(heights.hBella);
                System.out.println("name: " + name + " -- [added successfully]");
            } else if (name.equals("Jack")) {
                aName.add(name);
                aHeight.add(heights.hJack);
                System.out.println("name: " + name + " -- [added successfully]");
            } else if (name.equals("Nats")) {
                aName.add(name);
                aHeight.add(heights.hNats);
                System.out.println("name: " + name + " -- [added successfully]");
            } else if (name.equals("Rafi")) {
                aName.add(name);
                aHeight.add(heights.hRafi);
                System.out.println("name: " + name + " -- [added successfully]");
            }
        } else {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Attention: ===[ Arraylist is full ]===");
        }
    }

    /**
     * Change the class to find an athlete by name:
     * Replace the sequential access algorithm to operate on the arrays with a binary search algorithm.
     **/
    public static void binary_search(String name) {
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        int i = Collections.binarySearch(aName, cap);
        if (i >= 0)
            System.out.println("Athlete found at index: " + i);
        else
            System.out.println("!!! Not found !!!");
    }

}



