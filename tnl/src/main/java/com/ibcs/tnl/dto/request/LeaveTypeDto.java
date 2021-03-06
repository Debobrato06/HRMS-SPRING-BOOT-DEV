package com.ibcs.tnl.dto.request;

import com.ibcs.tnl.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveTypeDto extends BaseDto {

    private String name;

    private Integer allowedLeaveNoMonthly;

    private Integer allowNoOfLeaveYearly;

    private boolean active;

    private String userMessage;

}
