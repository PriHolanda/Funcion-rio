package atividade;

public class Funcionario {
    private String cargo;
    private String nome;
    private String endereço;
    private Double salario;
    private Integer telefone;

    public Funcionario() {
    }

    public Funcionario(String cargo, String nome, String endereço, Double salario, Integer telefone) {
        this.cargo = cargo;
        this.nome = nome;
        this.endereço = endereço;
        this.salario = salario;
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public Double getSalario() {
        return salario;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo = " + cargo + ", nome = " + nome + ", endereço = " + endereço + ", salário = R$ " + salario + 
                " reais, telefone = " + telefone + '}';
    }
    
    
}
