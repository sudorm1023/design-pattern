import java.util.ArrayList;

public abstract class CarModel {
    // 这个参数是各个方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    // 模式是启动开始跑了
    protected abstract void start();
    // 汽车要会停止
    protected abstract void stop();
    // 引擎要会响
    protected abstract void engineBoom();
    // 喇叭要会响
    protected abstract void alarm();
    // 那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            }
            else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }
            else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            }
            else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
