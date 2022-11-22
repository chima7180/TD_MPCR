public class ThreadA {

    public void travail(){
        while (true){
            System.out.println("Affichage du thread A:");
            System.out.println("2ème ligne du thread A");
            System.out.println("3ème ligne du thread A");
            System.out.println("4ème ligne du thread A");
            System.out.println("5ème ligne du thread A");
            System.out.println("6ème ligne du thread A");

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
