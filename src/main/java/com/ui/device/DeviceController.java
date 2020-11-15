package com.ui.device;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;

import java.util.List;

@Controller("/devices")
class DeviceController {

    private final DeviceService deviceService;

    DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @Post
    void add(Device device) {
        // TODO: Implement registration of device
    }

    @Get
    List<Device> allDevices() {
        // TODO: Implement retrieval of all devices
        return null;
    }

    @Get("/topology")
    DeviceTopology topology() {
        // TODO: Implement building all device topology
        return null;
    }

    @Get("/{deviceMac}")
    Device device(@PathVariable String deviceMac) {
        // TODO: Implement retrieval of specific device by MAC address
        return null;
    }

    @Get("/{uplinkDeviceMac}/topology")
    DeviceTopology topologyFromUplink(@PathVariable String uplinkDeviceMac) {
        // TODO: Implement building device topology from specific uplink device
        return null;
    }
}
