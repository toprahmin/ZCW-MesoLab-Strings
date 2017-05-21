import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by rahmirford on 5/20/17.
 */
public class TestDriversLicense {



    @Test
    public void testDeserializeFromCSV(){
        //: Given
        DriversLicense dl = new DriversLicense();
        String csvFile = " LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n" +
                "Long,Aaron,456 Street Dr,NJ,L364856498487,06/17/1993,06/17/2014,06/30/2018,M,GRN,6'2,YES,D\n" +
                "Kim,Chris,820 District Dr,DE,L364856423452,12/11/1980,08/12/2013,12/11/2018,M,BRO,\"6'5\"\"\",NO,D\n" +
                "Stamatelos,Jarryd,123 Main St ,NJ,L363345398489,3/17/1988,3/17/2016,3/20/2020,M,BRO,7'0'',YES,D\n" +
                "Cage,Nick,362 Fancy St,CA,L809239899490,02/02/1970,02/02/2000,02/02/2006,M,BRO,6'0'',YES,D\n" +
                "Reeves,Keanu,876 Zion Dr,NY,L234252352391,6/6/1955,6/9/2005,6/9/2010,M,GRN,5'11,YES,D\n" +
                "Anderson,Neo,2959 57th St,NY,L364235898492,8/6/1980,7/7/1999,7/7/2009,M,BRO,5'11,NO,D\n" +
                "Traven,Jack,25 Speed Ln,CA,L323523423193,2/20/1994,2/20/217,2/20/2027,M,BRO,5'11,YES,D\n" +
                "Lomax,Kevin,9234 High St,MI,L098886498494,9/3/1940,8/8/2008,8/8/2018,M,BRO,6'0'',YES,D\n" +
                "Wick,John,2190 Badass Alley,NY ,L234234598495,6/6/1977,3/3/2000,1/1/2010,M,GRN,6'0'',YES,D\n" +
                "Wyler,Alex,234 Lake House St,NY,L234235236253,7/8/2000,4/8/2017,4/8/2027,M,BRO,5'11,YES,D\n" +
                "Utah,Johnny,932 PointBreak Rd,CA,L223523438497,2/5/1988,4/4/2000,4/4/2010,M,BRO,5'11,NO,D\n" +
                "Starr,Patrick,101 UnderTheSea Ct,HI,L101234101010,10/07/1987,02-30-2010,02/30/2010,M,BRO,6'1,NO,D\n" +
                "Zach,Leon,1234 BadAtSmash Ln,DE,L101234107890,1/2/3456,3/3/2000,5/19/2107,M,BRO,4'3,NO,D";


        String expectedState = "NJ";
        String expectedAddress = "876 Zion Dr";
        String expectedFirstName = "Traven";
        //: When
        String actualState = dl.deserializeFromCSV(csvFile).get(1).getState();
        String actualAddress = dl.deserializeFromCSV(csvFile).get(5).getAddr();
        String  actualFirstName = dl.deserializeFromCSV(csvFile).get(7).getFirstName();
        //: Then
        Assert.assertEquals("The expected state should return NJ",expectedState,actualState);
        Assert.assertEquals("The expected address should return 876 Zion Dr", expectedAddress,actualAddress);
        Assert.assertEquals("The expected name should return Traven", expectedFirstName, actualFirstName);
    }

    @Test
    public void testSerializeToCSV(){
        
    }

}
