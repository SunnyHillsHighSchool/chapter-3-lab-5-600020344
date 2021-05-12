//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
 private Stack<Double> stack;
 private String expression;

 public PostFix()
 {
   this("");
 }

 public PostFix(String exp)
 {
   stack = new Stack<Double>();
   expression = exp;
 }

 public void setExpression(String exp)
 {
   expression = exp;
 }

 public double calc(double one, double two, char op)
 {
   switch (op)
       {
         case '+':
          return two + one;
         case '-':
          return two - one;
         case '/':
         return two / one;
         case '*':
          return two * one;
       }
      return 0.0;
 }

 public void solve()
 {
   for (int i = 0; i<expression.length(); i++)
   {
     if(Character.isDigit(expression.charAt(i)))
     {
       stack.push((double)expression.charAt(i)-'0');
     } else {
       switch (expression.charAt(i))
       {
         case '+':
         case '-':
         case '/':
         case '*':
          stack.push(calc(stack.pop(),stack.pop(),expression.charAt(i)));
          break;
       }
     }
   }
 }

 //add a toString
 public String toString()
 {
   return expression + " = " + stack.peek();
 }
}
