package cn.iocoder.yudao.module.jl.controller.admin.join.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 销售线索中竞争对手的报价更新 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class JoinSaleslead2competitorUpdateReqVO extends JoinSaleslead2competitorBaseVO {

    @Schema(description = "岗位ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "21814")
    @NotNull(message = "岗位ID不能为空")
    private Long id;

}
