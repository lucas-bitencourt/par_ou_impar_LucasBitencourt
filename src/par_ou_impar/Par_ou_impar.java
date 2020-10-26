package par_ou_impar;
import java.util.Scanner;
public class Par_ou_impar 
{
    public static void main(String[] args)
    {
        Scanner entrada;
        int n;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        
        if(n%2==0)
        {
            System.out.println("Esse número é par");
        }
        
        else if (n%2 == 1)
        {
            System.out.println("Esse número é impar");
        }
    }
    
}
