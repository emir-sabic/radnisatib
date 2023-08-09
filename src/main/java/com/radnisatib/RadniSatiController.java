package com.radnisatib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/scanner")
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class RadniSatiController {

    @Autowired
    private RadniSatiService radniSatiService;

    @PostMapping("/new")
    public String dodajDolazak (@RequestBody String barcode){
        String status = radniSatiService.dodajDolazak(barcode);
        return status;

    }
}
