import java.util.function.Function;
import java.util.function.Predicate;

public class c{
    public static void main(String[]args){
        int[] A={0,5,10,15,20,25,30,35};
        Predicate<Integer> p1=(n)->n%2==0;
        Predicate<Integer> p2=(n)->n>10;
        Function<Integer,Integer> f1=i->i*i;
//        System.out.println(f1.apply(5));
        Function<String,Integer> f2=s -> s.length();
//        System.out.println(f2.apply("Hello"));
        Function<String,String> f3=s -> s.toUpperCase();
        System.out.println(f3.apply("asd"));
//        for (int x:A) {
//            if(p1.negate().test(x))
//                System.out.println(x);
//        }
    }
}

