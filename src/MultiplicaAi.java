import java.util.*;

public class MultiplicaAi {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Insira um número- ");  
        int a = sc.nextInt();
        System.out.println("Tabela de multiplicação de " + a);
        for (int i = 1; i<=10; i++) {
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}
