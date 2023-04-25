package com.rremiao.ngsarc.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ExceptionDTO extends Exception{
    
    private int status;
    private String message;

    public ExceptionDTO(String message) {
        super(message);
    }
}
