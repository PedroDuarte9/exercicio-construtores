package entities;

public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposito(double deposito){
        return getSaldo() + deposito;
    }

    public double saque(double saque){
       return getSaldo() - saque;
    }


    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
