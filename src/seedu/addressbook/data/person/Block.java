package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {

    public static final String EXAMPLE = "123";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Address blocks should only contain numbers";
    public static final String BLOCK_VALIDATION_REGEX = ".+";

    public final String value;

    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Block(String block)throws IllegalValueException {
        String trimmedBlock = block.trim();

        if (!isValidBlock(trimmedBlock)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.value = trimmedBlock;
    }

    /**
     * Returns true if a given string is a valid address block.
     */
    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }
}
