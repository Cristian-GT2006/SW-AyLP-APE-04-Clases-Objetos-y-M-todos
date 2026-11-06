// APE 4 - Ejercicio 4: Transferencias (objeto como parámetro)

class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() { return saldo; }

    public void depositar(double monto) {
        saldo += monto;
    }

    // Retira de esta cuenta y deposita en destino solo si hay fondos
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de " + titular);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 500.0);
        Cuenta c2 = new Cuenta("Luis", 200.0);

        c1.transferir(c2, 150.0);  // transferencia válida
        c1.transferir(c2, 1000.0); // transferencia que falla

        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
