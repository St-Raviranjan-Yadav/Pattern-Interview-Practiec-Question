
class Boolean{
  static boolean palindrome(String s)
  {
    int start=0;
	int end = s.length()-1;
	
	while(start < end)
	{
	if(s.charAt(start) != s.charAt(end))
	{
	  return false;
	}
	start++;
	end--;
	
	}
	return true;
  
  }
  void main()
  {
    System.out.print(palindrome("madan"));
	//true
	
	System.out.print(palindrome("java"));
  //false
  }



}