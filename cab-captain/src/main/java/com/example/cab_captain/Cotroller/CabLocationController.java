package com.example.cab_captain.Cotroller;

import com.example.cab_captain.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/cablocation")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;


    @PutMapping
    public ResponseEntity getCabLocationService() throws InterruptedException {
        int range = 100;
        while (range > 0) {
            cabLocationService.updateCabLocation(Math.random()+ " "+Math.random());
            System.out.println("cab location updated");
            Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated")
                , HttpStatus.OK);

    }


}
