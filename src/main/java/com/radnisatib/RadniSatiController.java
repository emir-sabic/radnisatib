package com.radnisatib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/scanner")
public class RadniSatiController {

    @Autowired
    private RadniSatiService radniSatiService;

    @PostMapping
    public ResponseEntity<String> dodajDolazak (@RequestBody String barcode){
        System.out.println("okk");
        return ResponseEntity.ok("Attendance recorded successfully.");

    }
}
