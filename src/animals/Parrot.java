package animals;


public class Parrot extends Bird implements Animal {

    Parrot() {
        this.wing = 1D;
    }

    Parrot(Double wing){
        this.wing = wing;
    }

    public String talk(){
        return ("Popka-durak");
    }

    @Override
    public String fly() {
        return "I flyed "+ wing * 0.5;
    }
}
