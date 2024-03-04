import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        if(b%2 != 0){
            b -= 1;
        }

        total = (b-(a *2))/2;


        sc.close();
        if(total <=0) System.out.println("Amelia tem todas bolinhas!");
        else System.out.println("Faltam " +total +" bolinha(s)");

    }
}
