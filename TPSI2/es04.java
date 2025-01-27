
class Animale {
   
    public void verso() {
        System.out.println("L'animale emette un verso");
    }
}


class Cane extends Animale {
  
    @Override
    public void verso() {
        super.verso(); 
        System.out.println("Il cane abbaia");
    }
}


public class es04 {
    public static void main(String[] args) {
    
        Cane cane = new Cane();
        cane.verso();
    }
}
