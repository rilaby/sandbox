# Design patterns
  DP goal is *experience reuse* (the same approach as *code reuse*). DPs are the kind of language to communicate with other architects.


 Three main categories all design patterns fall in:
 * Creational DP
 * Structural DP
 * Behavior DP

### Adapter (aka Wrapper)
**Intent:** Wrap object to make their interfaces look like they are not.
**Players:** Client, Adapter, Adapte, Target interface/class.
**How-To:** Adapter implements Target interface (the one, Client expects); wraps/compose sAdaptee and implements it's interface having an ability to delegate to Adaptee.
**Types:** Object vs Class adapters. Object Adapter composes Adaptee and implements Target interface while class Adapter inherits Adaptee and the Target classes.
**Examples:** 


### Facade
**Intent:** Provide simplified/unified interface (making it more straightforward/resonable) to a set of intefraces in subsystem. Also it decomples client from internal interfaces.
**Players:** Client, Facade interface, Set of system interfaces.
**How-to:** -
**Examples:**

### Decorator
**Intent:** Adds new possibilities w/o changin the interface.



### TODO:
Bridge
Builder
Chain of Responsibility
Flyweight
Interpreter
Mediator
Memento
Prototype
Visitor


## Design Principles
#### Principle of Least Knowledge
Talk to your immediate friends only.
#### Law of Demeter == Principle of Least Knowledge