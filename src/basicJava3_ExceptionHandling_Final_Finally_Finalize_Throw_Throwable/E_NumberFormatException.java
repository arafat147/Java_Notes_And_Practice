package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class E_NumberFormatException {

    public static void main(String[] args) {


        String ssn = "123456";
        int newSsn = Integer.parseInt(ssn);
        System.out.println(newSsn);

        try{
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }

    }

