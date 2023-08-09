package com.radnisatib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.radnisatib.RadniSatiEntity;
import com.radnisatib.RadniSatiVM;



@RequestMapping("/api/scanner")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class RadniSatiController {

    @Autowired
    private RadniSatiService radniSatiService;

    @PostMapping("/new")
    public RadniSatiVM  createScan (@RequestBody RadniSatiVM radniSati){
        return new RadniSatiVM(this.radniSatiService.createScan(new RadniSatiEntity(radniSati)));
    }


    public String findByBarcode(String barcode){
        String zadnji = String.valueOf(this.radniSatiService.findByBarcode((barcode)));
        System.out.println(barcode);
        return zadnji;
    }



}
