
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/

System.out.println("Enter number for x");
double x=Input.readDouble();
double y=Math.pow(x,7);
System.out.println("y is equal to " + y);


/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/

System.out.println("Enter number for z");
double z=Input.readDouble();
double q=Math.pow(z,3)+5;
System.out.println("q is equal to " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

System.out.println("Enter number for t");
double t=Input.readDouble();
System.out.println("Enter number for r");
double r=Input.readDouble();
double s=Math.pow(t,5)*Math.pow(r+5,4);
System.out.println("s is equal to " + s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

System.out.println("Enter number for a");
double a=Input.readDouble();
System.out.println("Enter number for b");
double b=Input.readDouble();
double c=Math.sqrt(a+b);
System.out.println("c is equal to " + c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

System.out.println("Enter number for x1");
double x1=Input.readDouble();
System.out.println("Enter number for x2");
double x2=Input.readDouble();
System.out.println("Enter number for y1");
double y1=Input.readDouble();
System.out.println("Enter number for y2");
double y2=Input.readDouble();
double d=Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
System.out.println("d is equal to " + d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

System.out.println("Enter degrees");
double deg=Input.readDouble();
double g=Math.sin(deg);
System.out.println("g is equal to " + g);

/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

System.out.println("Enter number for m");
double m=Input.readDouble();
System.out.println("Enter number for n");
double n=Input.readDouble();
double k=Math.pow(m,5)/Math.sqrt(n+1);
System.out.println("k is equal to " + k);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/

System.out.println("Enter number for quadratic a");
double qa=Input.readDouble();
System.out.println("Enter number for quadratic b");
double qb=Input.readDouble();
double negativeqb=-qb;
System.out.println("Enter number for quadratic c");
double qc=Input.readDouble();
double qx=negativeqb+Math.sqrt(Math.pow(qb,2)-4*qa*qc)/(2*qa);
System.out.println("Quadratic formula is equal to " + qx);



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}