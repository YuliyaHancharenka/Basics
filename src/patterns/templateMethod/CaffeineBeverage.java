package patterns.templateMethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {//should be final in order not to override the TEMPLATE method in sub classes
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) { // HOOK (перехватчик) - NOT obligatory for ALL sub classes method
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
