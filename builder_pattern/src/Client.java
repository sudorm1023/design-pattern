import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");

        benz.setSequence(sequence);
        benz.run();
    }
}
