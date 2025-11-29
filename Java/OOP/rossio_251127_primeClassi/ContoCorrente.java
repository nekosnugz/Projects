public class ContoCorrente {
    private String intestatario, numeroConto;
    private double saldo;
    
    public ContoCorrente(String intestatario,String numeroConto, double saldo) {
        this.intestatario = intestatario;
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public ContoCorrente() {
        this(null, null, 0);
    }

    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIntestatario() {
        return this.intestatario;
    }

    public String getNumeroConto() {
        return this.numeroConto;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double denaro) {
        if (denaro < 0) throw new IllegalArgumentException("impossibile depositare quantità negativa di denaro");
        this.saldo += denaro;
    }
    
    public void preleva(double denaro) {
        if (saldo < 0) throw new IllegalArgumentException("saldo negativo");
        if (denaro > saldo) throw new IllegalArgumentException("impossibile prelevare denaro superiore al saldo");
        this.saldo -= denaro;
    }

    public void visualizzaSaldo() {
        System.out.println("Saldo di '" + this.intestatario + "': " + this.saldo);
    }
}