# Design Patterns

This code comes from following along with a 
[Udemy course on Design Patterns in Java](https://www.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects)

## SOLID Principles

### 1. Single Responsibility Principle (SRP)
A class should have only one reason to change. It means that a class should have only one job or responsibility.
This means the class should encapsulate only one aspect of the software's functionality.

### 2. Open/Closed Principle (OCP)
Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. 
"Open for Extension" means that the behavior of a module can be extended or augmented without modifying its source code.
New functionality can be added to the system by introducing new code, typically through inheritance, composition, or 
other means of extension, without changing existing code.
"Closed for Modification" emphasizes that once a module is completed and tested, its implementation should not be 
modified. Changes to existing code may introduce new bugs or unintended side effects. Instead of modifying existing 
code, the existing behavior should be extended or adapted through well-defined extension points.

### 3. Liskov Substitution Principle (LSP)
Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the 
program. In other words, if S is a subtype of T, then objects of type T may be replaced with objects of type S without 
altering the desired properties of the program.

### 4. Interface Segregation Principle (ISP)
A client should never be forced to implement an interface that it doesn't use, or clients shouldn't be forced to depend 
on methods they do not use. 

### 5. Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not 
depend on details. Details should depend on abstractions. Pass objects into constructors instead of values to build the 
objects inside another object.
