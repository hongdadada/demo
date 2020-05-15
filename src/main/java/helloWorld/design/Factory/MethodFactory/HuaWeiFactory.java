package helloWorld.design.Factory.MethodFactory;

import helloWorld.design.Factory.SimpleFactory.HuaWeiPhone;
import helloWorld.design.Factory.SimpleFactory.Phone;
import helloWorld.design.Factory.SimpleFactory.PhoneFactory;

/**
 * @author zhangwei
 * @Description:
 * 华为抽象工厂
 * @date 2020-05-15 14:20
 */
public class HuaWeiFactory extends PhoneFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Pc makePc() {
        return new HuaWeiPc();
    }
}