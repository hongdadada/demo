package util;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang.StringUtils;

public class FastJsonUtil {
    private static final SerializeConfig serializeConfig = new SerializeConfig();

    public FastJsonUtil() {
    }

    public static String toJsonString(Object obj) {
        return toJsonString(obj, true);
    }

    public static String toJsonString(Object obj, boolean seralizerClass) {
        if (obj != null) {
            if (obj instanceof String && StringUtils.isBlank((String)obj)) {
                return "";
            } else {
                try {
                    return seralizerClass ? JSON.toJSONString(obj, serializeConfig, new SerializerFeature[]{SerializerFeature.WriteClassName}) : JSON.toJSONString(obj, serializeConfig, new SerializerFeature[0]);
                } catch (Exception var3) {
                    return "null";
                }
            }
        } else {
            return "null";
        }
    }

    public static Object jsonParseObject(String json) {
        if (StringUtils.isBlank(json)) {
            return "";
        } else {
            return StringUtils.equalsIgnoreCase(json, "null") ? null : JSON.parse(json);
        }
    }

    public static <T> T toObject(String json, Class<T> clazz) {
        if (StringUtils.isBlank(json)) {
            return null;
        } else {
            return json.equalsIgnoreCase("null") ? null : JSON.parseObject(json, clazz);
        }
    }
}
