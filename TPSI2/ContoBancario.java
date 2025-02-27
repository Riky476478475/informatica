class ContoBancario {
    String titolare;
    double saldo;

    public ContoBancario(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else {
            System.out.println("Saldo insufficiente.");
        }
    }

    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Deposito di " + importo + " effettuato.");
    }

    public void stampaSaldo() {
        System.out.println("Saldo attuale di " + titolare + ": " + saldo);
    }
}

























