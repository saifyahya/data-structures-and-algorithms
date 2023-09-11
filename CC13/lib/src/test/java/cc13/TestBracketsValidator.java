package CC13.lib.src.test.java.cc13;

import CC13.lib.src.main.java.cc13.StackBracketsValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestBracketsValidator {

    @Test public void testValidateBrackets() {
        Assertions.assertTrue(StackBracketsValidator.validateBrackets("(){}[[]]"));
    }

    @Test public void testValidateBrackets2() {
        Assertions.assertTrue(StackBracketsValidator.validateBrackets("{}{Code}[Fellows](())"));
    }

    @Test public void testValidateBrackets3() {
        Assertions.assertFalse(StackBracketsValidator.validateBrackets("{(})"));
    }
    @Test public void testValidateBrackets5() {
        Assertions.assertFalse(StackBracketsValidator.validateBrackets("(]("));
    }

}
