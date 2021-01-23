package basicJava2;

public class UseEnum {

    // if we want to represent a group of named constants- then we should use ENUM.
    // it was introduced in java 1.5 version
    // every enum constants are public static final internally.
    // that's why enum can be inside or outside of a class but not inside of a method
    // applicable access modifiers outside of a class are - public, default
    // applicable access modifiers inside of a class are - public,static, private, protected
    public  enum DAYS{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY; // here ; semi-colon is optional. we can use without ;
    }

    private enum Level{
        High,Medium,Low
    }

    protected enum Level2{
        Upper,Inner
    }

     enum Level3{
        First,Second,Third

    }

    public static void main(String[] args) {
        System.out.println(DAYS.MONDAY);
        System.out.println(COLOR.red);
    }
}
enum COLOR{
    red,yellow,green,blue;
}
