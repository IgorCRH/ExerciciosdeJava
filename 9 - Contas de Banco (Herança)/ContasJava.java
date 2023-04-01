import java.util.Scanner;

public class ContasJava
{
public static void main (String [] args){
Scanner leitura = new Scanner (System.in);
String cliente = " ";
int opc, escolhe, numconta = 0;
float quantia, saldo = 0;
ContaPoupanca c = new ContaPoupanca (cliente,numconta,saldo);
ContaEspecial e = new ContaEspecial (cliente,numconta,saldo);
ContaBancaria b = new ContaBancaria (cliente,numconta,saldo);

do {
System.out.println("Digite a opção desejada: \n");
System.out.println("1 - Cadastrar Cliente: \n");
System.out.println("2 - Realizar Saque: \n");
System.out.println("3 - Realizar Depósito: \n");
System.out.println("4 - Exibir Novo Saldo a partir do Rendimento: \n");
System.out.println("5 - Pesquisar Cliente: \n");
System.out.println("6 - Listar Clientes: \n");
opc = leitura.nextInt();

switch (opc){
case 1:
System.out.println("Deseja cadastrar conta poupança (1) ou especial (2)?: \n");   
escolhe = leitura.nextInt();
if (escolhe == 1){
c.cadconta();
} else if (escolhe == 2){
e.cadconta();
}
break;
case 2:
System.out.println("Entre com a quantia: \n");
quantia = leitura.nextFloat();
System.out.println("Sua conta é: conta poupança (1) ou especial (2)?: \n");   
escolhe = leitura.nextInt();
if (escolhe == 1){    
c.sacar(quantia);
} else if (escolhe == 2){
e.sacaresp(quantia);
}
break;
case 3:
System.out.println("Entre com a quantia: \n");
quantia = leitura.nextFloat();
System.out.println("Sua conta é: conta poupança (1) ou especial (2)?: \n");   
escolhe = leitura.nextInt();
if (escolhe == 1){
c.depositar(quantia);
} else if (escolhe == 2){
e.depositar(quantia);
}
break;
case 4:
c.novosaldo();
break;
case 5:
System.out.println("Sua conta é: conta poupança (1) ou especial (2)?: \n");   
escolhe = leitura.nextInt();
if (escolhe == 1){
c.pesquisa();
} else if (escolhe == 2){
e.pesquisa();
}
break;
case 6:
System.out.println("Listagem dos Clientes: \n");
System.out.println("Contas Poupança: \n");
c.exibir();
System.out.println("Contas Especiais: \n");
e.exibir();
break;
}
} while (opc !=7);
}
}