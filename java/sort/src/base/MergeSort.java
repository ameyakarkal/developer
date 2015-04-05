package base;
public class MergeSort implements ISort{

	private final int[] _input;
	
	public MergeSort(int[] input){
		_input = input;
	}

	@Override
	public int[] sort() {
		return _input;
	}
}