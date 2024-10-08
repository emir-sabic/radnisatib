package com.radnisatib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/scanner")
@RestController
@CrossOrigin(origins = "*")
public class RadniSatiController {

    @Autowired
    private RadniSatiService radniSatiService;

    @PostMapping("/new")
    public RadniSatiVM  createScan (@RequestBody RadniSatiVM radniSati){
      return new RadniSatiVM(this.radniSatiService.createScan(new RadniSatiEntity(radniSati)));
    }

    @GetMapping("/search/{barcode}")
    public RadniSatiVM searchByBarcode (@PathVariable String barcode){
        return new RadniSatiVM(this.radniSatiService.findBybarcode(barcode));
    }

    @GetMapping
    public List<RadniSatiVM> findAllScans(){
        return this.radniSatiService.findAllByOrderByScanDateTimeDesc().stream().map(
                RadniSatiVM::new
        ).toList();
    }






}
