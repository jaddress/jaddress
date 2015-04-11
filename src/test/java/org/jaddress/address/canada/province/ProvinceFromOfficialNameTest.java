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
public class ProvinceFromOfficialNameTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"Alberta", Alberta.getInstance()},
                {"British Columbia", BritishColumbia.getInstance()},
                {"Manitoba", Manitoba.getInstance()},
                {"New Brunswick", NewBrunswick.getInstance()},
                {"Newfoundland and Labrador", Newfoundland.getInstance()},
                {"Nova Scotia", NovaScotia.getInstance()},
                {"Ontario", Ontario.getInstance()},
                {"Prince Edward Island", PrinceEdwardIsland.getInstance()},
                {"Quebec", Quebec.getInstance()},
                {"Saskatchewan", Saskatchewan.getInstance()}
        });
    }

    private final String officialName;
    private final CanadianProvince expectedCanadianProvince;

    public ProvinceFromOfficialNameTest(String officialName, CanadianProvince expectedCanadianProvince) {
        this.officialName = officialName;
        this.expectedCanadianProvince = expectedCanadianProvince;
    }

    @Test
    public void whenBuildingAnAddressFromAnAddressTextThenProvinceIsAsExpected(){
        CanadaAddress canadaAddress = CanadaAddressFactory.getInstance().buildFrom(officialName);

        assertThat(canadaAddress.getProvince(), is(expectedCanadianProvince));
    }
}
