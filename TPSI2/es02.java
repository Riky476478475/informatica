
class Dipendente {
    protected String nome;
    protected double stipendioBase;

    
    public Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

  
    public void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Base: " + stipendioBase);
    }
}


class Manager extends Dipendente {
    private double bonus;

 
    public Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

   
    @Override
    public void stampaStipendio() {
        System.out.println("Nome: " + nome + ", Stipendio Totale: " + (stipendioBase + bonus));
    }
}


public class es02 {
    public static void main(String[] args) {
        
        Dipendente dipendente = new Dipendente("Giovanni", 2500.0);
        Manager manager = new Manager("Elena", 2800.0, 1200.0);

       
        dipendente.stampaStipendio();
        manager.stampaStipendio();
    }
}
