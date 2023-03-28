import java.util.Scanner;

public class calctabuada {
public static void main (String[] args) {
Scanner leitura = new Scanner (System.in); 

int i,num;
System.out.println("Informe o numero no qual deseja calcular a tabuada");
num=leitura.nextInt();

System.out.printf("Tabuada de %d:\n",num);  
for (i=0;i<10;i++){
System.out.printf("%d * %d = %d\n",i,num,i*num);    
}
}
}
