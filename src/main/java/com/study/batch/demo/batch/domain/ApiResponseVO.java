package com.study.batch.demo.batch.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResponseVO {
    private int status;
    private String msg;
}
