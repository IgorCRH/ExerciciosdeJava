import java.util.Scanner;
public class CadFuncionarios
{
public static void main (String [] args){
Scanner leitura = new Scanner (System.in);

String nome, cargo;
int matricula, opc;
double salario;
Funcionarios cadastro = new Funcionarios ();

do {
System.out.println("Entre com o nome do funcionario: ");
nome = leitura.next();
System.out.println("Entre com o cargo do funcionario: ");
cargo = leitura.next();
System.out.println("Entre com o matricula do funcionario: ");
matricula = leitura.nextInt();
System.out.println("Entre com o salário do funcionario: ");
salario = leitura.nextDouble();
System.out.println("Digite 4 para sair do cadastro, caso contrário, continue.");   
opc = leitura.nextInt();

cadastro.setNome(nome);
cadastro.setCargo(cargo);
cadastro.setMatricula(matricula);
cadastro.setSalario(salario);
            
System.out.println("Listagem dos Funcionários:");
cadastro.exibir();
System.out.println("---------------------------");
} while (opc != 4);   
}    
}
