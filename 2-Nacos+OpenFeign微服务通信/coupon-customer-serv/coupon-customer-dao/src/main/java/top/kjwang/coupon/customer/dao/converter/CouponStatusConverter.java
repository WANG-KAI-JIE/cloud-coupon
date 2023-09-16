package top.kjwang.coupon.customer.dao.converter;

import top.kjwang.coupon.customer.api.enums.CouponStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author kjwang
 * @date 2023/9/8
 * @description CouponStatusConverter
 **/
@Converter
public class CouponStatusConverter implements AttributeConverter<CouponStatus, Integer> {

    /**
     * enum 转DB value
     *
     * @param status enum
     * @return Integer
     */
    @Override
    public Integer convertToDatabaseColumn(CouponStatus status) {
        return status.getCode();
    }

    /**
     * DB value 转 enum 值
     *
     * @param code DB value
     * @return CouponStatus
     */
    @Override
    public CouponStatus convertToEntityAttribute(Integer code) {
        return CouponStatus.convert(code);
    }
}