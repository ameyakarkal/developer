package stack;

public class ArrayBasedStack {

	/**
	 * use a single array for three stacks
	 */
	
	public interface IStrategy {
		
	}
	
	public class Strategy implements IStrategy{
		/**
		 * consider the stack to be made of three arrays.
		 * first stack : 0 to n/3
		 * second stack : n/3 to n/6
		 * third stack : n/6 to n
		 * 
		 * arraySize = N (say 90)
		 * stackSize = N / 3 (say 30);
		 * heads = [
		 * 		headOfFirstStack (say 0),
		 * 		headOfSecondStack(say 0),
		 * 		headOfThirdStack(say 0)]
		 * index = (stack number * stackSize) + heads[stack number] + 1;
		 * 
		 * 
		 * peek(stackNumber) : 
		 * 	calculate index
		 * 	return array[index]
		 * 
		 * pop(stackNumber)
		 * 	calculate index
		 * 	return array[index] and reset the value at the location
		 * 
		 * put(stackNumber, value)
		 * 	calculate index
		 *  set array[index] = value
		 *  increment heads[stackNumber]++
		 */
	}
}
