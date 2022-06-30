import java.util.Scanner;

public class InverseWord {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr= text.toCharArray();
        
        System.out.println(arr.length);

        String invertida = new StringBuilder(text).reverse().toString();
        System.out.println(invertida);
        }
           
    
    }                  



