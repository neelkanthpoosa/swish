import java.util.*;
  
public class CoffeeCost
{

public static void main(String[] args)
{

int discount,temp,coffeeCost,amountForFreeCoffee;
int c=0;

Scanner sc=new Scanner(System.in);
String ip=sc.nextLine();
String[] n=ip.split(" ");
coffeeCost=Integer.parseInt(n[0]);
discount=Integer.parseInt(n[1]);

temp=coffeeCost;
amountForFreeCoffee=coffeeCost;

while(temp>1)
{
    c=temp*discount/100;
    temp-=c;
    amountForFreeCoffee+=temp;
}
if(temp<=1)
System.out.println(amountForFreeCoffee);


}
 
