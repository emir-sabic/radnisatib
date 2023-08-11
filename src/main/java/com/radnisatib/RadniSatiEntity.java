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

    @Column(name = "currentstate")
    private String currentstate;



    public RadniSatiEntity(RadniSatiVM radniSatiVM){
        this.barcode = radniSatiVM.getBarcode();
        this.attendancetype = radniSatiVM.getAttendancetype();
        this.scanDateTime = radniSatiVM.getScanDateTime();
        this.currentstate = radniSatiVM.getCurrentstate();
    }
    public RadniSatiEntity(){}

    @Override
    public String toString(){
        return "RadniSati{"+
                ", barcode" + barcode + '\'' +
                ", attendancetype" + attendancetype + '\'' +
                ", scanDateTime" + scanDateTime + '\'' +
                ", currentstate" + currentstate + '\'' +
                "}";
    }
}
