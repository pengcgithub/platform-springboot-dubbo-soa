package com.platform.soa.order.enums;

/**
 * 订单状态<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.enums
 * @since 2019/1/24
 */
public enum OrderStatusEnum {

    /**
     * 未支付
     */
    NOT_PAY(1, "未支付"),

    /**
     * 支付中
     */
    PAYING(2, "支付中"),

    /**
     * 支付失败
     */
    PAY_FAIL(3, "支付失败"),

    /**
     * 支付成功
     */
    PAY_SUCCESS(4, "支付成功");

    private Integer code;
    private String desc;

    OrderStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }}
