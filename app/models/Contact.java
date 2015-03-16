package models;

/**
 * Model of a contact.
 * Created by amytakayesu on 3/16/15.
 */
public class Contact {
  String firstName;
  String lastName;
  String telephone;

  /**
   * Creates a contact object.
   * @param firstName
   * @param lastName
   * @param telephone
   */
  public Contact(String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
  }

  /**
   * Returns the first name.
   * @return first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns the last name.
   * @return last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Returns the phone number.
   * @return phone number
   */
  public String getTelephone() {
    return telephone;
  }
}
