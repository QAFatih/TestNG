package techproed.tests.dataProvider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    //Bu örnekte DataProvider metodumuz utill clasından gelecek

    @Test (dataProvider="musteriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriVerileriTest(String username, String password,String Sube){
        System.out.println("Username :" + username + ".password :" + password+"Sube :"+Sube);
    }
//musteriHizmetleriVerileri
    @Test(dataProvider ="musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)

    public void  musteriHizmetleriverileri(String username, String password) {
        System.out.println("Username :" + username + ".password :" + password);
    }
   //personelVerileri
   @Test(dataProvider ="personelVerileri",dataProviderClass = DataProviderUtils.class)

   public void personelVerileri(String username, String password) {
       System.out.println("Username :" + username + ".password :" + password);

   }

//customerData
    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)

    public void customerDataTest(String username,String password){
        System.out.println("EXCEL DATALARIM");
        System.out.println(username + "|||" + password);
    }

}