package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {

    public static final String EXAMPLE = "#12-34";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Address units should contain a hash followed by unit number";
    public static final String UNIT_VALIDATION_REGEX = ".+";

    public final String value;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Unit(String unit)throws IllegalValueException {
        String trimmedUnit = unit.trim();

        if (!isValidBlock(trimmedUnit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.value = trimmedUnit;
    }

    /**
     * Returns true if a given string is a valid address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }
}
