public class Tea {
    void prepareRecipe() {
        boilWater();
        brewTea();
        pourIntoCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void brewTea() {
        System.out.println("차 티백을 담근다.");
    }

    public void pourIntoCup() {
        System.out.println("컵에 붓는다.");
    }

    public void addLemon() {
        System.out.println("레몬을 추가한다.");
    }
}
