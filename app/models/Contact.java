package models;

/**
 * Model of a contact.
 * Created by amytakayesu on 3/16/15.
 */
public class Contact {
  String firstName;
  String lastName;
  String telephone;
  long id;

  /**
   * Creates a contact object.
   * @param firstName contact first name
   * @param lastName contact last name
   * @param telephone contact telephone number
   */
  public Contact(long id, String firstName, String lastName, String telephone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.id = id;
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

  /**
   * Returns the phone number.
   * @return phone number
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the first name.
   * @param firstName the name to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the last name.
   * @param lastName the name to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the telephone number.
   * @param telephone the number to set
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * Sets the id.
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }
}
