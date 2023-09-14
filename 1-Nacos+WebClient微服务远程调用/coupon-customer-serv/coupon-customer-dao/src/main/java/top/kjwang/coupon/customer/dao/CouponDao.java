package top.kjwang.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kjwang.coupon.customer.dao.entity.Coupon;

/**
 * @author kjwang
 * @date 2023/9/9 18:43
 * @description CouponDao
 */
public interface CouponDao extends JpaRepository<Coupon,Long> {

	long  countByUserIdAndTemplateId(Long userId, Long templateId);
}
