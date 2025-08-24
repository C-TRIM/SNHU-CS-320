import java.util.HashMap;
import java.util.Map;

/**
 * In-memory service for managing Contact objects.
 * Supports operations: add, delete, and update firstName, lastName, phone, and address by contactId.
 */
public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    /**
     * Adds a contact if it’s non-null and ID does not already exist.
     * @throws IllegalArgumentException on null contact or duplicate ID
     */
    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate Contact ID");
        }
        contacts.put(contact.getContactId(), contact);
    }

    /** Deletes a contact by ID. No exception if not found. */
    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    /** Updates firstName for existing contact; throws if contact not found or invalid name. */
    public void updateFirstName(String contactId, String newFirstName) {
        Contact c = contacts.get(contactId);
        if (c == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        c.setFirstName(newFirstName);
    }

    /** Updates lastName for existing contact; throws if contact not found or invalid lastName. */
    public void updateLastName(String contactId, String newLastName) {
        Contact c = contacts.get(contactId);
        if (c == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        c.setLastName(newLastName);
    }

    /** Updates phone for existing contact; throws if contact not found or invalid phone. */
    public void updatePhone(String contactId, String newPhone) {
        Contact c = contacts.get(contactId);
        if (c == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        c.setPhone(newPhone);
    }

    /** Updates address for existing contact; throws if contact not found or invalid address. */
    public void updateAddress(String contactId, String newAddress) {
        Contact c = contacts.get(contactId);
        if (c == null) {
            throw new IllegalArgumentException("Contact not found");
        }
        c.setAddress(newAddress);
    }
}
