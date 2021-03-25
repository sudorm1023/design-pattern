import java.util.ArrayList;
import java.util.Random;

/**
 * 只有两个EmerorExtend对象
 */

public class EmperorExtend {
    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;

    // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<>();

    // 定义一个列表，容纳所有的皇帝实例
    private static ArrayList<EmperorExtend> emperorList = new ArrayList<>();

    // 当前皇帝序列号
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new EmperorExtend("皇" + (i + 1) + "帝"));
        }
    }

    private EmperorExtend() {

    }

    // 传入皇帝名称，建立一个皇帝对象
    private EmperorExtend(String name) {
        nameList.add(name);
    }

    // 随机获得一个皇帝对象
    public static EmperorExtend getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    // 皇帝发话了
    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
