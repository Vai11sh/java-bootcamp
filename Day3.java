import java.util.Scanner;

public class Day3 {

    public static void main(String args[])
    {
        int num , i ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an positive integer :");
        num =  sc.nextInt();

        if (num  > 0)
        {
            for (i=1 ; i<=num ;i++)
            {
                sum = sum + i;
                
            }
            System.out.println("The sum till " + num+ " integer is: " +sum);        }


    }
    
}
