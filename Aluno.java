package Exercicioginastica;
public class Aluno {
    private int id;
    private String cpf;
    private String nome;
    private double altura;
    private double peso;

    public Aluno() {
    }

    public Aluno(int id, String cpf, String nome, double altura, double peso) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}