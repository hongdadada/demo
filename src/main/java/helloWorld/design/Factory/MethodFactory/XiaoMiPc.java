package helloWorld.design.Factory.MethodFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:21
 */
public class XiaoMiPc implements Pc{
    public XiaoMiPc() {
        this.makePc();
    }

    @Override
    public void makePc() {
        System.out.println("xiaomi make pc");
    }
}