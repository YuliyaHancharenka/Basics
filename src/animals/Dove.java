package animals;


public class Dove extends Bird implements Animal {

    Dove(Double wing){
        this.wing = wing;
    }


    public String talk() {
        return "Urrr-urr";
    }

    @Override
    public String fly() {
        return "I flyed "+ wing * 2;
    }

    @Override
    public void pick(){
        System.out.println("I'm Dove: Ah so tasty");
    }
}
