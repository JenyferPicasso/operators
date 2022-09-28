import java.util.Scanner;

public class mod {
    public static void main (String[] args){
        
        int hrs=1000,dias;
        int semanas,hrsf;

        //resto=n1%n2;
        semanas=(hrs/24)/7;

        dias=(hrs/24)%7;

        //dias=(hrs-((semanas*7)*24))/24;

        hrsf=(hrs-((semanas*7)*24))%24;
        
        System.out.println(semanas);
        System.out.println(dias);
        System.out.println(hrsf);
    }
}

