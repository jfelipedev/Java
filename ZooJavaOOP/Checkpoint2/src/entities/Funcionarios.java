package entities;

public class Funcionarios {
    private int id;
    private String nome;
    private int cpf;

    private Endereco endereco;

    public Funcionarios() {
    }


    public Funcionarios(int id, String nome, int cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void cadastroFuncionario(){
        System.out.println("Funcionário  " + getNome() + " está cadastrado");
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Funcionarios {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", endereco=" + endereco +
                '}';
    }

    public void listaFuncionarios() {
    }
}

