package com.awscourse.awscourse.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class DetailedMachine extends Machine implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String javaVersion;
    private String javaVendor;
    private String javaVendorUrl;

    public DetailedMachine(String ip, String name, String os, String architecture,
                           String osVersion, String javaVersion, String javaVendor, String javaVendorUrl) {
        super(ip, name, os, architecture, osVersion);
        this.javaVersion = javaVersion;
        this.javaVendor = javaVendor;
        this.javaVendorUrl = javaVendorUrl;
    }

}


