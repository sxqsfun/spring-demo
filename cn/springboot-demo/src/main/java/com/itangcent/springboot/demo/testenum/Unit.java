package com.itangcent.springboot.demo.testenum;

/**
 * 单位
 *
 * @author dany
 * @date 2021/06/24
 */
public class Unit {

    public enum Type {

        /**
         * 真实单位
         */
        real(0, " 真实单位"),
        /**
         * 虚拟单位
         */
        virtual(1, "虚拟单位");

        private int code;
        private String desc;

        Type(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer getValue() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }
    }

    /**
     * 类型
     */
    private Type type;

}
