package basicJava;

public class O_String_Class {

    public static void stringMethods() {

        String country = "Bangladesh";
        System.out.println(country.toUpperCase());//to make all upper case:
        System.out.println(country.toLowerCase());//to make all lower case:

        String name = " Alex ";
        System.out.println(name.trim());//to remove spaces before and after string value:

    }

    //https://beginnersbook.com/2017/09/java-program-to-reverse-a-string-using-recursion/
    public static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String args) {

        stringMethods();


        String str = "Welcome to Bangladesh";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);

    }





}
