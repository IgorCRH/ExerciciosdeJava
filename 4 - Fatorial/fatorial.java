import java.util.Scanner;

public class fatorial
{
    
    public void naonulo (int fat){
    System.out.printf("O fatorial do numero eh %d",fat);
    }
    
    public void nulo (){
    System.out.println("O fatorial de 0! eh 1");
    }
    
    public static void main(String[] args){
    Scanner leitura = new Scanner (System.in);
    fatorial objNaoNulo = new fatorial();
    fatorial objNulo = new fatorial();
    int num, fat = 1;
    
    System.out.println("Entre com o numero desejado");
    num=leitura.nextInt();
    
    if (num == 0){
    fat = 1;    
    objNulo.nulo();
    } else {
    for (fat = 1; num > 1; num = num-1){
    fat = fat*num;
    }    
    objNaoNulo.naonulo(fat);
    }  
}
}
