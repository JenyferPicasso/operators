import java.util.Scanner;

public class claseMath {
    public static void main (String[] args){
        
        double raiz=Math.sqrt(9);//Para poder sacar una RAIZ forzosamente debe ser el dado tipo DOUBLE
        // int raiz=(int)Math.sqrt(9); Para convertir la raiz a entera
        System.out.println("Raiz: "+raiz);

        //Potencia:

        double potencia=Math.pow(5, 2);

        System.out.println("Elevar: "+potencia);

        //Redondeo:

        double num=4.56; //Para definir el tipo de dato debes ir a las reglas de round.
        long result= Math.round(num); // long es entero, es decir sin punto decimal
        
        System.out.println("Round: "+result);

        //Numero random:

        double random=Math.random();//solo funciona con tipo double

        System.out.println("Num random: "+random);
    }
}
