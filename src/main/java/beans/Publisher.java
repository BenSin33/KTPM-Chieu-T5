package beans;

import java.util.List;

public class Publisher {
    private String name;
    private List<String> addresses;
    private List<String> phones;

    // GETTERS
    public String getName() { // name có thể trả về null nếu chưa set
        return name;
    }

    public List<String> getAddresses() { // addresses có thể null nếu chưa set
        return addresses;
    }

    public List<String> getPhones() { // phones có thể null nếu chưa set
        return phones;
    }


    // SETTERS
    public void setName(String name) { // Tham số name có thể null hoặc rỗng, không kiểm tra trước khi gán
        this.name = name;
    }

    public void setAddresses(List<String> addresses) { // Không kiểm tra addresses có bị null hay chứa phần tử null
        this.addresses = addresses;
    }

    public void setPhones(List<String> phones) { // Không kiểm tra phones có bị null hay chứa phần tử null
        this.phones = phones;
    }
}
