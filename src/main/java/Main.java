public class Main {
    public static void main(String[] args) {
        //DEFINITION:
        /*
       - An abstract class is a class that is declared abstract.
       - It may or may not include abstract methods.
       - Abstract classes cannot be instantiated, but they can be subclassed.
       - When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.

         */

        // PURPOSE:
        /*
        - A Java abstract class is a class which cannot be instantiated, meaning you cannot create new instances of an abstract class.
        - The purpose of an abstract class is to function as a base for subclasses.
        - The advantage of using an abstract class is that you can group several related classes together as siblings.
        - Grouping classes together is important in keeping a program organized and understandable.

         */

        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        ManGameCalculator manGameCalculator= new ManGameCalculator();
        manGameCalculator.hesapla();
        manGameCalculator.gameOver();
        KidsGameCalculator kidsGameCalculator=new KidsGameCalculator();
        kidsGameCalculator.hesapla();
        kidsGameCalculator.gameOver();

    }
}
