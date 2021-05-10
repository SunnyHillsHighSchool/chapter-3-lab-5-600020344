# Chapter-3-Lab-5

**Lab Goal :** This lab was designed to teach you more about stacks.

**Lab Description :** Take a postfix expression and solve it. All numbers will be in the range 0 to 9.  

      

Standard infix expression 7 + 8 - 2

Standard postfix expression 7 8 + 2 -

**Sample Data :** 

      

2 7 + 1 2 + +

1 2 3 4 + + +

9 3 * 8 / 4 +

3 3 + 7 * 9 2 / +

9 3 / 2 * 7 9 * + 4 –

5 5 + 2 * 4 / 9 +

**Sample Output :**

2 7 + 1 2 + + = 12.0

1 2 3 4 + + + = 10.0

9 3 * 8 / 4 + = 7.375

3 3 + 7 * 9 2 / + = 46.5

9 3 / 2 * 7 9 * + 4 - = 65.0

5 5 + 2 * 4 / 9 + = 14.0

**_algorithm help_**

while     there are more values in the original expression

{

get the next value

if the value is a number

push the number onto the stack

else if the value is an operator

pop 2 numbers from the stack

use the operator to evaluate the 2     numbers

push the resulting number onto the     stack

}

return the top value from the     stack 
