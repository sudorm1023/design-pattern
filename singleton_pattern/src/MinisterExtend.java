public class MinisterExtend {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            EmperorExtend emperorExtend = EmperorExtend.getInstance();
            System.out.println("第" + (i+1) + "个大臣参拜的是：");
            emperorExtend.say();
        }
    }
}