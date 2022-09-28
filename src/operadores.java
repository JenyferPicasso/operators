import java.util.Scanner;

import javax.swing.JOptionPane;

public class operadores {
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        float n1, n2,suma,resta,div,mult,resto;
        System.out.println("Digite dos numeros: ");
        n1=entrada.nextFloat();
        n2=entrada.nextFloat();

        suma=n1+n2;
        resta=n1-n2;
        mult=n1*n2;
        div=n1/n2;
        resto=n1%n2;

        System.out.println("El valor de la suma es: "+suma);
        System.out.println("El valor de la resta es: "+resta);
        System.out.println("El valor de la multiplicacion es: "+mult);
        System.out.println("El valor de la divicion es:"+div);
        System.out.println("El valor del MOD es: "+resto);

    }
    
}
