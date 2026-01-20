class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(total(prices));
    print(isin(7,numbers));
    
  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }

  double[] prices={19.99,5.49,15.99,3.49,25.99};
  double taxRate=0.08525;
  double total(double[] prices){
    double sum=0;
    for(int i=0;i<prices.length;i++){
      sum+=prices[i];
    }
    sum=sum+sum*taxRate;
    return sum;
  }

  int[] numbers={3,6,2,8,4,10,12,15,7,9};
  boolean isin(int n,int[] numbers){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==n){
        return true;
      }
    }
    return false;
  }


}