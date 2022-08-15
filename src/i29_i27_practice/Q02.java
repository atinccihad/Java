package i29_i27_practice;

public class Q02 {
    public static void main(String[] args) {
        // String[] list = {"fruits", "vegetables", "meat", "milk"};
        // print array with for each loop
        // print length of each element

        // Part 2:
        // Print all the elements from array using for eachLoop
        // If an element starts with 'v' then quit the loop
        String[] list = {"fruits", "meat", "milk", "vegetables"};

        for (String element : list) {
            System.out.print(element + " : " + element.length() + " ");
        }
        System.out.println("");
        for (String item : list) {
            if (item.startsWith("v")) {
                break;
            }
            System.out.print(item + " ");
        }
    }
}
