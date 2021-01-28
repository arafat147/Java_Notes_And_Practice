package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class H_Throws_Keyword {

    int a;
    int b;

    public static void division() throws Exception{
        //when we can see there might an error in our method, then we can declare throws exception after method name.

        H_Throws_Keyword t1 = new H_Throws_Keyword();
        int x = t1.a = 12;
        int y = t1.b = 0;
        int total = x/y;
    }

    public static void main(String[] args) {
        try{
            H_Throws_Keyword.division();

        }catch(Exception e){
            System.out.println("This is arithmetic exception");
        }




        System.out.println("Hello all, i am from main method!");

    }


}
