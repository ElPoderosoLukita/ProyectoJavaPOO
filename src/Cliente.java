public class Cliente {
    private String nombre;
    private String n_cuenta;
    private double saldo;

    public Cliente(String nombre, String n_cuenta, double saldo){
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void restarSaldo(double numero){
        this.saldo -= numero;
    }

    public void sumarSaldo(double numero){
        this.saldo += numero;
    }
}
