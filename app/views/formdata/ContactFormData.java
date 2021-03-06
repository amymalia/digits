package views.formdata;

import models.Contact;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amytakayesu on 3/15/15.
 */
public class ContactFormData {
  private static final int NUM_TELEPHONE_DIGITS = 12;

  /**
   * Contact unique ID.
   */
  public long id;

  /**
   * First name field.
   */
  public String firstName;

  /**
   * Last name field.
   */
  public String lastName;

  /**
   * Telephone field.
   */
  public String telephone;

  /**
   * Telephone type field.
   */
  public String telephoneType;

  /**
   * Default constructor.
   */
  public ContactFormData() {
  }

  /**
   * Constructor using existing contact.
   *
   * @param c existing contact
   */
  public ContactFormData(Contact c) {
    this.firstName = c.getFirstName();
    this.lastName = c.getLastName();
    this.telephone = c.getTelephone();
    this.telephoneType = c.getTelephoneType();
    this.id = c.getId();
  }


  /**
   * Constructor without id.
   * @param firstName the contact first name.
   * @param lastName the contact last name.
   * @param telephone the contact telephone.
   * @param telephoneType the contact telephoneType.
   */
  public ContactFormData(String firstName, String lastName, String telephone, String telephoneType) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.telephoneType = telephoneType;
  }

  /**
   * Checks for field validations.
   *
   * @return List of errors or null if there are no errors
   */
  public List<ValidationError> validate() {
    List<ValidationError> errors = new ArrayList<>();

    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName", "First name is required."));
    }

    if (lastName == null || lastName.length() == 0) {
      errors.add(new ValidationError("lastName", "Last name is required."));
    }

    if (telephone == null || telephone.length() == 0) {
      errors.add(new ValidationError("telephone", "Telephone is required."));
    }

    if (telephone.length() != NUM_TELEPHONE_DIGITS) {
      errors.add(new ValidationError("telephone", "Telephone must be xxx-xxx-xxxx."));
    }

    if (TelephoneTypes.isType(telephoneType)) {
      errors.add(new ValidationError("telephoneType", "Telephone type is invalid."));
    }

    return errors.isEmpty() ? null : errors;
  }

}
