public class Animal {
    private int id;
    private int idade;
    private String raca;

    public Animal(int id, int idade, String raca) {
        this.id = id;
        this.idade = idade;
        this.raca = raca;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", idade=" + idade + ", raca=" + raca + "]";
    }
}
