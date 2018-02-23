package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }
    

    @Test
    public void isAnyNull_nullList_returnsFalse() throws Exception {
        assertNoNull();
        // no null objects
        assertNoNull("abc", "ab", "a");
        assertNoNull(1, 2);
        assertNoNull(1, 1, "AB");
    }
    
    @Test
    public void isAnyNull_noNullObjects_returnsFalse() throws Exception {
        assertNoNull("abc", "ab", "a");
        assertNoNull(1, 2);
        assertNoNull(1, 1, "AB");
    }

    @Test
    public void isAnyNull_nullObjects_returnsTrue() throws Exception {
        assertNull((Object)null);
        assertNull("abc", null);
        assertNull(null, 1);
    }
    
    
    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNull(Object... objects) { assertTrue(Utils.isAnyNull(objects)); }

    private void assertNoNull(Object... objects) { assertFalse(Utils.isAnyNull(objects)); }
}
