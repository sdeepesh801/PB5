import java.util.ArrayList;
import java.util.function.Predicate;
class Emp1{
    String name;
    double salary;
    Emp1(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}
class abs{
    public static void main(String[] args) {
        ArrayList<Emp1> l=new ArrayList<>();
        l.add(new Emp1("Deepesh",1000));
        l.add(new Emp1("Anas",3000));
        l.add(new Emp1("keshav",4000));
        l.add(new Emp1("Gaurav",1500));
        l.add(new Emp1("Amritpal",9000));

        Predicate<Emp1> p1=x->x.salary>3000;
        for(Emp1 y:l){
            if(p1.test(y))
                System.out.println(y.name+" "+y.salary);
        }
    }
}
