package helloWorld.design.Factory.MethodFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:21
 */
public class HuaWeiPc implements Pc{
    public HuaWeiPc() {
        this.makePc();
    }

    @Override
    public void makePc() {
        System.out.println("huawei make pc");
    }
}