public class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public double calcolaArea() {
        return 0;
    }

    public double calcolaPerimetro() {
        return 0;
    }

    public void descrizione() {
        System.out.println("Questa forma è: " + nome);
    }

    public static void main(String[] args) {
        Forma cerchio = new Cerchio(5);
        Forma rettangolo = new Rettangolo(4, 6);
        Forma triangolo = new Triangolo(3, 4, 3, 4, 5);

        cerchio.descrizione();
        System.out.println("Area: " + cerchio.calcolaArea());
        System.out.println("Perimetro: " + cerchio.calcolaPerimetro());

        rettangolo.descrizione();
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());

        triangolo.descrizione();
        System.out.println("Area: " + triangolo.calcolaArea());
        System.out.println("Perimetro: " + triangolo.calcolaPerimetro());
    }
}

class Cerchio extends Forma {
    private double raggio;

    public Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}

class Triangolo extends Forma {
    private double base, altezza, lato1, lato2, lato3;

    public Triangolo(double base, double altezza, double lato1, double lato2, double lato3) {
        super("Triangolo");
        this.base = base;
        this.altezza = altezza;
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }
}
