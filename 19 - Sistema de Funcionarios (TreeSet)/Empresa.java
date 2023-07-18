import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Empresa {
    private TreeSet<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new TreeSet<>(new FuncionarioComparatorPorSalario());
    }
    
    private static class FuncionarioComparatorPorSalario implements Comparator<Funcionario> {
        @Override
        public int compare(Funcionario funcionario1, Funcionario funcionario2) {
            return Double.compare(funcionario1.getSalario(), funcionario2.getSalario());
        }
    }
    
    public void inserirFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public Funcionario funcionarioMaisNovo() {
        return funcionarios.first();
    }

    public Funcionario funcionarioMaisVelho() {
        return funcionarios.last();
    }
    
    public int funcionariosComSalarioMaiorQue(double salario) {
        return (int) funcionarios.stream().filter(funcionario -> funcionario.getSalario() > salario).count();
    }

    public int funcionariosComSalarioMenorQue(double salario) {
     return (int) funcionarios.stream().filter(funcionario -> funcionario.getSalario() < salario).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Funcionario funcionario : funcionarios) {
            sb.append(funcionario.toString()).append("\n");
        }
        return sb.toString();
    }
}
