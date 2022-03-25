import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

class stu{
    String fname;
    String lname;
    int id;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public stu(){

    }
    public stu(String fname, String lname, int id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "stu{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                '}';
    }



}
public class trail {
    public static List<stu> l1=new ArrayList<>();

    public static void main(String[] args) {
        stu s1=new stu("Deep","sha",4);
        stu s2=new stu("Deep","agrwl",2);
        stu s3=new stu("kes","sha",3);

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
//        stu stu1 = new stu();
//        System.out.println(Integer::min);

//        Comparator<stu> stuComparator = Comparator.comparing(stu::getFname).thenComparing(stu::getLname);
//        l1.stream().sorted(stuComparator).forEach(s-> System.out.println(s));

       // Comparator<stu> stuComparator = Comparator.comparing(stu::getFname).thenComparing(stu::getLname);
//        l1.stream().sorted(stuComparator).forEach(s-> System.out.println(s));

        //l1.stream().sorted(Comparator.naturalOrder()).forEach(s-> System.out.println(s.toString()));
//
//        l1.stream().forEach(s-> System.out.println(s.toString()));
//        System.out.println(l1);

//        Double sumPrices =  l1.stream().collect(Collectors.summingDouble(x->x.id));


    }
}
