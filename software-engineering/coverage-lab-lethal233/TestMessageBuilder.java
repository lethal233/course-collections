import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import cs304.coveragelab.MessageBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class TestMessageBuilder extends MessageBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void testL7a9a11a12a18a21_1() throws Throwable {
        MessageBuilder messageBuilder0 = new MessageBuilder();
        String string0 = messageBuilder0.getMessage("<`/?");
        assertEquals("Hello <`/?", string0);
    }

    @Test(timeout = 4000)
    public void testL7a9a11a13a15a16a18a21() throws Throwable {
        MessageBuilder messageBuilder0 = new MessageBuilder();
        String string0 = messageBuilder0.getMessage("[U:q;H");
        assertEquals("Too long: [U:q;H", string0);
    }

    @Test(timeout = 4000)
    public void testL7a9a11a12a18a21_2() throws Throwable {
        MessageBuilder messageBuilder0 = new MessageBuilder();
        String string0 = messageBuilder0.getMessage("B&");
        assertEquals("Hello B&", string0);
    }

    @Test(timeout = 4000)
    public void testL7a9a10a18a21_1() throws Throwable {
        MessageBuilder messageBuilder0 = new MessageBuilder();
        String string0 = messageBuilder0.getMessage("");
        assertEquals("Please provide a name!", string0);
    }

    @Test(timeout = 4000)
    public void testL7a9a10a18a21_2() throws Throwable {
        MessageBuilder messageBuilder0 = new MessageBuilder();
        // Undeclared exception!
        try {
            messageBuilder0.getMessage((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }
}
