package com.manpedia.web.front.user.eentity;

/**
 * @Description: 性別枚举类
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-08 22:09
 */
public enum EGender {

    male("0"),
    female("1");

    private final String value;

    private EGender(String v) {
        this.value = v;
    }

    public String toString() {
        return this.value;
    }

    public static EGender get(int v) {
        String str = String.valueOf(v);
        return get(str);
    }

    public static EGender get(String str) {
        for (EGender e : values()) {
            if (e.toString().equals(str)) {
                return e;
            }
        }
        return null;
    }
}
