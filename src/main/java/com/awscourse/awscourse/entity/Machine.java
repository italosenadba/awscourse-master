package com.awscourse.awscourse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Machine implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String ip;
    private String name;
    private String os;
    private String architecture;
    private String osVersion;

}
