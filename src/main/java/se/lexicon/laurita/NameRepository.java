package se.lexicon.laurita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.*;

public class NameRepository {


    //Field variable - Variable in Class
    private static String[] names = {"Mary jane", "Brad Jon", "Erik Smart"};

    public static void main(String[] args) {
        System.out.println("Initial Array: \n" + Arrays.toString(names));
        String[] names = new String[]{"Mary jane", "Brad Jon", "Erik Smart"};

        //new name to add
        String newName = "Jack Mike";
        //convert to array list
        List<String> nameList = new ArrayList<String>(Arrays.asList(names));
        //add new name to list
        nameList.add(newName);
        //convert Arraylist back to array
        nameList.toArray(names);
        //prints the change done
        String[] expandedArray = Arrays.copyOf(names, names.length + 1);
        System.out.println("\nArray with value  " + newName + " was added:\n" + Arrays.toString(expandedArray));

        //Element added to the Array
        expandedArray[expandedArray.length - 1] = newName;
        //Replacing null with the newly created name
        names = expandedArray;
        System.out.println(Arrays.toString(names));
        //converts String Array to list
        List<String> namesList = Arrays.asList(names);

        //find a name to find
        String nameToFind = "Brad Jon";


        //find a the name
        String nameFound = null;
        for (int i = 0; i < names.length; i++) {
            if (nameToFind.equalsIgnoreCase(names[1])) {
                nameFound = nameToFind;
                System.out.println("Found");
                break;
            } else {
                System.out.println("not Found");
            }

        }
        System.out.println("nameFound is: " + nameFound);

    }

    public static int getSize() {
        String[] names = new String[]{"Mary jane", "Brad Jon", "Erik Smart"};
        System.out.println("names = " + names.length);

        return names.length;
    }

    public static void clear() {
        names = new String[0];
        System.out.println("names = " + names);

    }

    public static boolean add(final String fullName) {
        return true;

    }
    public static boolean update(final String original, final String updatedName){
        return true;
    }
    public static String[] findByFirstName(final String firstName){

        System.out.println("firstName = " + firstName);
        return findByFirstName(firstName);
    }


}


       /* String JackMike =  "Mary jane";
        if (namesList.contains(JackMike)) {
            System.out.println("names " + JackMike + " is present in string array");
        }else
            System.out.println("names " + JackMike + " is not present in string array");
        }
        boolean found = false;



    }


   //public static int getSize(){ }
*/

