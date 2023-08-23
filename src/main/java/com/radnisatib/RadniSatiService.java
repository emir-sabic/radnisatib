package com.radnisatib;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RadniSatiService {

    private final RadniSatiRepositroy radniSatiRepositroy;

    public RadniSatiService(RadniSatiRepositroy radniSatiRepositroy) {
        this.radniSatiRepositroy = radniSatiRepositroy;
    }

    public RadniSatiEntity createScan(RadniSatiEntity radniSatiEntity){
        return this.radniSatiRepositroy.save(radniSatiEntity);
    }

    public RadniSatiEntity findBybarcode(String barcode){
        return radniSatiRepositroy.findFirstByBarcodeOrderByScanDateTimeDesc(barcode);
    }

    public List<RadniSatiEntity> findAllByOrderByScanDateTimeDesc(){return this.radniSatiRepositroy.findAllByOrderByScanDateTimeDesc();}


}
