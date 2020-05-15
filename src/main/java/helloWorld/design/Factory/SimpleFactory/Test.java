package helloWorld.design.Factory.SimpleFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:09
 */
public class Test {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("huawei");            // make xiaomi phone!
        Phone iPhone = factory.makePhone("xiaomi");    // make iphone!
    }
}