package helloWorld.design.Temple;

/**
 * @author zhangwei
 * @Description:
 * 模板模式即为主逻辑已经实现在了抽象方法的实现中，子类无法修改，子类只能按照此模板填充相关的不同实现
 * @date 2020-05-15 15:13
 */
public abstract class AbstartTemple {
    //逻辑已经在抽象类顶层中实现，子类无法修改，只能填充抽象的业务逻辑
    public void templeMethod(){
        method1();
        method2();
    }
    //交给子类来实现
    public abstract String method1();
    //交给子类来实现
    public abstract String method2();
}