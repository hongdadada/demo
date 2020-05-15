package helloWorld.design.Factory.MethodFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:25
 */
public class Test {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory huaWeiFactory = new HuaWeiFactory();
        miFactory.makePhone();
        miFactory.makePc();
        huaWeiFactory.makePhone();
        huaWeiFactory.makePc();
    }
}