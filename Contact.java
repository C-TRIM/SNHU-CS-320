/**
 * Represents a Contact with immutable ID and updatable firstName, lastName, phone, and address.
 * Enforces non-null constraints and maximum length limits, and ensures phone is exactly 10 digits.
 */
public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    /**
     * Constructs a Contact ensuring validations for all fields.
     * @param contactId unique ID, non-null, max length 10
     * @param firstName non-null, max length 10
     * @param lastName non-null, max length 10
     * @param phone exactly 10 digits, non-null
     * @param address non-null, max length 30
     */
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contactId");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("phone must be exactly 10 digits");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    /** Updates firstName if non-null and ≤ 10 chars */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        this.firstName = firstName;
    }

    /** Updates lastName if non-null and ≤ 10 chars */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        this.lastName = lastName;
    }

    /** Updates phone if exactly 10 digits */
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone");
        }
        this.phone = phone;
    }

    /** Updates address if non-null and ≤ 30 chars */
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
