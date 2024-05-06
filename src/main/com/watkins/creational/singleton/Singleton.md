# Singleton Pattern

## about

A singleton class only has one instance, and is shared globally with a global state
subclasses and inheritance are not allowed
class constructors not available globally

```mermaid
classDiagram
    class Singleton {
        - static instance: Singleton
        - constructor()
        + static getInstance(): Singleton
    }

    Singleton ..> Singleton
    class Client
    Client --> Singleton
```

## implementation

### eager singleton

instance created as soon as aclassloaded

### lazy singleton

singleton instance is created when it is first asked for


