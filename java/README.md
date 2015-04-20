Core Concepts
- Class loaders [^link](http://www.ibm.com/developerworks/library/j-dyn0429/)
- Dynamic *`Class.forName(..)`* vs Static *(new operator)* class loading
- Polymorphism vs Composition
- Collections
  - Vector vs ArrayList vs HashMap
  - Collection, List, Set, Map
- Threads
- Garbage Collection


#### Garbage Collection.
Java collects garbage on behalf of the user.

##### What Objects are garbage collected
- objects with no references
- objects created in a scope that does not exist
- objects where the only reference was parent -> child and has been nulled out
- circular reference of objects which are referenced.

##### Garbage Collection Generation
- young generation. newly created java objects. Further divided into Eden. Surviror1 and Survivio2
- tenured generation : 
- perm gen space

##### Garbage collectors
- Throughput garbage collector : parallel in young, serial in tenured generation
- Concurrent garbage collector : concurrent in tenured. runs alonside application. 
- Incremental garbage collector : train garbage collector. no active development since 1.4

##### Garbage collection algorithms
- Reference counting
 - compiler adds reference counts to objects.
 - difficult to mantain
 - over head of reference count
 - over head of maintainging reference count
 - cannot handle cyclic references
- Mark and Sweep
 - stops the application thread
 - marks objects that are reachable, unmarked objects are then selected for garbage collection
 - handles cyclic references
 - poor performance / framentation
- Copy Collector
 - maintains two regions
 - when the active region is full, the live objects are copied to the inactive region and entire active region can be marked as inactive.
- Mark and Copy
 - application threads are stopped
 - live objects are marked for entire object tree
 - all marked objects are collected and compacted at the bottom of the heap
- Generational Collection.
 - objects are divided into generations. young generation, tenured generation and perm gen. different algorithm can be applied to each generation 
