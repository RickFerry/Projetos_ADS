public class Estouro2 {

  public static void recursivePrint(int num) {
    System.out.println("Number: " + num);

    if (num == 0)
      return;
    else
      recursivePrint(++num);
  }

  public static void main(String[] args) {
    Estouro2.recursivePrint(1);
  }
}
