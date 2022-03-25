import java.util.Scanner;

public class Ques {
    static int fun(int[] A,int[] B){
        int min=0;
        Character Last='c';
        int j,k;
        j=k=0;

        if(A[0]>=B[0])
        {
            min=B[k++];
            Last='B';
        }
        else {
            min=A[j++];
            Last='A';

        }
        int count=0;

        for(int i=min;i<=A[A.length-1]||i<=B[B.length-1];i++){
            if(i==A[j]){
                if(Last!='A')
                    count++;
                Last='A';
                if(A.length-1>j)
                    j++;
            }
            else if(i==B[k]){
                if(Last!='B')
                    count++;
                Last='B';
                if(B.length-1>k)
                   k++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
            A[i]=sc.nextInt();

        int M=sc.nextInt();
        int B[]=new int[M];
        for(int i=0;i<M;i++)
            B[i]=sc.nextInt();

        System.out.println(fun(A,B));
    }
}
