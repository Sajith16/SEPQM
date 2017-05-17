package testClassPackage;

import classPackage.Results;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Sajith Chamara on 17/05/2017.
 */
public class ResultsTest {
    Results res;
    @Before
    public void setUp(){
        res = new Results();
    }
    @org.junit.Test
    public void TestoutResultsA() throws Exception {
        assertEquals("A Pass",res.OutResults(80));
    }
    @org.junit.Test
    public void TestoutResultsB() throws Exception {
        assertEquals("B Pass",res.OutResults(65));
    }
    @org.junit.Test
    public void TestoutResultsC() throws Exception {
        assertEquals("C Pass",res.OutResults(50));
    }
    @org.junit.Test
    public void TestoutResultsFail() throws Exception {
        assertEquals("Fail",res.OutResults(45));
    }
}