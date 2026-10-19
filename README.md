# Programming 2 - Lab 5

Abstract classes and interfaces in Java, using a small smart device system.

## Classes

- `SmartDevice` - abstract base class with brand and model
- `SmartPhone` - extends `SmartDevice`, implements `Chargeable` and `Connectable`
- `SmartSpeaker` - extends `SmartDevice`, implements `Connectable`
- `Chargeable` - interface with `charge()`
- `Connectable` - interface with `connectToWiFi()`
- `Main` - creates the devices and tests `testCharging()`

## Run

```
cd src
javac *.java
java Main
```
