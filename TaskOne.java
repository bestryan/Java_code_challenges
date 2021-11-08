import java.util.*;
import java.lang.*;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("\n--------------------------------[Task One]--------------------------------");
        System.out.println("The program will allow users to store the name and height of each athlete, " +
                "\nFind index by random number, Remove information");
        System.out.println("--------------------------------------------------------------------------");

        /**
         * // Below Class allow user enter athlete's name and height. For faster testing purpose.
         * I have pre-setup 5 athletes details to arraylist.
         TaskOne project = new TaskOne();
         project.Allow_user_to_enter();
         **/

        add_to_list("Ryan", 170);
        add_to_list("Bella", 165);
        add_to_list("Jack", 175);
        add_to_list("Nats", 168);
        add_to_list("Rafi", 178);
        // this is for testing error message
        add_to_list("John", 190);

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Your entered athlete's name are: " + aName);
        System.out.println("Your entered athlete's height(cm) are: " + aHeight);

        // Q4 - find position
        System.out.println("--------------------------------------------------------------------------");
        position_by_number(random.nextInt(5));

        // Q5 - remove
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("Athlete's list: " + aName);
        System.out.println("Please remove athlete from above list by enter his/her name: ");
        remove(userInput.next());
    }


    // Q.1   Declare an ArrayList to store athletes name
    static ArrayList<String> aName = new ArrayList<>();
    // Q.2   Declare an ArrayList to store athletes height
    static ArrayList<Integer> aHeight = new ArrayList<>();
    // Create a Scanner object
    static Scanner userInput = new Scanner(System.in);
    // Create instance of Random class
    static Random random = new Random(); //random number

    /** Below code Class allow user enter athlete's name and height. For faster testing purpose.
     * I have pre-setup 5 athletes details to arraylist.
     * Create class allow user input athletes name and height
     **/
    public void Allow_user_to_enter() {
        for (int i = 0; i < 5; i++) {
            System.out.format("Please enter athlete %d Name: ", i + 1); // loop enter athlete name
            String nam = userInput.next();
            String cap = nam.substring(0, 1).toUpperCase() + nam.substring(1).toLowerCase();
            System.out.format("Please enter athlete %d Height(cm): ", i + 1); // loop enter athlete height
            Integer hei = Integer.valueOf(userInput.next());
            add_to_list(cap, hei);
            if (aName.size() == 5 || aHeight.size() == 5) {
                break; } } // loop will stop when reach 5 elements
        if (aName.size() == 5 || aHeight.size() == 5) {
            System.out.println("\n======[Array is full]======"); } // display array is full message
    }

    /** Q3.	Define a class with two parameters (name and height) to store an athlete’s information into the arrays.
     **/
    public static void add_to_list(String name, Integer height) {
        if (aName.size() < 5 && aHeight.size() < 5) {
            aName.add(name);
            aHeight.add(height);
            System.out.println("name: "+ name +" height: "+ height + " -- [added successfully]");
        } else {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Attention: ===[ Array is full ]===");
        }
    }

    /** Q4.	Define a class with one parameter (position) to find an athlete by the position
     * stored in the array and to return the details of athlete found.
     **/
    public static void position_by_number(Integer num) {
        System.out.print("Base on random number "+ "["+num+"]"  +", athlete's position display below\nAthlete Name: " +
                aName.get(num) + "\nAthlete Height: " + aHeight.get(num) +"cm");
    }

    /** Q5.	Define a class with one parameter (name) to remove an athlete’s information from the arrays.
     * Class would remove athlete's name and height accordingly by user's input.
     **/
    public static void remove(String name){
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (int i = 0; i < aName.size(); i++) {
            if (Objects.equals(cap, aName.get(i))) {
                aName.remove(aName.get(i));
                aHeight.remove(aHeight.get(i));
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("["+cap+"]" + " Removed successfully");
                System.out.println("New Name List: " + aName);
                System.out.println("New Height List: " + aHeight); } }
        if (aName.size() == 5){
            System.out.println("!!! Not found !!!"); } }

}



