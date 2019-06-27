package com.qf.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes implements Serializable {

    private Integer id;
    private String cname;
    private Integer csum;
}
