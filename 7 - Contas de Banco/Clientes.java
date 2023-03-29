import java.util.Scanner;
public class Clientes
{
private String nome;
private int numconta, cpf;
private double saldo;

public String getNome (){
return nome;    
} 

public int getNumConta (){
return numconta;    
}  

public int getCpf (){
return cpf;    
}

public double getSaldo (){
return saldo;    
}

public void setNome (String nome) 
{
this.nome = nome;   
}

public void setNumConta (int numconta) 
{
this.numconta = numconta;   
}

public void setCpf (int cpf) 
{
this.cpf = cpf;   
}

public void setSaldo (double saldo) 
{
this.saldo = saldo;   
}

public void exibir (){ // Exibir as informações que estarão no GET
System.out.println("Nome: "+this.nome);
System.out.println("Número da Conta: "+this.numconta);
System.out.println("CPF: "+this.cpf);
System.out.println("Saldo: "+this.saldo);    
}

public void depositar (double quantia){
this.saldo += quantia;
}

public void sacar (double quantia){
this.saldo -= quantia;
}

public void rendpoupançaano (double rendimento){
int qtdanos;
double saldo2;
Scanner leitura = new Scanner (System.in);

System.out.println("Deseja calcular rendimento para quantos anos?: ");
qtdanos = leitura.nextInt();    
saldo2 = this.saldo*qtdanos*rendimento*12*10;
System.out.printf("Com este rendimento, o saldo é de %1f:\n",saldo2);  
}
public void rendpoupançames (double rendimento){
int qtdmes;
double saldo2;
Scanner leitura = new Scanner (System.in);

System.out.println("Deseja calcular rendimento para quantos meses?: ");
qtdmes = leitura.nextInt();    
saldo2 = this.saldo*qtdmes*rendimento*10;
System.out.printf("Com este rendimento, o saldo é de %.1f:\n",saldo2);
}       
}
