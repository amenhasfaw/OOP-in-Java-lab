class T1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("First");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

class T2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Second");
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

class exp6 {
    public static void main(String[] args) {
        T1 first = new T1();
        T2 second = new T2();

        first.start();
        second.start();
    }
}