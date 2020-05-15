package helloWorld.design.Factory.SimpleFactory;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-15 14:09
 */
public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("huawei")){
            return new HuaWeiPhone();
        }
        else if(phoneType.equalsIgnoreCase("xiaomi")) {
            return new XiaoMIPhone();
        }
        return null;
    }
}