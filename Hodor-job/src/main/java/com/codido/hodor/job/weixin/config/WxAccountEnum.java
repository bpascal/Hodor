package com.codido.hodor.job.weixin.config;

/**
 * 公众号标识的枚举类
 *
 * @author Binary Wang
 */
public enum WxAccountEnum {
    CSD(1, "彩士多"),
    ZDJL(2, "中大奖了");

    private int pubid;
    private String name;

    private WxAccountEnum(int pubid, String name) {
        this.name = name;
        this.pubid = pubid;
    }

    public static int queryPubid(String wxCode) {
        return WxAccountEnum.valueOf(wxCode.toUpperCase()).getPubid();
    }

    public static String queryWxCode(int pubid) {
        for (WxAccountEnum e : values()) {
            if (e.getPubid() == pubid) {
                return e.name().toLowerCase();
            }
        }

        return null;
    }

    public int getPubid() {
        return this.pubid;
    }

    public String getName() {
        return this.name;
    }
}
