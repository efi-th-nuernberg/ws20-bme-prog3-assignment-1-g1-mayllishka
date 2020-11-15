class Main {
  public static void main(String[] args) {
    zahlenfilter();
  }

  public static void zahlenfilter(){
    for (int i=1; i<=200; i++){
      if((i%5)==0){
        System.out.println("ZAHL ist durch 5 teilbar");

      } else if((i%10)==9){
        System.out.println("ZAHL endet auf 9");

      } else if(((i+(i-1))%3) == 0) {
        System.out.println(i + "ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");

      }
    }
  }