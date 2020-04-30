package thread.threadsafe;

/**
 * @author zhangwei
 * @Description:
 * @date 2020-04-30 13:56
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){
        try {
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username "+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}