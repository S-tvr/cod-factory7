package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

/**
 * παραδειγμα dependency injection or
 * inversion of control.
 * Δεν χρησιμοποιω new
 */
public class CustomerServiceImpl {
    private ICustomerDAO iCustomerDAO;

    //γραφω και χρησιμοποιω τον constructor αντι να κανω new;
    // ετσι οπως είναι γραμμενος ο constructor, δεν αρχικοποιει μια
    //concrete class, αλλα οτιδήποτε is-a ICustomerDao, αρα οποιαδήποτε
    //class κανε implement το interface.
    // ειναι πολυμορφικός constructor
    public CustomerServiceImpl(ICustomerDAO iCustomerDAO) {
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer(Customer customer) throws Exception {

        try {
            if (iCustomerDAO.getCustomerByVat(customer.getVat()) != null) {
                throw new Exception("");
            }
            iCustomerDAO.addCustomer(customer);
        } catch (Exception e) {
            System.out.println("");
            throw e;
        }
    }


}
