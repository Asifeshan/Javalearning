package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    List<String> myList;
    String[] myArray;
//    List<String> list;
////    here i have declared it in global level so all method can access.
//      String[] array;
//      here i have declared the array at global level so all method can access
    public void convertArrayToList() {
//        List<String> myList;
//        String[] myArray;

        myArray = new String[]{"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(myArray));
//        Here on top Arrays.toString(Name of the Array) we can use to print an array
//        convert array to list.
//        List<String> list = new ArrayList<>(); is the syntax that will create method-
//        -body to create array to list. but we have to do a for loop to do so.
//        for(datatype preferName : NameOfTheArray)
         myList = new ArrayList<>();
        for(String language : myArray) {
            myList.add(language);
        }
//        now I am trying to print the list identical before manipulation
        System.out.println("Printing list: " + myList);
//        Now I will do manipulation and adding value to list
        myList.add("Ruby");
        myList.add("Visual Basic");
        System.out.println("Printing List after adding new language: " + myList);
    }
    public void convertListToArray() {
        myArray = myList.toArray( new String[myList.size()]);
//      To convert list to array this is the syntex and also i need to use
//        - array data type [list.size() means length of the array ]
        System.out.println("Printing Array upon converting from list: " + Arrays.toString(myArray));
    }
}
