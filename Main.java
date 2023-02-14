import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Cadastro c1 = new Cadastro();
    System.out.println("NOVO CLIENTE? S/N \n");
    resp = ler.next();
    System.out.println("CADASTRO PARA CLIENTES \n");
    System.out.println("Nome: ");
    c1.nome = ler.next();
    System.out.println("idade: ");
    c1.idade = ler.nextInt();
    System.out.println("preferencia: ");
    c1.preferencia = ler.next();

    c1.desconto();
}
