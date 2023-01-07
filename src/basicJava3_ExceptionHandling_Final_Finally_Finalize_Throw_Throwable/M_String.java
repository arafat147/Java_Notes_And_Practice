package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class M_String {

    // String is a datatype which value is a sequence of characters
    // String is also a class.
    // https://www.w3schools.com/java/java_ref_string.asp


    public static void main(String[] args) {


        String foodName = "Chicken Biriyani";
        System.out.println(foodName.length());// to get the length of a string
        System.out.println(foodName.equals("chicken biriyani"));// to compare a String value with another.
        System.out.println(foodName.equalsIgnoreCase("chicken biriyani"));// to ignore case of a string and compare with another string.
        System.out.println(foodName.charAt(7));// to get what character is in number 8. the count starts from 0.
        System.out.println(foodName.substring(5)); // is the starting point of creating a new string. it counts from 1 as C and cancels up to k. then prints en biriyani in the cnsole.
        System.out.println(foodName.substring(4, 10));
        System.out.println(foodName.isEmpty());// to check if a string value is empty or not. it returns true/false value


    }


}
