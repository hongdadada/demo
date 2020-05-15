package helloWorld.design.Factory.SimpleFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:07
 */
public class HuaWeiPhone implements Phone {

    public HuaWeiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("huawei make");
    }
}