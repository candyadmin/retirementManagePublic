package com.ew.gerocomium.dao.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "编辑沟通记录请求实体")
public class EditCommunicationRecordQuery {
    @ApiModelProperty(value = "沟通记录编号", required = true, example = "1")
    private Long id;
    @ApiModelProperty(value = "沟通记录", required = true, example = "测试记录")
    private String communicationRecord;
    @ApiModelProperty(value = "记录时间", required = true, example = "2022-12-13")
    private String recordDate;
}
