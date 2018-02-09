package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    public static final String EXAMPLE = "some street";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Address street should only contain letters and numbers";
    public static final String STREET_VALIDATION_REGEX = "[\\w ]+";

    public final String value;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Street(String street)throws IllegalValueException {
        String trimmedStreet = street.trim();

        if (!isValidBlock(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.value = trimmedStreet;
    }

    /**
     * Returns true if a given string is a valid address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }
}
