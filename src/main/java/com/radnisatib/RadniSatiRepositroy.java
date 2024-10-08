package com.radnisatib;

import com.radnisatib.RadniSatiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RadniSatiRepositroy extends JpaRepository<RadniSatiEntity, Long> {
    RadniSatiEntity findFirstByBarcodeOrderByScanDateTimeDesc(String barcode);
    List<RadniSatiEntity> findAllByOrderByScanDateTimeDesc();




}
