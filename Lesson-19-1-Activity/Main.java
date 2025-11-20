class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
rollDice();
lotto();
additionTutor();
  }

String rollDice(){
  int die1 = (int)(Math.random()*6)+1;
  int die2 = (int)(Math.random()*6)+1;
  return die1 + "," + die2;
}

String lotto(){
  int num1 = (int)(Math.random()*59)+1;
  int num2 = (int)(Math.random()*59)+1;
  int num3 = (int)(Math.random()*59)+1;
  int num4 = (int)(Math.random()*59)+1;
  int num5 = (int)(Math.random()*59)+1;
  return num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5;

}

boolean additionTutor(){
  int a = (int)(Math.random()*59)+1;
  int b = (int)(Math.random()*59)+1;
  int userAnswer = 0;
  int correctAnswer = a + b;
  if(userAnswer == correctAnswer){
    return true;
  } else {
    return false;
  }

}
}