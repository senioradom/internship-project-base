package com.senioradom.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GPSPositionController {

    private final GPSPositionManager gpsPositionManager;

    @Autowired
    public GPSPositionController(
            GPSPositionManager gpsPositionManager
    ) {
        this.gpsPositionManager = gpsPositionManager;
    }

    /**
     * REST API example
     */
    @GetMapping("/gps-positions")
    public List<GPSPosition> findAllGPSPositions() {
        return gpsPositionManager.findAll();
    }
}
