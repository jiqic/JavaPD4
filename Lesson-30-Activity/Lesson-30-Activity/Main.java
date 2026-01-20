class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
Car ferrari = new Car("Ferrari", "Red", 2020, "488 Spider", 280000);
Car porsche = new Car("Porsche", "White", 2019, "911", 180000);
print("My car is a " + ferrari.year + " " + ferrari.brand + " " + ferrari.model + " in " + ferrari.color + " worth $" + ferrari.value);
print("My friend's car is a " + porsche.year + " " + porsche.brand + " " + porsche.model + " in " + porsche.color + " worth $" + porsche.value);
  }




  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}