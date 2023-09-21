package top.kjwang.coupon.template.dao.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import top.kjwang.coupon.template.api.enums.CouponType;


/**
 * @author kjwang
 * @date 2023/9/8
 * @description CouponTypeConverter
 **/
@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType, String> {

    @Override
    public String convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}
