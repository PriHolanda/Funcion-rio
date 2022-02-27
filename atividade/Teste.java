package atividade;

public class Teste {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f.setCargo("Médico");
        f.setNome("Otávio");
        f.setEndereço("Rua dos Artesãos");
        f.setSalario(12000.00);
        f.setTelefone(123456789);
        
        f2.setCargo("Advogada");
        f2.setNome("Lyanna");
        f2.setEndereço("Rua Aristóteles");
        f2.setSalario(8000.00);
        f2.setTelefone(987654321);
        
        System.out.println(f.toString());
        System.out.println(f2.toString());
        
    }
}
