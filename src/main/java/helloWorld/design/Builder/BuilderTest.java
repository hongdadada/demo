package helloWorld.design.Builder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author zhangwei
 * @Description:
 * 建造者模式
 * @date 2020-05-15 10:37
 */
public class BuilderTest {
    private String param1;
    private String param2;
    private String param3;
    private String param4;
    private String param5;
    private String param6;

    public BuilderTest(Builder builder) {
        this.param1=builder.param1;
        this.param2=builder.param2;
        this.param3=builder.param3;
        this.param4=builder.param4;
        this.param5=builder.param5;
        this.param6=builder.param6;
    }

    public static class Builder{
        private String param1;
        private String param2;
        private String param3;
        private String param4;
        private String param5;
        private String param6;
        public Builder param1(String param1){
            this.param1=param1;
            return this;
        }
        public Builder param2(String param2){
            this.param2=param2;
            return this;
        }
        public Builder param3(String param3){
            this.param3=param3;
            return this;
        }
        public Builder param4(String param4){
            this.param4=param4;
            return this;
        }
        public Builder param5(String param5){
            this.param5=param5;
            return this;
        }
        public Builder param6(String param6){
            this.param6=param6;
            return this;
        }
        public BuilderTest build(){
            return new BuilderTest(this);
        }
    }

    public static void main(String[] args) {
        BuilderTest vo1=new BuilderTest.Builder()
                            .param1("参数1")
                            .build();
        System.out.println(JSON.toJSONString(vo1, new SerializeConfig(), SerializerFeature.WriteClassName));
    }
}