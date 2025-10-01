package beans;

import java.sql.Date;

public class Sale {
    private int ISBN; // 6 idSale
    private int copies;
    private Double price;
    private String sale_name; // 6 salaName


    /**
     *  will be used by statistics page.
     * */
    private Date sale_date; // 6 saleDate

    /**
     *  the user made that sale.
     * */
    private String user_first_name; // 6 userFirstName
    private String user_last_name; // 6 userLastName


    public Date getSale_date() { // 13 getSaleDate
        return sale_date;
    }

    public void setSale_date(Date sale_date) { //13 setSaleDate
        this.sale_date = sale_date;
    }

    public String getUser_first_name() { // 13 getUserFirstName
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) { // 13 setUserFirstName
        this.user_first_name = user_first_name;
    }

    public String getUser_last_name() {// 13 getUserLastName
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) { // 13 setUserLastName
        this.user_last_name = user_last_name;
    }

    public Sale() { }

    public Sale(int ISBN, int copies) { 
        this.ISBN = ISBN;//15  khong kiểm tra số có âm không
        this.copies = copies;//15  khong kiểm tra số có âm không
    }


    public int getCopies() { return copies; }

    public void setCopies(int copies) { this.copies = copies; } // 15 không kiểm tra số có âm không

    public int getISBN() { return ISBN; } // 13 getIdSale

    public void setISBN(int ISBN) { this.ISBN = ISBN; } //13 setIdSale , 15 không kiểm tra số có âm không

    public void setPrice(Double price) {
        this.price = price; // 15  không kiểm tra số có âm không
    }

    public Double getPrice() {  
        return price;
    }

    public String getSale_name() { //13 getSaleName
        return sale_name;
    }

    public void setSale_name(String sale_name) { //13 setSaleName
        this.sale_name = sale_name;
    }
}
