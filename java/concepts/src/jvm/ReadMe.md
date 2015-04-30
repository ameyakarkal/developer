##Memory management in java
- Heap is created when jvm spins up.
- size of the heap changes as application runs.
- heap is divided into areas known as generation
- nursery contains newly created objects.
- after garbage collection objects are promoted to older generation.

java threads receive thread local areas, for storing small objects so that they don not have
synchronize.

###garbage collection
mark and sweep
	- concurrent mark and sweep
		-concurrent mark
			- initial (mark root) threads are working
			- concurrent ( mark all objects) threads are working
			- pre clean up (mark objects created during concurrent marking) threads are working
			- final (mark objects created during pre clean up) threads are paused.
		-concurrent sweep
		- sweep half, threads are running
		- pause to switch sides
		- sweep half, threads are running
		- pause to collect statistics
	- parallel mark and sweep. performed on all cpu and threads are paused.
	- generational garbage collection
		- nursery.
		- promoted to higher generation
		
		
garbage collection strategy
dynamic
- throughput : optimized for running application
- pausetime : short time bursts of garbage collection
- deterministic : regular deterministic garbage collection
static
 - single generation parallel
 - single generation concurrent
 - two generation parallel
 - two generation concurrent
	
#### Class loader
jvm has a primordial class loader, that loads all the trusted classes.
allows users class loader to hook in

1. check if class is already loaded
2. check with super class loader if it loaded class
3. load the definition
4. cache the definition. use the same definition for other calls for the same class.
		
what happens when a java program runs using

``` 
java Test
```
01. the jvm tries to run execute the static main method of the class Test
02. it loads the class binary using class loader.
03. after load

...more details required.