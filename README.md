## Prerequisites
- Java 8 or higher

## What will be evaluated
- Completion of requirements
- Code quality
- Meaningful test coverage

## Description
Application allows to register devices. Device could be any of given types - `gateway`, `switch` or `access_point`.

Device may or may not have `uplinkMac`.
There can be multiple devices connected to one uplink device. Each device is connected to one uplink at a time.


## Task
1. Add `type` property to `Device` class

2. Define data structure for `DeviceTopology`, it should represent how devices are connected considering `uplinkMac` and `mac` properties

3. Implement `DeviceController` endpoints, use `DeviceService` and `InMemoryDeviceRepository` classes.
    - POST `/devices` should allow to register a `Device`
    - GET `/devices` should return all registered devices, returned list should be ordered by device type (`gateway` > `switch` > `access_point`)
    - GET `/devices/topology` should return topology for all registered devices
    - GET `/devices/{mac}` should return registerd device with matching MAC address
    - GET `/devices/{mac}/topology` should return topology where upmost device has matching MAC address 

## Definition of done
- Application can be built and runs without any additional local configuration needed
- Task requirements defined above are completed

## Definition of done
- Feel free to refactor existing code
- Feel free to add other 3rd party libraries if needed
