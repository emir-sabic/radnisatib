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
    private String currentstate;

    public RadniSatiVM(RadniSatiEntity radniSatiEntity){
        this.barcode = radniSatiEntity.getBarcode();
        this.attendancetype = radniSatiEntity.getAttendancetype();
        this.scanDateTime = radniSatiEntity.getScanDateTime();
        this.currentstate = radniSatiEntity.getCurrentstate();

    }


    public RadniSatiVM(Optional<RadniSatiEntity> bybarcode) {
        this.barcode = bybarcode.get().getBarcode();
        this.attendancetype = bybarcode.get().getAttendancetype();
        this.scanDateTime = bybarcode.get().getScanDateTime();
        this.currentstate = bybarcode.get().getCurrentstate();
    }
}
