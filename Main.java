import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int escolher = 0;

    do {
      System.out.println("====================================\n");
      System.out.println(" 1 - Remover Produto\n");
      System.out.println(" 2 - Editar Produto\n");
      System.out.println(" 3 - Listar Estoque\n");
      System.out.println(" 4 - Vender\n");
      System.out.println(" 0 - Sair\n");
      System.out.println("====================================");
      escolher = teclado.nextInt();
      Menu menu = new Menu(escolher, teclado);
      menu.resposta(escolher);
    } while (escolher != 0);

    teclado.close();
  }
}