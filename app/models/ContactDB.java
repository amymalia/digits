
package models;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import views.formdata.ContactFormData;

/**
 * Keeps track of the contacts in a list.
 * Created by amytakayesu on 3/16/15.
 */
public class ContactDB {
  /**
   * List of all current contacts.
   */
  public static Map<Long, Contact> contacts = new HashMap<>();
  /**keeps track of the next id number.*/
  public static long i = 1;

  /**
   * Add a contact to the list database.
   *
   * @param form the filled out contact form
   */
  public static void addContact(ContactFormData form) {
    long idVal;
    if (form.id == 0) {
      idVal = i++;
    }
    else {
      idVal = form.id;
    }
    Contact contact = new Contact(idVal, form.firstName, form.lastName, form.telephone);
    contacts.put(idVal, contact);
  }

  /**
   * Used to get the list of contacts.
   *
   * @return list of contacts
   */
  public static List getContacts() {
    return new ArrayList(contacts.values());
  }

  /**
   * Finds and returns a contact based on its id.
   *
   * @param id the contact id
   * @return a contact
   */
  public static Contact getContact(long id) {
    if (id != 0) {
      Contact c = contacts.get(id);
      return c;
    }
    else {
      throw new RuntimeException("Unable to find contact with given id.");
    }
  }

  /**
   * Finds and deletes a contact based on its id.
   *
   * @param id of a contact
   */
  public static void deleteContact(long id) {
    if (id == 0) {
      throw new RuntimeException("Contact does not exist.");
    }
    else {
      contacts.remove(id);
    }
  }


}
