package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {

    public static final String EXAMPLE = "123456";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Address postal code should only contain numbers";
    public static final String POSTAL_CODE_VALIDATION_REGEX = ".+";

    public final String value;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public PostalCode(String postalcode)throws IllegalValueException {
        String trimmedPostalCode = postalcode.trim();

        if (!isValidBlock(trimmedPostalCode)) {
            throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
        }
        this.value = trimmedPostalCode;
    }

    /**
     * Returns true if a given string is a valid address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }
}
