public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void pourIntoCup() {
        System.out.println("컵에 붓는다.");
    }
}
