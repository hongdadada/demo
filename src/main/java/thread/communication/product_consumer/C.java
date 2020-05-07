package thread.communication.product_consumer;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-05-07 14:58
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}