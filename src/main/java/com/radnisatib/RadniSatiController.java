package com.radnisatib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/get")
    public RadniSatiVM fetchScan (@PathVariable String scan){
        System.out.println("mujo");
        return new RadniSatiVM(this.radniSatiService.findBybarcode(scan));
    }




}
