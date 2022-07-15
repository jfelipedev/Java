package entities;

import java.util.ArrayList;

public class Zoo {
    private int id;
    private String nomeZoo;
    private int alvara;

    private Funcionarios funcionarios;
    private Animais animais;

    private ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();

    public Zoo() {
    }


    public void addFuncionario (Funcionarios f){
        listaFuncionarios.add(f);
    }

    public Zoo(int id, String nomeZoo, int alvara) {
        this.id = id;
        this.nomeZoo = nomeZoo;
        this.alvara = alvara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeZoo() {
        return nomeZoo;
    }

    public void setNomeZoo(String nomeZoo) {
        this.nomeZoo = nomeZoo;
    }

    public int getAlvara() {
        return alvara;
    }

    public void setAlvara(int alvara) {
        this.alvara = alvara;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Animais getAnimais() {
        return animais;
    }

    public void setAnimais(Animais animais) {
        this.animais = animais;
    }

    public ArrayList<Funcionarios> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionarios> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void operar(){
        System.out.println("Liberado! O zoológico  " + getNomeZoo() + " ja pode operar");
    }

    public void mostrarFuncionarios (){
        for (Funcionarios func : listaFuncionarios){
            System.out.println(
                    "id=" + func.getId() +
                            ", nome='" + func.getNome() +
                            ", cpf=" + func.getCpf() +
                            ", Endereço=" + func.getEndereco()
            );
        }
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", nomeZoo='" + nomeZoo + '\'' +
                ", alvara=" + alvara +
                ", funcionarios=" + funcionarios +
                ", animais=" + animais +
                ", listaFuncionarios=" + listaFuncionarios +
                '}';
    }
}