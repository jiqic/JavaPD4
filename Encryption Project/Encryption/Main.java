class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

print(encryptlvl3("hello"));
print(decryptLvl3(encryptlvl3("hello")));

  }




    String encryptlvl3(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (i % 2 == 1) {
                int ascii = (int) ch;
                ascii = ascii * 2; 
                ch = (char) ascii;     
            }

            result += ch;
        }

        return result;
    }

    String decryptLvl3(String encrypted) {
    String result = "";

    for (int i = 0; i < encrypted.length(); i++) {
        char ch = encrypted.charAt(i);

        if (i % 2 == 1) {
            int ascii = (int) ch;
            ascii = ascii / 2;
            ch = (char) ascii;
        }

        result += ch;
    }

    return result;
}

}

