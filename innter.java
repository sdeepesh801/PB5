import org.w3c.dom.ls.LSOutput;

import java.io.FilenameFilter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Product(){}

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class innter {
    public static void main(String[] args) {
//        Predicate<Integer> p1=i -> i%2==0;
//        Predicate<Integer> p2=i -> i>9;
//        System.out.println("AND fun");
//        System.out.println(p1.and(p2).or(p2).negate().test(15));
//        System.out.println(p1.and(p2).test(9));
//        System.out.println(p1.and(p2).test(8));
//        System.out.println(p1.and(p2).test(16));
//        System.out.println("OR fun");
//        System.out.println(p1.or(p2).test(15));
//        System.out.println(p1.or(p2).test(9));
//        System.out.println(p1.or(p2).test(8));
//        System.out.println(p1.or(p2).test(16));
//        System.out.println("NEGATE fun");
//        System.out.println(p1.negate().test(15));
//        System.out.println(p1.negate().test(9));
//        System.out.println(p1.negate().test(8));
//        System.out.println(p1.negate().test(16));

//        Function<Integer,Integer> f1=i->2*i;
//        Function<Integer,Integer> f2=i->i*i*i;
////        System.out.println(f1.andThen(f2).apply(2));
////        System.out.println(f1.compose(f2).apply(2));
////        System.out.println(f1.andThen(f2).andThen(f1).apply(1));
//        System.out.println(f1.compose(f2).compose(f1).andThen(f2).apply(1));
//        System.out.println(f1.compose(f2).andThen(f1).apply(1));

//        Consumer<Integer> c1=i->{
//            System.out.println("C1 is called");
//            if(i%2==0)
//                System.out.println("even");
//        };
//        Consumer<Integer> c2=i->{
//            System.out.println("C2 is called ");
//            if(i%2!=0){
//                System.out.println("odd");
//
//            }
//        };
////        c1.andThen(c2).accept(5);
//        Consumer<String> c1=s -> System.out.println(s+" first");
//        Consumer<String> c2=s -> System.out.println(s+" Second");
//        Consumer<String> c3=s -> System.out.println(s+" Third");
//        Consumer<String> c4=c1.andThen(c2).andThen(c3);
//        c4.accept("Hero");
//        c1.andThen(c2).andThen(c3).accept("Hero");


//        Supplier<String> s1=()->{
//            String otp="";
//            for(int i=0;i<6;i++)
//            otp+=(int)(Math.random()*10);
//            return otp;
//        };
//        System.out.println(s1.get());
//        System.out.println(s1.get());
//        System.out.println(s1.get());
//        System.out.println(s1.get());
//        System.out.println(s1.get());

//        ArrayList<Integer> l=new ArrayList<>();
//        l.add(110);
//        l.add(5);
//        l.add(10);
//        l.add(15);
//        l.add(60);
//        l.add(25);
//        l.add(30);
//        l.add(35);
//        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l2);
//        List<Integer>l3=l.stream().map(i->i+5).collect(Collectors.toList());
//
//        System.out.println(l3);
//        long count=l.stream().filter(i->i>=20).count();
//
//       Comparator<Emp> c = (i1, i2) -> -i1.compareTo(i2);
//        System.out.println(count);
//        System.out.println(l.stream().sorted().collect(Collectors.toList()));
//        System.out.println(l.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList()));
//        System.out.println(l.stream().sorted((i1,i2)->i1.compareTo(i2)));




//        ArrayList<String>l=new ArrayList<>();
//        l.add("Sunny leony");
//        l.add("Kajal aggrawal");
//        l.add("Prabhas");
//        l.add("Anushka shetty");
//        l.add("MAlika shehrawat");
//        Comparator<String> c=(i1,i2)->{
//            int l1=i1.length();
//            int l2=i2.length();
//            if(l1>l2)
//                return -1;
//            else if(l2>l1)
//                return 1;
//            else return i1.compareTo(i2);
//        };
//        System.out.println(l.stream().sorted(c).collect(Collectors.toList()));


//        ArrayList<Integer> A=new ArrayList<>();
//        A.add(67);
//        A.add(70);
//        A.add(45);
//        A.add(9);
//        A.add(34);
//
//        System.out.println(A.stream().min((l1,l2)->-l1.compareTo(l2)).get());
//        System.out.println(A.stream().min((l1,l2)->l1.compareTo(l2)).get());


//        String s="AA";
//        String s1="Bdd";
//        System.out.println(s.compareTo(s1));
//        System.out.println(Integer.compare(25,15));
//
//        List<Product> productsList = new ArrayList<Product>();
//
//        productsList.add(new Product(1,"HP Laptop",25000f));
//        productsList.add(new Product(2,"Dell Laptop",30000f));
//        productsList.add(new Product(3,"Lenevo Laptop",28000f));
//        productsList.add(new Product(4,"Sony Laptop",28000f));
//        productsList.add(new Product(5,"Apple Laptop",90000f));
//        Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x->x.price));  // collecting as list
//        //System.out.println("Sum of prices: "+sumPrices);
//        int sumId = productsList.stream().collect(Collectors.summingInt(x->x.id));
//        System.out.println(sumId);
//        double avg=productsList.stream().collect(Collectors.averagingDouble(x->x.id));
//        System.out.println(avg);
//        Product[] P={
//                new Product(1,"HP Laptop",25000f),new Product(2,"Dell Laptop",30000f),new Product(3,"Lenevo Laptop",28000f)
//        };
//        Stream.of(P);
//
//        "12345_abcdefg".chars().forEach(p -> System.out.println(p));

//        List<Integer> list = new ArrayList<Integer>();
//
//        for(int i = 1; i< 10; i++){
//            list.add(i);
//        }
//        System.out.println(list.toString());
//        List<Integer> evenNumbersList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
//        System.out.print(evenNumbersList);

        List<String> list = new ArrayList<>();

        list.add("bcs");
        list.add("bc");
        list.add("bc");
        System.out.println(list.stream().noneMatch((s) -> s.startsWith("x")));

        Stream<String> s=list.stream();

        Product p=new Product();
        int j=78;
        if((Object)j instanceof Product)
            System.out.println("yess");
    }

}
