package gr.aueb.cf.ch16.interfaces;

import java.time.LocalDateTime;

public interface IOrderService {
    // το default ειναι public abstract. Το βάζει αυτόματα.
    void insertOrder(String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);

    void updateOrder(Long id, String lastname, String firstname, String phoneNumber,
                      LocalDateTime timestamp, String item, int quantity);

    void deleteOrder(Long id);
    void getOrder(Long id);
}
