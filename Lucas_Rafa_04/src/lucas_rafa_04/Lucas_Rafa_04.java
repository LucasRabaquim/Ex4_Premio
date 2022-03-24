package lucas_rafa_04;
import java.util.Scanner;

public class Lucas_Rafa_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de horas extras: ");
        Double horaExtra = entrada.nextDouble();
        System.out.print("Digite o número de horas falta: ");
        Double horaFalta = entrada.nextDouble();
        Double horaPremio = (horaExtra*60) - ((2/3)*(horaFalta*60));
        Double minutosPremio[] = {0.0,600.0,1200.0,1800.0,2400.0};
        int i = 0;
        while((horaPremio >= minutosPremio[i])&&(i < 4)){
        i++;
        }
        System.out.println("Foram trabalhadas: " + horaExtra + " horas extras. \n" + "Faltou: " + horaFalta + " hora(s)\n" + "E recebeu o premio de " + "R$ "+(i+1)+ "00,00.");
    }
}