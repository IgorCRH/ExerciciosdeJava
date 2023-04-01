import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria
{
protected float diarendimento;

public float GetDiaRend (float diarendimento){
return diarendimento;
}

public ContaPoupanca (String cliente, int numconta, float saldo){
super(cliente,numconta,saldo);
this.diarendimento = diarendimento;
}

public void novosaldo(){
Scanner leitura = new Scanner (System.in);
if (diarendimento != 0){
System.out.println("Entre com o rendimento");
diarendimento = leitura.nextFloat();
   
super.saldo = super.saldo*diarendimento;
System.out.println("O novo saldo é: "+super.saldo);
}   
}

public void cadconta(){
Scanner leitura = new Scanner (System.in);

System.out.println("Entre com o nome do cliente: ");
super.cliente = leitura.next();
System.out.println("Entre com o número da conta do cliente: ");
super.numconta = leitura.nextInt();
System.out.println("Entre com o saldo da conta do cliente: ");
super.saldo = leitura.nextFloat();
System.out.println("Entre com o rendimento: ");
this.diarendimento = leitura.nextFloat();
}

public void pesquisa (){
Scanner leitura = new Scanner (System.in);
int pesq;    
System.out.println("Entre com o número da conta que deseja listar: ");
pesq = leitura.nextInt();

if (pesq == super.numconta){
System.out.println("Dados do Cliente: \n");
System.out.println("Nome: "+super.cliente);
System.out.println("Número da Conta: "+super.numconta);
System.out.println("Saldo: "+super.saldo); 
} else {
System.out.println("Não encontrado.");
}    
}

public void exibir (){
System.out.println("Nome: "+super.cliente);
System.out.println("Número da Conta: "+super.numconta);
System.out.println("Saldo: "+super.saldo);  
}

public void sacar (float quantia){
Scanner leitura = new Scanner (System.in);
int numsaque;   
System.out.println("Entre com o número da conta no qual deseja sacar");
numsaque = leitura.nextInt();
    
if (super.saldo > quantia && super.numconta == numsaque){
super.saldo -= quantia;
} else if (super.saldo < quantia && super.saldo < 0 && super.numconta == numsaque){
System.out.println("O saldo está negativo, ou esta operação o deixará negativo.");
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
