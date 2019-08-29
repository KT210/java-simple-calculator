import java.util.Scanner;
public class head{
public static void main(String args[]){
int a,b,c;
int ans;
boolean k = true;
while (k){
System.out.println("Welcome from my first calculator!!" + "\n" + "Hope u ehjoy it :)" + "\n" );
Scanner scan = new Scanner(System.in);
System.out.println("Enter first number!"); 
a = scan.nextInt();
System.out.println("Enter second number!");
b = scan.nextInt();
System.out.println("Please"+"\n"+"press 1 for (Addition)!"+"\n"+"press 2 for (Substraction)!"+"\n"+"press 3 for (Multiplication)!"+"\n"+"press 4 for (Division)!"+"\n"+"If u want to get out of the calculator press 0");
c = scan.nextInt();
headfun one = new headfun();
if (c == 1){
   ans = one.add(a,b);
   System.out.println(ans);
}
else if (c == 2){
   ans = one.sub(a,b);
   System.out.println(ans);
}
else if (c == 3){
   ans = one.mul(a,b);
   System.out.println(ans);
}
else if (c == 4){
   ans = one.div(a,b);
   System.out.println(ans);
}
else if (c == 0){
   System.out.println("Bye now:)");
   k = false;
}
else{
   System.out.println("Sorry try again");
  
}
}





}

}