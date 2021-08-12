import java.util.Scanner;

public class factorial {
    public static void main(String [] arg)
    {
        System.out.println("enter the no:");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int f =1;
        int i=1;
       /* for(int i=n;i>1; i--)
        {
            f=f*i;

        }
        System.out.println("factorial is:"+f);*/
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("factorial is" +f);
            }
}
