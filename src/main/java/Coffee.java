public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("필터를 사용하여 커피를 내리다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가한다.");
    }
}
