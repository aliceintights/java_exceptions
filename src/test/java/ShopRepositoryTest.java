//import org.example.AlreadyExistsException;
import org.example.NotFoundException;
import org.example.Product;
import org.example.ShopRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void shouldRemoveProductByID() {
        ShopRepository repo = new ShopRepository();

        Product item1 = new Product(1, "футболка", 300);
        Product item2 = new Product(2, "книга", 500);
        Product item3 = new Product(3, "кружка", 100);
        Product item4 = new Product(4, "ручка", 50);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);

        repo.remove(3);

        Product[] expected = {item1, item2, item4};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeException() {

        ShopRepository repo = new ShopRepository();

        Product item1 = new Product(1, "футболка", 300);
        Product item2 = new Product(2, "книга", 500);
        Product item3 = new Product(3, "кружка", 100);
        Product item4 = new Product(4, "ручка", 50);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);

        Assertions.assertThrows(NotFoundException.class, () -> repo.remove(55));
    }
}
