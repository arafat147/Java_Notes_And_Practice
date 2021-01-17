package basicJava;

public class M_UnaryOperator {

    public static void main(String[] args) {
        //increment: ++a, a++
        //decrement: --a, a--

        int a = 15;
        System.out.println(a++);//answer will be 15 because inside sout(a++) , ++ will not add anything, its for future;
        System.out.println(a);//here it will increase after line 11; answer will be 16.
        a++;// this will increase 1
        ++a;// this will increase 1
        System.out.println(a);
        --a;
        System.out.println(a);
        a--;
        System.out.println(a);
        System.out.println(a--);


    }
}
