package com.radnisatib;

import com.radnisatib.service.QRCodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class TestReadingQRCode implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(TestReadingQRCode.class);

    @Autowired
    private QRCodeService qrCodeService;

    @Override
    public void run(String... args) throws Exception {
        String qrCodeFilePath = "C:\\Users\\VAHDETA\\Desktop\\qrcode.png";
        File qrCodeFile = new File(qrCodeFilePath);

        String qrCodeContent = qrCodeService.readQRCode(qrCodeFile);
        logger.info("Decoded QR Code Content: " + qrCodeContent);
    }
}