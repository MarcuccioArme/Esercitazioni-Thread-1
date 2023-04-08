public class SecondoEsercizio {
    public static void main(String[] args) {
        Thread Thread1 = new Thread();
        Thread1.setPriority(Thread.MAX_PRIORITY);
        Thread1.setName("Uno");
        Thread1.start();

        Thread Thread2 = new Thread();
        Thread2.setPriority(Thread.NORM_PRIORITY);
        Thread2.setName("Due");
        Thread2.start();

        Thread Thread3 = new Thread();
        Thread3.setPriority(Thread.MIN_PRIORITY);
        Thread3.setName("Tre");
        Thread3.start();

        System.out.println("La priorità del Thread '"+Thread1.getName()+"' è: "+Thread1.getPriority());
        System.out.println("La priorità del Thread '"+Thread2.getName()+"' è: "+Thread2.getPriority());
        System.out.println("La priorità del Thread '"+Thread3.getName()+"' è: "+Thread3.getPriority());
    }
}