import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Student(String name, int Marks){
        this.setName(name);
        this.setMarks(Marks);
    }
}
public class hello {
    public static void main(String[] args) {
        ArrayList<Student> l=new ArrayList<>();
        l.add(new Student("Deepesh",98));
        l.add(new Student("Anas",161));
        l.add(new Student("Keshav",40));
        l.add(new Student("Gaurav",21));
        l.add(new Student("Amritpal",50));

        Predicate<Integer> p1=x->x>=60;

        Function<Student,String> f1=s ->{
            int m=s.getMarks();
            if(p1.test(m)){
                if(m>=80)
                    return "A";
                else if(m>=60)
                    return "B";
                else if(m>=50)
                    return "C";
                else if(m>=35)
                    return "D";
                else
                    return "FAIL";
            }
            return "hidden";
        };
        for (Student x:l) {
            System.out.println(f1.apply(x));
        }


    }

}

