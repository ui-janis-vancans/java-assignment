package com.ui.device;

import javax.inject.Singleton;

@Singleton
class DeviceService {

    private final DeviceRepository deviceRepository;

    DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    // TODO: Implement service layer
}
