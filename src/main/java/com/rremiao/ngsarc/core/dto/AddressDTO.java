package com.rremiao.ngsarc.core.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
    
    private int id;
    private String street;
    private int number;
    private String complement;
    private String district;
    private String uf;
    private String cep;
}
