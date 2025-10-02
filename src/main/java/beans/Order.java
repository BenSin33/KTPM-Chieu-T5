package beans;

public class Order {
    private String orderID; // orderId có thể null nếu input không hợp lệ
    private int ISBN;
    private int quantity; // Không kiểm tra giá trị âm

    /**
     *  for the book name in confirm order
     * */
    private String book_name;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name; //Không validate (null)
    }

    // GETTERS
    public int getISBN() {
        return ISBN;
    }

    public String getOrderID() { //có thể null nếu chưa set
        return orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    // SETTERS
    public void setISBN(int ISBN) { // Không validate (negative, 0)
        this.ISBN = ISBN;
    }

    public void setOrderID(String orderID) { //Không kiểm tra null khi set
        this.orderID = orderID;
    }

    public void setQuantity(int quantity) { // Không kiểm tra điều kiện (<=0)
        this.quantity = quantity;
    }
}

