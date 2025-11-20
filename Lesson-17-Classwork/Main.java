class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
swapLetter("abcdef");

    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

String swapLetter(String txt){
for (int x=0; x<=txt.length()-2; x+=2){
String first=txt.substring(x,x+1);
String second=txt.substring(x+1,x+2);
String bld=second+first;
return bld;
}
return txt;
}
}
