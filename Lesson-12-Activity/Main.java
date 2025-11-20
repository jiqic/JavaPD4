class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

     String creditCardType(String card){
    if(card.substring(0,1).equals("4")){
      return  "Visa";
    }
    else if(card.substring(0,2).equals("34") || 
       card.substring(0,2).equals("37")){
      return  "America Express";
    }
    else if(card.substring(0,1).equals("36")){
      return  "Diner Club";
    }
    else if(card.substring(0,2).equals("51") || 
       card.substring(0,2).equals("55")){
      return  "Mastercard";
    }
    else if(card.substring(0,4).equals("6011") || 
       card.substring(0,2).equals("65")){
      return  "Discovery";
    }
    else
      return "Unknown";
  }

 String nycLocate(String zcode){
    if(zcode.substring(0,3).equals("100") || 
       zcode.substring(0,3).equals("101") || 
       zcode.substring(0,3).equals("102")){
      return  "Manhattan";
    }
    else if(zcode.substring(0,3).equals("103")){
      return  "Staten Island";
    }
    else if(zcode.substring(0,3).equals("104")){
      return  "Bronx";
    }
    else if(zcode.substring(0,3).equals("112")){
      return  "Brooklyn";
    }
    else if(zcode.substring(0,3).equals("113") || 
       zcode.substring(0,3).equals("114") || 
       zcode.substring(0,3).equals("111")){
      return  "Queens";
    }
    else
      return "Unknown";
  }

     String getMonth(String date){
    if(date.substring(0,2).equals("01")){
      return  "Jan";
    }
    else if(date.substring(0,2).equals("02")){
      return  "Feb";
    }
    else if(date.substring(0,2).equals("03")){
      return  "Mar";
    }
    else if(date.substring(0,2).equals("04")){
      return  "Apr";
    }
    else if(date.substring(0,2).equals("05")){
      return  "May";
    }
    else if(date.substring(0,2).equals("06")){
      return  "Jun";
    }
    else if(date.substring(0,2).equals("07")){
      return  "Jul";
    }
    else if(date.substring(0,2).equals("08")){
      return  "Aug";
    }
    else if(date.substring(0,2).equals("09")){
      return  "Sep";
    }
    else if(date.substring(0,2).equals("10")){
      return  "Oct";
    }
    else if(date.substring(0,2).equals("11")){
      return  "Nov";
    }
    else if(date.substring(0,2).equals("12")){
      return  "Dec";
    }
    else
      return "Unknown";
  }

}