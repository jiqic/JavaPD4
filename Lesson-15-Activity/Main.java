class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(spaces(5) + "DONE");
    System.out.println(harmonic(5));
    System.out.println(fib(5));
  }

String spaces(int n){
    String result = " ";
    for(int i = 0; i < n; i++) {
        result += " ";
    }
    return result;
}

double harmonic(int n){
    double sum = 0;
    for(int x = 1; x <= n; x++){
        sum += 1.0/x;
    }
    return sum;
}
  
int fib(int n){
    int sum = 0;
    for(int x = 1; x <= n; x++){
        sum = n+x;
    }
    return sum;
}

}