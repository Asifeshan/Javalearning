package practice;

public class LearnStringMethod {
    public void learnIndexOf() {
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
// here i am trying to find the index of word planet where it starts.

//  Here the planet word comes two times so if i indicate from where it
// -should start the counting then i can find the index of second planet
        System.out.println(myStr.indexOf("planet", 15));
// another way
        int positionOfPlanet = myStr.indexOf("planet");
        System.out.println(positionOfPlanet);
// if something doesn't exist then the value will return -1
        System.out.println(myStr.indexOf("test"));
//        we can count total index of a string
        System.out.println("length of the string: " + myStr.length());
    }

    public void learnSubString() {
        String str = "JavaPoint";
////        substring the index i am putting will print after that
        String SubStr = str.substring(2);
        System.out.println(SubStr);
////        substring the index starting and ending i am putting will print that.
        String SubStr2 = str.substring(0, 4);
        System.out.println(SubStr2);

//    print word java from the above string
//    length of java word is 4
        String searchWord = "Java";
        int searchWordStartingPosition = str.indexOf("Java");
        String subStringJava = str.substring(searchWordStartingPosition, searchWord.length());
        System.out.println("Search Keyword: "+ subStringJava);


    }
    public  void  length() {
        String txt = "Hello World";
        System.out.println(txt.length());
    }
    public  void replace() {
        String myStr = "Hello";
        System.out.println(myStr.replace('l','p'));

    }
    public  void trim() {
        String myStr = "           Hello World";
        System.out.println(myStr);
        System.out.println(myStr.trim());
    }
    public void charAt() {
//        Return the character on a specific location
        String myStr = "Hello World";
        char result = myStr.charAt(0);
        System.out.println(result);
    }
    public  void ReplaceWord() {
        String myStr = "Hello World Hello";
//        REPLACE 'o' from Hello not the entire word
//        int positionOfO = myStr.indexOf('o',10);
//        String replaceO = myStr.substring(positionOfO,myStr.length());
//        System.out.println(replaceO);

//        Process 1
        String replaceO = myStr.replaceAll("Hello", "Hell");
        System.out.println(replaceO);

//        process 2
        String WithOutO = replaceO.replaceFirst("Hell","Hello");
        System.out.println(WithOutO);

//        process 3
        String replaceLetterO;
        replaceLetterO = myStr.replaceFirst("Hello",
               "Hell");
        System.out.println(replaceLetterO);
//        String replaceWord = myStr.replaceAll("World", "PlanetEarth");
//        System.out.println(replaceWord);
    }
//    Print in a reverse order
    public  void reverseOrder() {
        String str = "Hello";
        String reverseWord = "";
        for (int i = str.length()-1; i>=0; i--) {
            char results = str.charAt(i);
            reverseWord += String.valueOf(results);

        }
        System.out.println(reverseWord);
    }
}