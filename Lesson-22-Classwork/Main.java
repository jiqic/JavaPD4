class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] names={"Alice","Bob","Charlie","Diana","Eve"};
   double[] c={0,10,20,30,40,50,60,70,80,90,100};
   double[]f=convert(c);
   for(int i=0;i<f.length;i++){
       print(f[i]);
   }
  }

  double[] convert(double[] c){
      double[] f=new double[c.length];
      for(int i=0;i<f.length;i++){
          f[i]=c[i]*9/5+32;
      }
      return f;
  }

  }
