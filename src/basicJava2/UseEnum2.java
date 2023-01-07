package basicJava2;

public class UseEnum2 {


    public enum COLOR{
        RED,BLUE,GREEN,YELLOW
    }

    public static void main(String[] args) {
        System.out.println(DAYS.january);
        System.out.println(COLOR.RED);
    }

}
enum DAYS{
    january,february,march,april,may
}