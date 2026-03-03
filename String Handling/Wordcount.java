class Wordcount{
	
	static int wordCount(String s) {
		if(s== null || s.trim().isEmpty())
			return 0;
			String[] words = s.trim().split("\\s+");
		return words.length;
	}
	void main(){
		String str = "Java is Vary Easy";
		System.out.print(wordCount(str));
	    }
	}