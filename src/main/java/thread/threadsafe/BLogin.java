package thread.threadsafe;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 13:59
 */
public class BLogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}