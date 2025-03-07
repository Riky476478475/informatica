interface Forma2D {
    double calcolaArea();
    double calcolaPerimetro();
}

interface Forma3D {
    double calcolaVolume();
    double calcolaSuperficie();
}

class Cerchio implements Forma2D {
    private double raggio;
    public Cerchio(double raggio) {
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

class Rettangolo implements Forma2D {
    private double larghezza;
    private double altezza;
    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {
        return larghezza * altezza;
    }
    @Override
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }
}

class Sfera implements Forma3D {
    private double raggio;
    public Sfera(double raggio) {
        this.raggio = raggio;
    }
    @Override
    public double calcolaVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raggio, 3);
    }
    @Override
    public double calcolaSuperficie() {
        return 4 * Math.PI * Math.pow(raggio, 2);
    }
}

class Cuboide implements Forma3D {
    private double lunghezza;
    private double larghezza;
    private double altezza;
    public Cuboide(double lunghezza, double larghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    @Override
    public double calcolaVolume() {
        return lunghezza * larghezza * altezza;
    }
    @Override
    public double calcolaSuperficie() {
        return 2 * (lunghezza * larghezza + larghezza * altezza + lunghezza * altezza);
    }
}

class CalcolatoreGeometria {
    public void stampaProprietaForma2D(Forma2D forma) {
        System.out.println("Area: " + forma.calcolaArea());
        System.out.println("Perimetro: " + forma.calcolaPerimetro());
    }
    public void stampaProprietaForma3D(Forma3D forma) {
        System.out.println("Volume: " + forma.calcolaVolume());
        System.out.println("Superficie: " + forma.calcolaSuperficie());
    }
}

public class es09 {
    public static void main(String[] args) {
        Forma2D cerchio = new Cerchio(5.0);
        Forma2D rettangolo = new Rettangolo(4.0, 6.0);
        Forma3D sfera = new Sfera(3.0);
        Forma3D cuboide = new Cuboide(4.0, 5.0, 6.0);

        CalcolatoreGeometria calcolatore = new CalcolatoreGeometria();

        System.out.println("Proprietà del Cerchio:");
        calcolatore.stampaProprietaForma2D(cerchio);
        System.out.println();

        System.out.println("Proprietà del Rettangolo:");
        calcolatore.stampaProprietaForma2D(rettangolo);
        System.out.println();

        System.out.println("Proprietà della Sfera:");
        calcolatore.stampaProprietaForma3D(sfera);
        System.out.println();

        System.out.println("Proprietà del Cuboide:");
        calcolatore.stampaProprietaForma3D(cuboide);
    }
}
