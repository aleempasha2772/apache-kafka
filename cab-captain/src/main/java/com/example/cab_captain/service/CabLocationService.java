package com.example.cab_captain.service;


import com.example.cab_captain.constants.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CabLocationService {


    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public boolean updateCabLocation(String cabLocation) {
        kafkaTemplate.send(AppConstant.CAB_LOCATION,cabLocation);
        return true;
    }

}
