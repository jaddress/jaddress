package org.jaddress.address.canada.province;

import java.util.Arrays;
import java.util.Collection;
import org.jaddress.address.canada.CanadaAddress;
import org.jaddress.address.canada.CanadaAddressFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
@RunWith(Parameterized.class)
public class ProvinceFromIso2InUppercaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"ab", Alberta.getInstance()},
                {"bc", BritishColumbia.getInstance()},
                {"mb", Manitoba.getInstance()},
                {"nb", NewBrunswick.getInstance()},
                {"nl", Newfoundland.getInstance()},
                {"ns", NovaScotia.getInstance()},
                {"on", Ontario.getInstance()},
                {"pe", PrinceEdwardIsland.getInstance()},
                {"qc", Quebec.getInstance()},
                {"sk", Saskatchewan.getInstance()}
        });
    }

    private final String officialName;
    private final CanadianProvince expectedCanadianProvince;

    public ProvinceFromIso2InUppercaseTest(String officialName, CanadianProvince expectedCanadianProvince) {
        this.officialName = officialName;
        this.expectedCanadianProvince = expectedCanadianProvince;
    }

    @Test
    public void whenBuildingAnAddressFromAnAddressTextThenProvinceIsAsExpected(){
        CanadaAddress canadaAddress = CanadaAddressFactory.getInstance().buildFrom(officialName);

        assertThat(canadaAddress.getProvince(), is(expectedCanadianProvince));
    }
}
