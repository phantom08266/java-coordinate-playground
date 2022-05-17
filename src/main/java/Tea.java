public class Tea extends CaffeineBeverage {
    void prepareRecipe() {
        boilWater();
        brewTea();
        pourIntoCup();
        addLemon();
    }

    public void brewTea() {
        System.out.println("차 티백을 담근다.");
    }

    public void addLemon() {
        System.out.println("레몬을 추가한다.");
    }
}
