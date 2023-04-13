package com.rremiao.ngsarc.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExceptionDTO {
    
    private int status;
    private String message;
}
