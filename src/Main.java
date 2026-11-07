import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void enterItemsOfYouNeedToBuy(ArrayList<String> itemsNeedToBuy, String item) {
        itemsNeedToBuy.add(item);
    }

    public static void main(String[] args) {
        ArrayList<String> itemsNeedToBuy = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(i <= 5) {
            System.out.print("Digite o nome do item: ");
            String item = scanner.nextLine();
            enterItemsOfYouNeedToBuy(itemsNeedToBuy, item);
            i++;
        }
        System.out.println(itemsNeedToBuy);
        System.out.println("O tamanho da sua lista de compras é de: " + itemsNeedToBuy.size());

        System.out.print("Se quiser procurar algum item na lista, digite o nome do item: ");
        String itemSearch = scanner.nextLine();
        if (itemsNeedToBuy.contains(itemSearch)) {
            System.out.println("Item encontrado!");
        } else {
            System.out.println("Item não encontrado!");
        }

    }
}