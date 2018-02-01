import java.util.Scanner;
public class BinaryConverter 
{
    public static void main(String[] args) 
    {
        int i, count = 0, odd;
        String bi = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        i = in.nextInt();
        while(i > 0)
        {
            odd = i % 2;
            if(odd == 1)
            {
                count++;
            }
            bi = bi + "" + odd;
            i = i / 2;
        }
        System.out.println("binary:"+bi);
        
    }
}