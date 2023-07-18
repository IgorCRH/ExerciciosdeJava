public class Funcionario implements Comparable<Funcionario> {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Getters and setters (omitted for brevity)
    public String getNome(){
    return nome;
    }
    
    public double getSalario(){
    return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario + ", Cargo: " + cargo;
    }

    @Override
    public int compareTo(Funcionario outroFuncionario) {
        // Comparando funcionários com base no nome (pode ser alterado para outro critério)
        return this.nome.compareTo(outroFuncionario.getNome());
    }
}
