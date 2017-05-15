package Dogs;


public class Dog2 extends Dog implements PriceItem {
    int price;

    @Override
    public String getTitle() {
        return "Умная собака";
    }
    @Override
    public int getPrice(int count) {
        return price * count;
    }

    public void setPrice(int p) {
        price = p;
    }

    @Override
    public String getDescription() {
        return "Умная собака, которая знает свой возраст и умеет сообщать его с помощью лая";
    };
}
