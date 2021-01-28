package basicJava3_ExceptionHandling_Final_Finally_Finalize_Throw_Throwable;

public class F_ArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        try{
            int a[] = new int[5];

            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }

}
