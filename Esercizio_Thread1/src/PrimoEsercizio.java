public class PrimoEsercizio {
    public static void main(String[] args) {
        myThread Thread = new myThread();
        Thread.setName("Il_mio_Thread");
        Thread.start();
        System.out.println("La priorità del Thread '"+Thread.getName()+"' è: "+Thread.getPriority());
    }
}