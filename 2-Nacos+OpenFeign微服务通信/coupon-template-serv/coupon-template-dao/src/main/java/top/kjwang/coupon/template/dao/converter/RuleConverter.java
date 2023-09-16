package top.kjwang.coupon.template.dao.converter;

import com.alibaba.fastjson.JSON;
import top.kjwang.coupon.template.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author kjwang
 * @date 2023/9/8
 * @description RuleConverter
 **/
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule, String> {

    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule, TemplateRule.class);
    }
}