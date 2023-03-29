import java.util.Scanner;

public class testaparidade
{
public void par (){
System.out.println("O numero é par.");    
}

public void impar (){
System.out.println("O numero é ímpar.");    
}

public static void main (String[] args){
Scanner leitura = new Scanner (System.in);
testaparidade objpar = new testaparidade();
testaparidade objimpar = new testaparidade();
int num;

System.out.println("Entre com o numero desejado");
num=leitura.nextInt();

if (num % 2 == 0){
objpar.par();    
} else {
objimpar.impar();    
}    
}
}
