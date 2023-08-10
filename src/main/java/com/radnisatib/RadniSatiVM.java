package com.radnisatib;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class RadniSatiVM {
    private String barcode;
    private String attendancetype;
    private String scanDateTime;

    public RadniSatiVM(RadniSatiEntity radniSatiEntity){
        this.barcode = radniSatiEntity.getBarcode();
        this.attendancetype = radniSatiEntity.getAttendancetype();
        this.scanDateTime = radniSatiEntity.getScanDateTime();

    }


}
