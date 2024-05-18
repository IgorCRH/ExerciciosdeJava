import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private List<Funcionario> funcionarios;
    private Map<String, Map<String, Double>> vendasMensais;

    public Main(List<Funcionario> funcionarios, Map<String, Map<String, Double>> vendasMensais) {
        this.funcionarios = funcionarios;
        this.vendasMensais = vendasMensais;
    }

    public double calcularTotalPago(List<Funcionario> funcionarios, int mes, int ano) {
        double totalPago = 0;
        for (Funcionario funcionario : funcionarios) {
            totalPago += funcionario.calcularSalario(mes, ano) + funcionario.calcularBeneficio(mes, ano);
        }
        return totalPago;
    }

    public double calcularTotalSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.calcularSalario(mes, ano);
        }
        return totalSalarios;
    }

    public double calcularTotalBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        double totalBeneficios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalBeneficios += funcionario.calcularBeneficio(mes, ano);
        }
        return totalBeneficios;
    }

    public Funcionario funcionarioComMaiorRecebimento(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario funcionarioComMaiorRecebimento = null;
        double maiorValor = Double.MIN_VALUE;
        for (Funcionario funcionario : funcionarios) {
            double valorRecebido = funcionario.calcularSalario(mes, ano) + funcionario.calcularBeneficio(mes, ano);
            if (valorRecebido > maiorValor) {
                maiorValor = valorRecebido;
                funcionarioComMaiorRecebimento = funcionario;
            }
        }
        return funcionarioComMaiorRecebimento;
    }

    public String nomeFuncionarioComMaiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario funcionarioComMaiorBeneficio = null;
        double maiorBeneficio = Double.MIN_VALUE;
        for (Funcionario funcionario : funcionarios) {
            double beneficio = funcionario.calcularBeneficio(mes, ano);
            if (beneficio > maiorBeneficio) {
                maiorBeneficio = beneficio;
                funcionarioComMaiorBeneficio = funcionario;
            }
        }
        return funcionarioComMaiorBeneficio.getNome();
    }

    public Vendedor vendedorComMaisVendas(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor vendedorComMaisVendas = null;
        double maiorValorVendas = Double.MIN_VALUE;
        String mesAno = String.format("%02d/%04d", mes, ano);
        for (Vendedor vendedor : vendedores) {
            Map<String, Double> vendasPorMes = vendedor.getVendasMensais().get(vendedor.getNome());
            if (vendasPorMes != null && vendasPorMes.containsKey(mesAno)) {
                double valorVendas = vendasPorMes.get(mesAno);
                if (valorVendas > maiorValorVendas) {
                    maiorValorVendas = valorVendas;
                    vendedorComMaisVendas = vendedor;
                }
            }
        }
        return vendedorComMaisVendas;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Map<String, Map<String, Double>> vendasMensais = criarVendasMensais();

        funcionarios.add(new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)));
        funcionarios.add(new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)));
        funcionarios.add(new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1), vendasMensais));
        funcionarios.add(new Vendedor("João Mendes", LocalDate.of(2021, 12, 1), vendasMensais));
        funcionarios.add(new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1)));
        funcionarios.add(new Gerente("Bento Albino", LocalDate.of(2014, 3, 1)));

        List<Vendedor> vendedores = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Vendedor) {
                vendedores.add((Vendedor) funcionario);
            }
        }

        Main main = new Main(funcionarios, vendasMensais);

        // Meses e anos específicos a serem processados
        int[][] mesesAnos = {
            {12, 2021}, {1, 2022}, {2, 2022}, {3, 2022}, {4, 2022}
        };

        for (int[] mesAno : mesesAnos) {
            int mes = mesAno[0];
            int ano = mesAno[1];
            System.out.println("=== Mês " + mes + "/" + ano + " ===");
            System.out.println("Total pago no mês (salário + benefício): " + main.calcularTotalPago(funcionarios, mes, ano));
            System.out.println("Total pago somente em salários no mês: " + main.calcularTotalSalarios(funcionarios, mes, ano));
            System.out.println("Total pago em benefícios no mês: " + main.calcularTotalBeneficios(funcionarios, mes, ano));
            System.out.println("Funcionário que recebeu o valor mais alto no mês: " + main.funcionarioComMaiorRecebimento(funcionarios, mes, ano).getNome());
            System.out.println("Nome do funcionário que recebeu o valor mais alto em benefícios no mês: " + main.nomeFuncionarioComMaiorBeneficio(funcionarios, mes, ano));
            Vendedor vendedorMaisVendeu = main.vendedorComMaisVendas(vendedores, mes, ano);
            if (vendedorMaisVendeu != null) {
                System.out.println("Vendedor que mais vendeu no mês: " + vendedorMaisVendeu.getNome());
            } else {
                System.out.println("Nenhum vendedor encontrado para o mês " + mes + "/" + ano);
            }
            System.out.println();
        }
    }

    private static Map<String, Map<String, Double>> criarVendasMensais() {
        Map<String, Map<String, Double>> vendasMensais = new HashMap<>();

        // Vendas da Ana Silva
        Map<String, Double> vendasAna = new HashMap<>();
        vendasAna.put("12/2021", 5200.0);
        vendasAna.put("01/2022", 4000.0);
        vendasAna.put("02/2022", 4200.0);
        vendasAna.put("03/2022", 5850.0);
        vendasAna.put("04/2022", 7000.0);

        // Vendas do João Mendes
        Map<String, Double> vendasJoao = new HashMap<>();
        vendasJoao.put("12/2021", 3400.0);
        vendasJoao.put("01/2022", 7700.0);
        vendasJoao.put("02/2022", 5000.0);
        vendasJoao.put("03/2022", 5900.0);
        vendasJoao.put("04/2022", 6500.0);

        vendasMensais.put("Ana Silva", vendasAna);
        vendasMensais.put("João Mendes", vendasJoao);

        return vendasMensais;
    }
}
