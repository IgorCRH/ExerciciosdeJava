import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected LocalDate dataContratacao;
    protected double salarioBase;

    public Funcionario(String nome, String cargo, LocalDate dataContratacao, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario(int mes, int ano);
    public abstract double calcularBeneficio(int mes, int ano);
}