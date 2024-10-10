public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String fullname, String username) {
        //allows a input of just a first name or both first and last
        String[] firstLastName = fullname.split(" ",2);
        this.firstName = firstLastName[0];
        if (firstLastName.length > 1) {
            this.lastName = firstLastName[1];
        }
        this.username = username;
        id = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullname='" + firstName + " " + lastName + '\'' +
                ", username='" + username + '\'' +
                ", id=" + id +
                '}';
    }
}
