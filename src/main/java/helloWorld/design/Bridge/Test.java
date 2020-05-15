package helloWorld.design.Bridge;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:59
 */
public class Test {
    public static void main(String[] args) {
        Phone huawei=new HuaWei();
        huawei.setMemory(new Memory8G());
        huawei.buy();

        Phone xiaomi=new HuaWei();
        xiaomi.setMemory(new Memory6G());
        xiaomi.buy();
    }
}