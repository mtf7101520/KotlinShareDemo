package compared;

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/7/9
 * description  : 协变数组
 */
public class CovariantArrays {

    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new AppleC();
        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruits[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static class Fruit {
    }
    static class Apple extends Fruit {
    }
    static class AppleC extends Apple {
    }
    static class Orange extends Fruit {
    }
}
