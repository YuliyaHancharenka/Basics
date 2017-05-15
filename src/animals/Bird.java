package animals;


abstract class Bird implements Animal {

    Double wing;

   // public abstract String talk();
    public abstract String fly();

    public void pick() {
        System.out.println("Ah, so tasty");
    }


}
