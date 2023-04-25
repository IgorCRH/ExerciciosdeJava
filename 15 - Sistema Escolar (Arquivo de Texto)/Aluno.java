import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private int matricula;
    private double cr;
    private static final String FILE_NAME = "alunos.txt"; // Declara a variável FILE_NAME

    // Métodos GET e SET para retorno e setagem das variáveis
    public int getMatricula() {
        return matricula;
    }

    public double getCR() {
        return cr;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCR(double cr) {
        this.cr = cr;
    }

    public Aluno(String nome, String email, int cpf, String data) {
        super(nome, email, cpf, data);
    }

    // Método para cadastro dos alunos
    public void cadaluno() {
        Scanner leitura = new Scanner(System.in);
        File entrada = new File("alunos.txt");

        System.out.println("Entre com o nome do aluno: ");
        super.nome = leitura.next();
        System.out.println("Entre com o email do aluno: ");
        super.email = leitura.next();
        System.out.println("Entre com o CPF do aluno: ");
        super.cpf = leitura.nextInt();
        System.out.println("Entre com a data de nascimento do aluno: ");
        super.data = leitura.next();
        System.out.println("Entre com a matrícula do aluno: ");
        this.matricula = leitura.nextInt();
        System.out.println("Entre com a CR do aluno: ");
        this.cr = leitura.nextDouble();

        try {
// Criação do objeto FileWriter e BufferedWriter para escrever no arquivo
FileWriter escritor = new FileWriter(entrada, true);
BufferedWriter bufferescritor = new BufferedWriter(escritor);
String line2;

// Escreve as informações do aluno no arquivo
line2 = String.format("%s;%s;%d;%s;%d;%f", super.nome, super.email, super.cpf, super.data, this.matricula, this.cr);
bufferescritor.write(line2);

// Fecha o BufferedWriter e o FileWriter
bufferescritor.close();
escritor.close();
} catch (IOException e) {
e.printStackTrace();
}
}

// Método para atualizar as informações do aluno, recebendo uma string como passagem de argumento
public void atualizaaluno(String natt) throws IOException {
        String nomenov, emailnov, datanov;
        int cpfnov, matnov;
        Double crnov;

try {
// Criação do objeto FileReader e BufferedReader para leitura do arquivo    
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
                System.out.println("Entre com a matrícula nova");
                matnov = new Scanner(System.in).nextInt();
                System.out.println("Entre com o CR novo");
                crnov = new Scanner(System.in).nextDouble();
                super.nome = nomenov;
                super.email = emailnov;
                super.cpf = cpfnov;
                super.data = datanov;
                this.matricula = matnov;
                this.cr = crnov;
                // Joga as novas informações atualizadas na string a ser escrita no arquivo
                line = String.format("%s;%s;%d;%s;%d;%f", super.nome, super.email, super.cpf, super.data, this.matricula, this.cr);
            }
            bw.write(line); // Escreve a string line atualizada no arquivo temporário
            bw.newLine();
        }
        br.close(); // Fecha o Reader e o Writer
        bw.close();

        if (found) { // Se o nome é encontrado no arquivo, ou seja,a variável booleana é verdadeira
            java.io.File oldFile = new java.io.File(FILE_NAME);
            oldFile.delete(); // Delete o antigo arquivo txt

            java.io.File newFile = new java.io.File(FILE_NAME + ".tmp");
            newFile.renameTo(oldFile); // Renomeia o arquivo temporário para o antigo
        } else {
System.out.println("File not found: " + FILE_NAME);
}
} catch (IOException e) {
System.out.println("Error occurred while renaming the file: " + e.getMessage());
}
}


public void anulamatricula(String nanul) throws IOException {
try {
        FileReader fr = new FileReader(FILE_NAME);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(FILE_NAME + ".tmp");
        BufferedWriter bw = new BufferedWriter(fw);

        boolean found = false;
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(";");
            if (data[0].equals(nanul)) {
                found = true;
                this.matricula = 0;
                line = String.format("%s;%s;%d;%s;%d;%f", super.nome, super.email, super.cpf, super.data, this.matricula, this.cr);
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

public void listaralunos () throws IOException {
try {    
BufferedReader leitor = new BufferedReader(new FileReader("alunos.txt"));
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
}
