package abstraction;

public abstract class AbsSport {
    abstract void exercise();
    abstract void playing();
    void rest(){
        System.out.println("After playing game you need rest");
    }

}
/**
 *
 * definition -  hiding the details and showing functionality only.
 *             - achieving through the abstract class.
 *              - partial abstract class.
 *              we can use public,private,protected,default
 *
 */