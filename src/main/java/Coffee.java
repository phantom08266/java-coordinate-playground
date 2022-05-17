public class Coffee extends CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brewCoffeeFromFilter();
        pourIntoCup();
        addSugarAndMilk();
    }

    public void brewCoffeeFromFilter() {
        System.out.println("필터를 사용하여 커피를 내리다.");
    }

    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
