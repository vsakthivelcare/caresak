package cn.iocoder.yudao.module.crm.enums.customer;

import cn.iocoder.yudao.framework.common.core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * CRM 客户等级
 *
 * @author Wanwan
 */
@Getter
@AllArgsConstructor
public enum CrmCustomerLevelEnum implements IntArrayValuable {

    IMPORTANT(1, "A（重点客户）"),
    GENERAL(2, "B（普通客户）"),
    LOW_PRIORITY(3, "C（非优先客户）");

    public static final int[] ARRAYS = Arrays.stream(values()).mapToInt(CrmCustomerLevelEnum::getStatus).toArray();

    // TODO @wanwan：这里的 status 字段，可以考虑改成 level
    /**
     * 状态
     */
    private final Integer status;
    /**
     * 状态名
     */
    private final String name;

    @Override
    public int[] array() {
        return ARRAYS;
    }

}