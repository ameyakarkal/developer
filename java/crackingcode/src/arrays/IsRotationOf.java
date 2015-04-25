package arrays;

public class IsRotationOf {

	/**
	 * check if sentence is rotation of word;
	 * 
	 * @author akarkal
	 *
	 */
	public interface IStrategy{
		
		boolean test(String sentence, String word);
		
	}
	
	
	public static class JoinAndSubstringStrategy implements IStrategy{

		@Override
		public boolean test(String sentence, String word) {
			String padded = sentence + sentence;
			
			return isSubstring(word, padded);
		}
		
		public boolean isSubstring(String word, String sentence){
			return sentence.indexOf(word) != -1;
		}
	}
}