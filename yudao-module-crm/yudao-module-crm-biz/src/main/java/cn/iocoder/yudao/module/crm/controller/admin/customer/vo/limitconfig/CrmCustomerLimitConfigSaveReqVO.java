package cn.iocoder.yudao.module.crm.controller.admin.customer.vo.limitconfig;

import com.mzt.logapi.starter.annotation.DiffLogField;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Schema(description = "管理后台 - 客户限制配置创建/更新 Request VO")
@Data
public class CrmCustomerLimitConfigSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27930")
    private Long id;

    @Schema(description = "规则类型", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "规则类型不能为空")
    @DiffLogField(name = "规则类型")
    private Integer type;

    // TODO @puhui999：可以把 Function 那的 functionName 搞成 NAME 枚举，这里直接引用。这样后续改动更方便哈。
    @Schema(description = "规则适用人群")
    @DiffLogField(name = "规则适用人群", function = "getAdminUserById")
    private List<Long> userIds;

    @Schema(description = "规则适用部门")
    @DiffLogField(name = "规则适用部门", function = "getDeptById")
    private List<Long> deptIds;

    @Schema(description = "数量上限", requiredMode = Schema.RequiredMode.REQUIRED, example = "28384")
    @NotNull(message = "数量上限不能为空")
    @DiffLogField(name = "数量上限")
    private Integer maxCount;

    @Schema(description = "成交客户是否占有拥有客户数(当 type = 1 时)")
    @DiffLogField(name = "成交客户是否占有拥有客户数")
    private Boolean dealCountEnabled;

}