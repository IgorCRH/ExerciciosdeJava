import java.util.Scanner;
public class ContaEspecial extends ContaBancaria
{
protected float limite;
ContaPoupanca c = new ContaPoupanca (cliente,numconta,saldo);

public float GetLimite (float limite){
return limite;
}

public ContaEspecial (String cliente, int numconta, float saldo){
super(cliente,numconta,saldo);
this.limite = limite;
}

public void cadconta(){
Scanner leitura = new Scanner (System.in);

System.out.println("Entre com o nome do cliente: ");
super.cliente = leitura.next();
System.out.println("Entre com o número da conta do cliente: ");
super.numconta = leitura.nextInt();
System.out.println("Entre com o saldo da conta do cliente: ");
super.saldo = leitura.nextFloat();
System.out.println("Entre com o limite: ");
this.limite = leitura.nextFloat();
}

public void pesquisa (){
Scanner leitura = new Scanner (System.in);
int pesq;    
System.out.println("Entre com o número da conta que deseja listar: ");
pesq = leitura.nextInt();

if (pesq == this.numconta){
System.out.println("Dados do Cliente: \n");    
System.out.println("Nome: "+super.cliente);
System.out.println("Número da Conta: "+super.numconta);
System.out.println("Saldo: "+super.saldo);
System.out.println("Limite: "+this.limite);  
} else {
System.out.println("Não encontrado.");
}    
}

public void exibir (){
System.out.println("Nome: "+super.cliente);
System.out.println("Número da Conta: "+super.numconta);
System.out.println("Saldo: "+super.saldo);
System.out.println("Limite: "+this.limite);  
}

public void sacaresp (float quantia){
Scanner leitura = new Scanner (System.in);
int numsaque;   
System.out.println("Entre com o número da conta no qual deseja sacar");
numsaque = leitura.nextInt();
    
if (super.saldo == this.limite && super.numconta == numsaque){    
super.saldo -= quantia;
} else {
System.out.println("Não é possível realizar a operação. Limite alcançado ou a conta não foi encontrada.");
}
}

public void depositar (float quantia){
Scanner leitura = new Scanner (System.in);
int numdep;   
System.out.println("Entre com o número da conta no qual deseja depositar");
numdep = leitura.nextInt();

if (super.numconta == numdep){    
super.saldo += quantia;
}
}
}
