public abstract class HummerModel {
    /*
     *
     */
    public abstract void start();
    // 能发动，还要能停下来，那才是本事
    public abstract void stop();
    // 汽车鸣笛
    public abstract void alarm();
    // 汽车发动机的声音
    public abstract void engineBoom();
    // 汽车运行起来
    public void run() {
        // 发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 汽车鸣笛
        this.alarm();
        // 汽车停止
        this.stop();
    }
}
