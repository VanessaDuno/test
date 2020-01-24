package dog.ceo.msbreed.manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlowManagerFactoryTest {

    private FlowManagerFactory flowManagerFactory;

    @Before
    public void setUp() {
        flowManagerFactory= new FlowManagerFactory();
    }

    @Test
    public void isClassThere(){
        Assert.assertNotNull(flowManagerFactory);
    }
}
