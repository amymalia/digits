
package models;
import java.util.List;
import java.util.ArrayList;
import views.formdata.ContactFormData;

/**
 * Keeps track of the contacts in a list.
 * Created by amytakayesu on 3/16/15.
 */
public class ContactDB {
  public static List<Contact> contacts = new ArrayList();

  /**
   * Add a contact to the list database.
   * @param form
   */
  public static void addContact(ContactFormData form){
    Contact contact = new Contact(form.firstName, form.lastName, form.telephone);
    contacts.add(contact);
  }

  /**
   * Used to get the list of contacts.
   * @return list of contacts
   */
  public static List getContacts(){
    return contacts;
  }

}
