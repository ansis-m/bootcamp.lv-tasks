import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String[] array = {"white", "red", "blue", "green", "black", "purple", "yellow"};

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        for(String color : array) //copy colors from the array to the ArrayList
            colors.add(color);

        colors.remove(2); //remove the 3rd element
        colors.add("pink"); //add a new color at the end of the list
        colors.add(0, "brown"); //add a new color at the beginning of the list

        System.out.println("\n***COLORS IN THE LIST***");
        for(String color : colors)
            System.out.println(color); //output all values of the list

        List<String> colorsSublist = colors.subList(2, 5);

        System.out.println("\n***COLORS IN THE SUBLIST***");
        for(String color : colorsSublist)
            System.out.println(color);
    }
}


// 1. declare and initialize String array with 7 arbitrary colors.
// 2. Create new list "colors" (ArrayList) of type String
// 3. Copy/add all elements from String array to colors list
// 4. Remove 3rd element from colors list
// 5. Add new color at the end of the colors list
// 6. Add new color at the beginning of the colors list
// 7. Loop through colors list and output all values (use for each loop)
// 8. Create new list (colorsSublist) which will be sublist of the colors list (will contain elements from
// index 2 to index 5)
//    (hint: take a look at List interface and find a method which you can use to achieve this)
// 9. Use for loop to output each element of colorsSublist list
