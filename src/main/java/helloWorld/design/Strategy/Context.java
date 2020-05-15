package helloWorld.design.Strategy;

/**
 * @author zhangwei
 * @Description:
 * 策略模式
 * @date 2020-05-15 11:01
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new OneStrategy());
        context.getStrategy().doSomeThing();

        context.setStrategy(new TwoStrategy());
        context.getStrategy().doSomeThing();

        context.setStrategy(new ThreeStrategy());
        context.getStrategy().doSomeThing();
    }
}