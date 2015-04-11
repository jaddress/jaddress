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
public class ProvinceFromOfficialNameInLowercaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"alberta", Alberta.getInstance()},
                {"british columbia", BritishColumbia.getInstance()},
                {"manitoba", Manitoba.getInstance()},
                {"new brunswick", NewBrunswick.getInstance()},
                {"newfoundland and labrador", Newfoundland.getInstance()},
                {"nova scotia", NovaScotia.getInstance()},
                {"ontario", Ontario.getInstance()},
                {"prince edward island", PrinceEdwardIsland.getInstance()},
                {"quebec", Quebec.getInstance()},
                {"saskatchewan", Saskatchewan.getInstance()}
        });
    }

    private final String officialName;
    private final CanadianProvince expectedCanadianProvince;

    public ProvinceFromOfficialNameInLowercaseTest(String officialName, CanadianProvince expectedCanadianProvince) {
        this.officialName = officialName;
        this.expectedCanadianProvince = expectedCanadianProvince;
    }

    @Test
    public void whenBuildingAnAddressFromAnAddressTextThenProvinceIsAsExpected(){
        CanadaAddress canadaAddress = CanadaAddressFactory.getInstance().buildFrom(officialName);

        assertThat(canadaAddress.getProvince(), is(expectedCanadianProvince));
    }
}
