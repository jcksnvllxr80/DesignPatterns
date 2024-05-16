# Adapter (AKA Wrapper)

## About

Useful when you have there is an existing class that provides a functionality we need, but the interface is 
not the same as what is expected by the client code. Also known as "Wrapper" because it wraps the object

**Adaptee** - class provides the functionality needed by the client but the client expects a class
that implements the target interface.  
**Target** - interface expected by the client  
**Client** - needs functionality of adaptee, but with a different interface  
**Adapter** - Adapts existing functionality to target interface

## two types of Adapters patterns and their differences

1. Class (two-way) adapter [more harmful than useful]  
   **adapter** implements the target interface, and "*is a*" (inheritance) Adaptee
2. Object adapter [preferred adapter pattern]  
   **adapter** implements the target interface, but "*has a*" (composition) Adaptee

### Class Adapter Pattern [UML](./classadapter/ClassAdapter.md)

### Object Adapter Pattern [UML](./objectadapter/ObjectAdapter.md)
