package com.radnisatib;

import org.springframework.stereotype.Service;

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

    public Optional<RadniSatiEntity> findByBarcode(String bardcode){return this.radniSatiRepositroy.findyByBarcode(bardcode);}

}
