## Prerequisites
- Java 8 or higher

## Requirements
- `Gradle` or `Maven` as build tool, preferably with wrapper included
- Application can be built and run without any additional configuration needed, provide necessary commands for running it
- Feel free to design API as you wish - it can be REST API, CLI application, etc.
- Feel free to choose any 3rd party libraries you find useful

## What will be evaluated
- Completion of requirements
- Code quality & design
- Meaningful test coverage

## Description
Network deployment might consist of several devices.

Networking device might be of following types:
- `Gateway` - serves as access point to another network
- `Switch` - connects devices on a computer network
- `Access Point` -  connects devices on a computer network via Wi-Fi

Typically, these devices are connected to one another and collectively form a network deployment.
Every device on a computer network can be identified by [MAC address](https://en.wikipedia.org/wiki/MAC_address).
**If** device is attached to another device in same network, it is represented via *uplink* reference.

## Task
Define and implement *Device API*, which should support following features:
- Registering a device to a network deployment
    - **input**: `deviceType`, `macAddress`, `uplinkMacAddress`
- Retrieving all registered devices, sorted by *device type*
    - **output**: sorted list of devices, where each entry has `deviceType` and `macAddress` (sorting order: `Gateway` > `Switch` > `Access Point`) 
- Retrieving network deployment device by MAC address
    - **input**: `macAddress`
    - **output**: `Device` entry, which consists of `deviceType` and `macAddress`
- Retrieving all registered network device topology
    - **output**: `Device topology` as [tree structure](https://en.wikipedia.org/wiki/Tree_(data_structure)), node should be represented as `macAddress`
- Retrieving network device topology starting from a specific device
    - **input**: `macAddress`
    - **output**: `Device topology` where root node is `device` with matching `macAddress`

Additional notes:
- Device may or may not be connected to uplink device 

## Submission
- Provide URL to a public repository or send project files as ZIP archive
