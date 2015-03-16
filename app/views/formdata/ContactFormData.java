package views.formdata;

import java.util.List;
import java.util.ArrayList;
import play.data.validation.ValidationError;

/**
 * Created by amytakayesu on 3/15/15.
 */
public class ContactFormData {
  private static final int NUM_TELEPHONE_DIGITS = 12;

  /**First name field*/
  public String firstName = "";

  /**Last name field*/
  public String lastName = "";

  /**Telephone field*/
  public String telephone = "";

  public List<ValidationError> validate(){
    List<ValidationError> errors = new ArrayList<>();

    if (firstName == null || firstName.length() == 0) {
      errors.add(new ValidationError("firstName" , "First name is required."));
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

    return errors.isEmpty() ? null : errors;
  }

}
