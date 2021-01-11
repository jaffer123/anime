import java.util.*;

class Pattennew{
   public static void main(String[] args){

    int n;
    Scanner sc =new Scanner(System.in);
    n= sc.nextInt();
    
    for(int i=1; i<=n; i++)
    {
        for(int j=n; j>n-i; j--)
        {
            System.out.print(j);
        }
        for(int j=1; j<=n-i; j++)
        {
            System.out.print(n - i + 1);
        }
        System.out.println();
    }


   }
}