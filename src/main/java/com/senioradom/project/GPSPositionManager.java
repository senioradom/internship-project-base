package com.senioradom.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GPSPositionManager {

    private final GPSPositionRepository gpsPositionRepository;

    @Autowired
    public GPSPositionManager(
            final GPSPositionRepository gpsPositionRepository
    ) {
        this.gpsPositionRepository = gpsPositionRepository;
    }

    /**
     * TODO Modify to retrieve GPSPosition from database
     */
    public List<GPSPosition> findAll() {
        return List.of(GPSPosition.builder().id(1L).build(), GPSPosition.builder().id(2L).build());
    }
}
