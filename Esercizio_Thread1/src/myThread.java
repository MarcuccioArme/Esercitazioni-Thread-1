public class myThread extends Thread {
    public void run() {
        System.out.println("Il thread '" + getName() + "' è in esecuzione");
    }
}
