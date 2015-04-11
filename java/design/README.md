###Design Patterns

####Adapter Pattern

Client invokes an adapter which internally calls the actual target.

### Creation Patterns
#### Factory
A factory implementation hides details of creating an instance. the factory returns single type of object, but hides details like pooling / sub class instance depending on request type

#### Builder
Builder encapsulates the steps of creating an instance. there might be a factory infront of the builder which selects a specific builder and returns the instance to the client
