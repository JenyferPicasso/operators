import java.util.Scanner;

public class operadoresIncrDrecr {
    public static void main (String[] args){
        int num=1;

        num++;
        num--;

        System.out.println(num);

        //***************************************

        int x=5,y;

        y=x++;//= y=5 y x=6 :: Ya que primero ejecuta por orden izq a der.::Primero iguala y a x y luego a x le suma 1

        System.out.println("y="+y);
        System.out.println("x="+x);

        //... a diferencia de:

        int a=5,b;

        b=++a;//aca si esta sumando a a++ y despues asigna 6 a b
        //Funciona igual x-- o --x
        System.out.println("b="+b);
    }
}
