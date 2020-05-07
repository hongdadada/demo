package thread.communication.product_consumer;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 14:57
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}