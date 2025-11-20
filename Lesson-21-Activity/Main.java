class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
void allowance(){
  int penny=1;
  int days=0;
  while(!(penny<500)){
    penny=penny*2;
    print(penny);
    days=days+1;
  }
}
void guessGame(){
int count=1;
int num1=randInt(1,10);
int num2=randInt(1,10);
int sum=num1+num2;
Print('Guess a number from num1 to num2')
int guess=Input.readInt();
while (!(sum==guess)){
count++
Print('Wrong, Guess again')
guess=Input.readInt();
}
Print(“Correct”)
}

}