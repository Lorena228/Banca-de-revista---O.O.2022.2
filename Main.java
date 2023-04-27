import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Estoque estoque_da_loja = new Estoque(teclado);
    estoque_da_loja.criarEstoqueGenerico();

    int chosen = 0;
    System.out.println("============================================================\n");
    System.out.println("BEM-VINDO AO SISTEMA DE ESTOQUE DA BANCA DE REVISTA\n");
    do {
      System.out.println("============================================================\n");
      System.out.println("1 - Adicionar produto\n");
      System.out.println("2 - Remover produto\n");
      System.out.println("3 - Editar produto\n");
      System.out.println("4 - Listar estoque\n");
      System.out.println("0 - SAIR\n");
      System.out.println("============================================================\n");
      chosen = teclado.nextInt();
      Menu menu = new Menu(teclado);
      menu.enviarEstoque(estoque_da_loja);
      menu.resposta(chosen);
    } while (chosen != 0);

    teclado.close();

  }
}