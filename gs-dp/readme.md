# Design patterns
  DP goal is *experience reuse* (the same approach as *code reuse*). DPs are the kind of language to communicate with other engineers/architects.


 Three main categories all design patterns fall in:
 * Creational DP
 * Structural DP
 * Behavior DP
 
 
## Structural DP

### 1. Adapter (aka Wrapper)
**Intent:** Wrap object to make their interfaces look like they are not.

**Players:** Client, Adapter, Adaptee, Target interface/class.

**How-To:** Adapter implements Target interface (the one, Client expects); wraps/compose Adaptee and implements target interface having an ability to delegate to Adaptee.

**Types:** Object vs Class adapters. Object Adapter composes Adaptee and implements Target interface while class Adapter inherits Adaptee and the Target classes.

**Examples:** 


### 2. Facade
**Intent:** Provide simplified/unified interface (making it more straightforward/reasonable) to a set of interfaces in subsystem. Also it decompiles client from internal interfaces.

**Players:** Client, Facade interface, Set of system interfaces.

**How-to:** -

**Examples:**


### 3. Decorator
**Intent:** Adds new possibilities w/o changing the interface.


### 4. Bridge
TDB

### 5. Flyweight
TBD

### 6. Proxy
TBD


### TODO:
- Builder
- Chain of Responsibility
- Interpreter
- Mediator
- Memento
- Prototype
- Visitor


## Design Principles
#### Principle of Least Knowledge
Talk to your immediate friends only.
#### Law of Demeter == Principle of Least Knowledge
