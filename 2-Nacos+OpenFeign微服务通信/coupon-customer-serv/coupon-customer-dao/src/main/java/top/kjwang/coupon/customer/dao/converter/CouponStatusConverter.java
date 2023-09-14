package top.kjwang.coupon.customer.dao.converter;
import jakarta.persistence.AttributeConverter;
import top.kjwang.coupon.customer.api.enums.CouponStatus;

public class CouponStatusConverter implements AttributeConverter<CouponStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(CouponStatus couponStatus) {
        return couponStatus.getCode();
    }

    @Override
    public CouponStatus convertToEntityAttribute(Integer code) {
        return CouponStatus.convert(code);
    }
}
