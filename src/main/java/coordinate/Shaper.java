package coordinate;

public interface Shaper {

    double area();

    String getTopic();

    default void print(){
        System.out.println(getTopic()+area());
    }
}
