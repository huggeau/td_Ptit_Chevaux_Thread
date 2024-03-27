package fr.btsciel.td_javafx_thread;

public class Coureur {

    String nom;

    int distanceCourse;

    public Coureur(String nom, int distanceCourse) {
        this.nom = nom;
        this.distanceCourse = distanceCourse;
    }

    public void run(){
        for (int i = 0; i < distanceCourse; i++) {
            try {
                Thread.sleep((long) (Math.random()*3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(nom + " a parcouru " + (i+1) +"km");
        }
        System.out.println("""
                ---------------------------------------------
                %s est arrivée
                ---------------------------------------------
                """.formatted(nom));
    }
}
