public class thread2 {
    static class Contatore {
        private int valore = 0;

        public void incrementa() {
            valore++;
        }

        public int getValore() {
            return valore;
        }
    }

    static class ThreadContatore implements Runnable {
        private Contatore contatore;

        public ThreadContatore(Contatore contatore) {
            this.contatore = contatore;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                contatore.incrementa();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Contatore contatore = new Contatore();
        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ThreadContatore(contatore));
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Valore finale del contatore: " + contatore.getValore());
    }
}
