import java.util.Scanner;

public class calculadoisnum {
public static void main (String[] args) {
Scanner leitura = new Scanner (System.in); // declara objeto leitura do tipo

int a, b;
System.out.println("Informe o valor de A");
a = leitura.nextInt();//aloca em a o valor lido usando o objeto scanner leitura
System.out.println("Informe o valor de B");
b = leitura.nextInt();
System.out.printf("Soma - A: %d + B: %d = %d\n",a,b,(a+b));
System.out.printf("Subtracao - A: %d - B: %d = %d\n",a,b,(a-b));
System.out.printf("Multiplicacao - A: %d * B: %d = %d\n",a,b,(a*b));
System.out.printf("Divisao - A: %d / B: %d = %3f\n",a,b,((double)a/b));   
}    
}    