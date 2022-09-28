import java.util.Scanner;

public class operadoresAsignacion {
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        int num=10;
        num+=10;//num=num+10 Se voltean signos
        num-=5;
        num/=5;
        num%=5;
        System.out.println(num);
    }
}
