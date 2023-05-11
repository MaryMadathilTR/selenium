import com.mj.base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Apply extends TestBase {
    @BeforeClass
    public void before(){
        TestBase.launchToptal();
    }


    @Test
    public void applyAsFreeLancerTest(){
        System.out.println("test start");
        homePage.clickOnApplyAsFreeLance();
        freeLancerApplyPage.isApplyAsFreeLancerButtonDisplayed();
    }

    @AfterClass
    public void close(){

    }

}
