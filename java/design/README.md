###Design Patterns

####Adapter Pattern

Client invokes an adapter which internally calls the actual target.

### Creation Patterns
#### Factory

- Simple Factory : single implementation class not hidden behind a interface which creates instance objects.
- Factory Method : multiple implementations of a factory interface. each factory implementation is closely associated to the type of instance object it creates.
- Abstract Factory : multiple implementations of a factory interface. the interface defines multiple methods of creation, each factory implementation is closely associated to the instance of the object that it creates.

#### Builder
Builder encapsulates the steps of creating an instance. there might be a factory infront of the builder which selects a specific builder and returns the instance to the client

#### Factory vs Builder

Factory : 
- provides simple interface to construct simple object or family of objects.

Builder :
- provides simple interface for constructing complex object (with multiple properties)
