package practice;

public class StringMethod {

    public  void learnFormat() {
        //    “My name is Jonathan and I am 20 years old and my salary is $40000 yearly”
        String name = "Jonatan";
        int age = 20;
        int salary = 40000;

        String s = String.format("My name is %s and I am %d years old and my salary is %d yearly", name, age, salary);
        System.out.println(s);
    }

//    The contains() method checks whether a string contains a sequence of characters.
    public void contains() {
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));
        System.out.println(myStr.contains("e"));
        System.out.println(myStr.contains("Hi"));

    }
    public  void splitArray() {
        String name = "John,Ali,Mathew,Abraham";
        String[] nameArray = name.split(",");
        for (String person : nameArray) {
            System.out.println("Person name is: " + person);
        }

        }

    }
