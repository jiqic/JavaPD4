class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */

double groupSavings(double tickets){
  double cost=0;
  double total=tickets*cost;
  if(tickets>=1 && tickets<=8){
  cost=11.00;
  return total;
  }
  else if(tickets>=9 && tickets<=16){
  cost=10.50;
  return total;
  }
  else if(tickets>16){
  cost=8.50;
  return total;
  }
}
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */

double groceryDiscount(double total){
  double cans=0.0;
  double spent=0.0;
  if(cans>=3 && spent>=100 && spent<=200){
    return 10.00;
}
  else if(cans>=3 && spent>=200){
  return 25.00;
  }
  else{
  return 0.00;
  }
}
}