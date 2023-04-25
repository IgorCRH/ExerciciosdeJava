import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Funcionario extends Pessoa
{
private double salario;
private String cargo, dep;
private static final String FILE_NAME = "funcionarios.txt"; // Declara a variável FILE_NAME

// Métodos GET e SET para retorno e setagem das variáveis
public double getSalario (){
return salario;    
}

public String getCargo (){
return cargo;    
}

public void setSalario (double salario) 
{
this.salario = salario;   
}

public void setDep (String dep) 
{
this.dep = dep;   
}

public void setCargo (String cargo) 
{
this.cargo = cargo;   
}

public String getDepartamento (){
return dep;    
}

public Funcionario (String nome, String email, int cpf, String data){
// Método construtor da classe Funcionario usado para implementar o super para resgatar
// os atributos da classe que ela é herdeira    
super(nome,email,cpf,data);
}

// Método de cadastro dos funcionários
public void cadfunc (){
Scanner leitura = new Scanner (System.in);
File entrada = new File("funcionarios.txt");

System.out.println("Entre com o nome do funcionário: ");
super.nome = leitura.next();
System.out.println("Entre com o email do funcionário: ");
super.email = leitura.next();
System.out.println("Entre com o CPF do funcionário: ");
super.cpf = leitura.nextInt();
System.out.println("Entre com a data de nascimento do funcionário: ");
super.data = leitura.next();
System.out.println("Entre com o cargo do funcionário");
this.cargo = leitura.next();
System.out.println("Entre com o departamento do funcionário");
this.dep = leitura.next();
System.out.println("Entre com o salário do funcionário");
this.salario = leitura.nextDouble();
try {
// Criação do objeto FileWriter e BufferedWriter para escrever no arquivo
FileWriter escritor = new FileWriter(entrada, true);
BufferedWriter bufferescritor = new BufferedWriter(escritor);
String line2;

// Escreve as informações do funcionário no arquivo
line2 = String.format("%s;%s;%d;%s;%s;%s;%f", super.nome, super.email, super.cpf, super.data, this.cargo, this.dep,this.salario);
bufferescritor.write(line2);

// Fecha o BufferedWriter e o FileWriter
bufferescritor.close();
escritor.close();
} catch (IOException e) { // Tratamento de exceção para superar o erro IOException
e.printStackTrace();
}
}

// Método para atualizar as informações do funcionário, recebendo uma string como passagem de argumento
public void atualizafunc(String natt) throws IOException {
String nomenov, datanov, cargonov, depnov, emailnov;
int cpfnov;
Scanner leitura = new Scanner (System.in);

try {
// Criação do objeto FileReader e BufferedReader para leitura do arquivo funcionarios.txt    
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
// Criação do objeto FileWriter e BufferedWriter para escrita das novas informações no arquivo temporário      
        FileWriter fw = new FileWriter(FILE_NAME + ".tmp");
        BufferedWriter bw = new BufferedWriter(fw);

        boolean found = false;
        String line; // Declara a string 'line' a ser impressa
        while ((line = br.readLine()) != null) { // Enquanto a string que lê o arquivo não está vazia
            String[] data = line.split(";"); // Declara uma nova string que separa o arquivo com o uso do ";" como separador
            if (data[0].equals(natt)) { // Se o primeiro endereço gerado após a separação (nome) for igual ao nome desejado pelo usuário (natt)
                found = true;
                System.out.println("Entre com o nome novo");
                nomenov = new Scanner(System.in).nextLine();
                System.out.println("Entre com o email novo");
                emailnov = new Scanner(System.in).nextLine();
                System.out.println("Entre com o CPF novo");
                cpfnov = new Scanner(System.in).nextInt();
                System.out.println("Entre com a data de nascimento nova");
                datanov = new Scanner(System.in).nextLine();
                System.out.println("Entre com o cargo novo: ");
                cargonov = leitura.next();
                System.out.println("Entre com o departamento novo: ");
                depnov = leitura.next();
                super.nome = nomenov;
                super.email = emailnov;
                super.cpf = cpfnov;
                super.data = datanov;
                this.cargo = cargonov;
                this.dep=depnov;
                // Joga as novas informações atualizadas na string a ser escrita no arquivo
                line = String.format("%s;%s;%d;%s;%s;%s;%f", super.nome, super.email, super.cpf, super.data, this.cargo, this.dep,this.salario);
            }
            bw.write(line); // Escreve a string line atualizada no arquivo temporário
            bw.newLine();
        }
        br.close(); // Fecha o Reader e o Writer
        bw.close();

        if (found) { // Se o nome é encontrado no arquivo
            java.io.File oldFile = new java.io.File(FILE_NAME);
            oldFile.delete(); // Delete o antigo arquivo txt

            java.io.File newFile = new java.io.File(FILE_NAME + ".tmp");
            newFile.renameTo(oldFile); // Renomeia o arquivo temporário para o antigo
        } else {
System.out.println("File not found: " + FILE_NAME); // Se o nome não for encontrado
}
} catch (IOException e) {
System.out.println("Error occurred while renaming the file: " + e.getMessage());
}
}

public void listarfunc() throws IOException{
// Método que lista os funcionários usando a chamada super pro método GET da variável.    
try {    
BufferedReader leitor = new BufferedReader(new FileReader("funcionarios.txt"));
String linha = leitor.readLine();
while (linha != null) {
System.out.printf("%s\n", linha);
linha = leitor.readLine();
}
leitor.close();
} catch (IOException e) {
e.printStackTrace();
}
}

public void reajuste(double valor) throws IOException {
Scanner leitura = new Scanner (System.in);
String nreaj;
try {
System.out.println("Entre com o nome do funcionário no qual deseja reajustar salário");
nreaj = leitura.next();
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(FILE_NAME + ".tmp");
        BufferedWriter bw = new BufferedWriter(fw);

        boolean found = false;
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(";");
            if (data[0].equals(nreaj)) {
                found = true;
                this.salario+=valor;
                line = String.format("%s;%s;%d;%s;%s;%s;%f", super.nome, super.email, super.cpf, super.data, this.cargo, this.dep,this.salario);
            }
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();

        if (found) {
            java.io.File oldFile = new java.io.File(FILE_NAME);
            oldFile.delete();

            java.io.File newFile = new java.io.File(FILE_NAME + ".tmp");
            newFile.renameTo(oldFile);
        } else {
System.out.println("File not found: " + FILE_NAME);
}
} catch (IOException e) {
System.out.println("Error occurred while renaming the file: " + e.getMessage());
}
}
}
