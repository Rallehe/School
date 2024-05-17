import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<InventoryItem> storeStock = new ArrayList<>();
        InventoryItem hammer = new InventoryItem("Hammer", 81001, 199, 12);
        InventoryItem drill = new InventoryItem("Drill", 1231, 189, 32);
        InventoryItem saw = new InventoryItem("Saw", 5435, 159, 19);
        InventoryItem gloves = new InventoryItem("Gloves", 12, 39, 17);

        storeStock.add(hammer);
        storeStock.add(drill);
        storeStock.add(saw);
        storeStock.add(gloves);

        Collections.sort(storeStock);
        for (InventoryItem stock : storeStock) {
            System.out.println(stock);
        }

        System.out.print("----------------------");

        Comparator<InventoryItem> compPrice = Comparator.comparing(InventoryItem::getPrice);
        Collections.sort(storeStock, compPrice);
        for (InventoryItem stock : storeStock) {
            System.out.println(stock);
        }
    }
}
