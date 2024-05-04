# Health Monitoring Drone

## Overview

This project simulates a Health Monitoring Drone implemented in Java. The drone collects health data such as heart rate, body temperature, and blood pressure and provides real-time monitoring of individuals' health status.

## Features

- **Health Data Collection:** Simulates collecting health data using onboard sensors.
- **Real-time Monitoring:** Provides real-time monitoring of heart rate, body temperature, and blood pressure.
- **Randomized Data Generation:** Generates simulated health data within realistic ranges for demonstration purposes.

## Getting Started

1. **Clone the Repository:**
    
    ```bash
    git clone <https://github.com/yourusername/health-monitoring-drone.git>
    
    ```
    
2. **Compile and Run:**
    
    ```bash
    cd health-monitoring-drone
    javac HealthMonitoringDroneSimulation.java
    java HealthMonitoringDroneSimulation
    
    ```
    
3. **View Health Data:**
    
    View the simulated health data collected by the drone, including heart rate, body temperature, and blood pressure.
    

## Usage

1. **Collect Health Data:**
    
    ```java
    HealthMonitoringDrone drone = new HealthMonitoringDrone();
    drone.collectHealthData();
    
    ```
    
2. **Get Latest Health Data:**
    
    ```java
    HealthData latestHealthData = drone.getLatestHealthData();
    
    ```
    
3. **Display Health Data:**
    
    Display the latest health data obtained from the drone.
    

## Contributors

- Jeel patel
