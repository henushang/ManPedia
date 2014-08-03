package com.manpedia.web.base.eentity;

/**
 * @Description:
 * @Author: Jianguo Shang
 * @Createtime: 2014-07-08 22:09
 */
public enum EStatus {

    init("0"), enable("1"), disable("2"), deleted("3");

    private final String value;

    private EStatus(String v) {
        this.value = v;
    }

    public String toString() {
        return this.value;
    }

    public static EStatus get(int v) {
        String str = String.valueOf(v);
        return get(str);
    }

    public static EStatus get(String str) {
        for (EStatus e : values()) {
            if(e.toString().equals(str)) {
                return e;
            }
        }
        return null;
    }
}
