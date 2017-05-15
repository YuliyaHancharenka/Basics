package Dogs;


public class BigDog extends Dog {
    public void voice() {
        for (int i = 1; i <= 30; i++) {
            System.out.print("ГАВ-");
        }
    }
    public BigDog (String n, int a) {
        super(n, a);
    }
}
