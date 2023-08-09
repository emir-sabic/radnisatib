package com.radnisatib;

import org.springframework.stereotype.Service;

@Service
public class RadniSatiService {

    private final RadniSatiRepositroy radniSatiRepositroy;

    public RadniSatiService(RadniSatiRepositroy radniSatiRepositroy) {
        this.radniSatiRepositroy = radniSatiRepositroy;
    }

    public String dodajDolazak(String barcode) {

    };
}
