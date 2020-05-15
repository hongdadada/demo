package helloWorld.design.SingleTon;

/**
 * @author zhangwei
 * @Description:
 * 单例 双重校验锁 饿汉模式
 * @date 2020-05-15 14:29
 */
public class SingleTon {
    public SingleTon() {
    }

    public static volatile SingleTon singleTon=new SingleTon();

    public static SingleTon getInstance(){
        if(singleTon==null){
            synchronized(singleTon){
                if(singleTon==null){
                    return  new SingleTon();
                }
            }
        }
        return singleTon;
    }
}