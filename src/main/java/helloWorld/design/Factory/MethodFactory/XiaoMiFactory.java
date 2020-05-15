package helloWorld.design.Factory.MethodFactory;

import helloWorld.design.Factory.SimpleFactory.Phone;
import helloWorld.design.Factory.SimpleFactory.XiaoMIPhone;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:18
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new XiaoMIPhone();
    }

    @Override
    public Pc makePc() {
        return new XiaoMiPc();
    }
}