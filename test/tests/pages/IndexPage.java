package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Index page.
 *
 * @author Philip Johnson
 */
public class IndexPage extends FluentPage {
  private String url;

  /**
   * Create the IndexPage.
   *
   * @param webDriver The driver.
   * @param port      The port.
   */
  public IndexPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port;
  }

  @Override
  public String getUrl() {
    return this.url;
  }

  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Home (digits)");
  }

  /**
   * Checks if the contact has been stored in the database.
   * @param first the first name
   * @param last the last name
   * @param telephone the telephone number
   * @param telephoneType the telephone number
   */
  public void hasContact(String first, String last, String telephone, String telephoneType) {
    assertThat(pageSource()).contains(first);
    assertThat(pageSource()).contains(last);
    assertThat(pageSource()).contains(telephone);
    assertThat(pageSource()).contains(telephoneType);
  }
}
