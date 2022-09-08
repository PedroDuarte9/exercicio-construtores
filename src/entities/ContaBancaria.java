package entities;

public class ContaBancaria {
    private String nome;
    private int numero;
    protected double saldo;

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

    public void deposito(double deposito){
        this.saldo = getSaldo() + deposito;
    }

    public void saque(double saque){
       this.saldo = getSaldo() - saque - 5.0;
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
