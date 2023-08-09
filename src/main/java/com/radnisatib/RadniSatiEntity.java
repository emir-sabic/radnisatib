package com.radnisatib;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "RadniSati")
@Getter
@Setter
public class RadniSatiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "attendancetype")
    private String attendancetype;

    @Column(name = "scanDateTime")
    private String scanDateTime;



    public RadniSatiEntity(RadniSatiVM radniSatiVM){
        this.barcode = radniSatiVM.getBarcode();
        this.attendancetype = radniSatiVM.getAttendancetype();
        this.scanDateTime = radniSatiVM.getScanDateTime();
    }
    public RadniSatiEntity(){}

    @Override
    public String toString(){
        return "RadniSati{"+
                ", barcode" + barcode + '\'' +
                ", attendancetype" + attendancetype + '\'' +
                ", scanDateTime" + scanDateTime + '\'' +
                "}";
    }
}
