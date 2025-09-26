class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   
int a = 3;
int B = 6;
int c = B+a;
System.out.println("the sum is " + c);

/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/


int grade1 = 86; 
int grade2 = 66;
int grade3 = 100;
int total = grade1 + grade2 + grade3;
System.out.println("the total is " + total);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

int amount = 3;
int avg = total/amount;
System.out.println("the average is " + avg);

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  
int A = 7;
int x = 2;
double y = A/(x+1);
System.out.println("the answer is " + y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/


double y1 = 2*x*(x+1)*(-x/2)/A;
System.out.println("the answer is " + y1);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
int b = 6;
int h = 7;
double area = 0.5*(b*h);
System.out.println("the area is " + area);




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int egg = 100;
int basket = 12;
int fullbasket = egg/basket;
int remain = egg % basket;
System.out.println("the basket total is " + fullbasket);
System.out.println("the remainder is " + remain);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}