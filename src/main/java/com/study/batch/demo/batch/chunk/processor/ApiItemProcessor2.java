package com.study.batch.demo.batch.chunk.processor;

import com.study.batch.demo.batch.domain.ApiRequestVO;
import com.study.batch.demo.batch.domain.ProductVO;
import org.springframework.batch.item.ItemProcessor;

public class ApiItemProcessor2 implements ItemProcessor<ProductVO, ApiRequestVO> {

    @Override
    public ApiRequestVO process(ProductVO item) throws Exception {
        return ApiRequestVO.builder()
                .id(item.getId())
                .productVO(item)
                .build();
    }
}
