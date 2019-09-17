package jplag.options.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class MessagesTest {

	@Test
	public void getEnglishMessages() {
		Messages m = new Messages("en");
		assertNotNull(m);

		assertFalse(m.getString("Report.Distribution").startsWith("!"));
		assertTrue(m.getString("NONEXISTENT.KEY.SHOULD.BE.SOURROUNDED.BY.EXCLAMATION.MARKS").startsWith("!"));
	}

	@Disabled
	public void getResourceBundle() {
		String bundle_name = "jplag.options.util.messages";
		ResourceBundle res_bund = ResourceBundle.getBundle(bundle_name, new Locale("en"));

		assertNotNull(res_bund);
	}
}
