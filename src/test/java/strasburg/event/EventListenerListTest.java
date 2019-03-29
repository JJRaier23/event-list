/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package strasburg.event;

import org.junit.Test;
import static org.junit.Assert.*;

public class EventListenerListTest {
    @Test
    public void testSomeLibraryMethod() throws Exception
    {
        EventListenerList<FooEventListener> evl = new EventListenerList<>();
        evl.addEventListener(new FooEventListener() {
            @Override
            public void foo(FooEvent event)
            {
                System.out.println("I got a foo event");
            }
        });

        FooEvent event = new FooEvent(this);
        evl.fireEventListener(event, "foo", FooEvent.class);
    }
}
