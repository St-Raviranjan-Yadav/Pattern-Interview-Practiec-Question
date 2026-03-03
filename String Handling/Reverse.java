class Reverse{
  static String reverse(String s)
  {
   String rev= "";
   
   for(int i=s.length()-1;i>=0; i--)
   {
      rev = rev+ s.charAt(i);
   }
   return rev;
  
  }
  
  void main()
  {
    System.out.print(reverse ("Java"));
  
  }

}