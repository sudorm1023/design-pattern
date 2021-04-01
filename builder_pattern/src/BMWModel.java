public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这样的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车就应该这样停车...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎声音是这样的...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这样的...");
    }
}
