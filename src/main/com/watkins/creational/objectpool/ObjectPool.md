# Object Pool

When a lot of objects which are expensive to create are needed, an object pool is useful, but it can hurt your 
applications performance if object pool is not implemented correctly and carefully.

```mermaid
classDiagram

    ObjectPool <.. Client
    AbstractReusable <.. Client
    AbstractReusable <--o ObjectPool
    ObjectPool : +getReusable()
    ObjectPool : +releaseReusable()
    ObjectPool ..> ConcreteReusable

    AbstractReusable <|-- ConcreteReusable
    AbstractReusable : +operation()

    ConcreteReusable : -state
    ConcreteReusable : +operation()
    ConcreteReusable : +reset()
```