# Flyweight


The Flyweight design pattern is a structural pattern aimed at minimizing memory usage by sharing as much data as possible between similar objects. It's particularly useful when you need to create a large number of objects that share common properties.

## UML

```mermaid
classDiagram
    class Flyweight {
        +operation(extrinsicState)
    }

    class ConcreteFlyweight {
        -intrinsicState
        +operation(extrinsicState)
    }

    class FlyweightFactory {
        +getFlyweight(key): Flyweight
        -flyweights: Map
    }

    class Client {
        +extrinsicState
        +request()
    }

    Flyweight <|-- ConcreteFlyweight
    FlyweightFactory --> Flyweight
    Client --> FlyweightFactory
```
