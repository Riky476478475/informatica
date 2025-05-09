public class thread3 {
    static class Saluto extends Thread {
        public Saluto(String nome) {
            super(nome);
        }

        public void run() {
            System.out.println("Thread che saluta. Creato come estensione della classe Thread");
        }
    }

    static class mioSaluto implements Runnable {
        public void run() {
            System.out.println("Thread eseguito tramite runnable");
        }
    }

    public static void main(String[] args) {
        new Saluto("ThreadSaluto").start();
        new Thread(new mioSaluto()).start();
        new Thread(() -> System.out.println("Sto usando una lamda expression")).start();
    }
}
