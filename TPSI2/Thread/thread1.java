public class thread1 {
    static class MioThread extends Thread {
        public MioThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            System.out.println("Esecuzione del thread tramite ereditarietà: " + getName());
        }
    }

    static class MioRunnable implements Runnable {
        private final String name;
        public MioRunnable(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println("Esecuzione del thread tramite Runnable: " + name);
        }
    }

    public static void main(String[] args) {
        new MioThread("Thread-1").start();
        new Thread(new MioRunnable("Thread-2")).start();
        new Thread(() -> System.out.println("Esecuzione del thread tramite lambda")).start();
    }
}
