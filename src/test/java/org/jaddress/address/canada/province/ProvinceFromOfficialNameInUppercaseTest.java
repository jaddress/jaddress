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
public class ProvinceFromOfficialNameInUppercaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"ALBERTA", Alberta.getInstance()},
                {"BRITISH COLUMBIA", BritishColumbia.getInstance()},
                {"MANITOBA", Manitoba.getInstance()},
                {"NEW BRUNSWICK", NewBrunswick.getInstance()},
                {"NEWFOUNDLAND AND LABRADOR", Newfoundland.getInstance()},
                {"NOVA SCOTIA", NovaScotia.getInstance()},
                {"ONTARIO", Ontario.getInstance()},
                {"PRINCE EDWARD ISLAND", PrinceEdwardIsland.getInstance()},
                {"QUEBEC", Quebec.getInstance()},
                {"SASKATCHEWAN", Saskatchewan.getInstance()}
        });
    }

    private final String officialName;
    private final CanadianProvince expectedCanadianProvince;

    public ProvinceFromOfficialNameInUppercaseTest(String officialName, CanadianProvince expectedCanadianProvince) {
        this.officialName = officialName;
        this.expectedCanadianProvince = expectedCanadianProvince;
    }

    @Test
    public void whenBuildingAnAddressFromAnAddressTextThenProvinceIsAsExpected(){
        CanadaAddress canadaAddress = CanadaAddressFactory.getInstance().buildFrom(officialName);

        assertThat(canadaAddress.getProvince(), is(expectedCanadianProvince));
    }
}
