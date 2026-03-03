
//6.Take input of age of 3 people by user and determine oldest and youngest among them.


class day6{

void main(){

  System.out.print("Enter the Age-1: ");
  int age1=new java.util.Scanner(System.in).nextInt();
  System.out.print("Enter the Age-2: ");
   int age2=new java.util.Scanner(System.in).nextInt();
    System.out.print("Enter the Age-3: ");
	 int age3=new java.util.Scanner(System.in).nextInt();


if(age1>age2 && age1>age3){
 System.out.println("Oldest: " +age1);
}
else if(age2>age1 && age2>age3){
 System.out.println("Oldest: " +age2);
 
}
else if(age3>age1 && age3>age2){
 System.out.println("Oldest: " +age3);

}
  if(age1<age2 && age1<age3){
   System.out.println("Youngest: " +age1);
  }
  
else if(age2<age1 && age2<age3){
   System.out.println("Youngest: " +age2);
   
}
 else if(age3<age1 && age3<age2){
   System.out.println("Youngest: " +age3);
  }

else{
	System.out.println("Same Age");
}

}

}