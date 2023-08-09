package com.radnisatib;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RadniSatiRepositroy extends JpaRepository<RadniSatiEntity, Long> {

    Optional<RadniSatiEntity> findyByBarcode(String bardcode);
}
