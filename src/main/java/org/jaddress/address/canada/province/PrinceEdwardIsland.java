package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class PrinceEdwardIsland implements CanadianProvince {

    private static PrinceEdwardIsland instance;

    private PrinceEdwardIsland(){}

    public static synchronized PrinceEdwardIsland getInstance() {
        if(instance == null) {
            instance = new PrinceEdwardIsland();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Prince Edward Island";
    }

    @Override
    public String getCodeIso2() {
        return "pe";
    }

    @Override
    public Set<String> getRecognizedNames() {
        return Sets.newHashSet(getOfficialName());
    }

    @Override
    public Set<String> getRecognizedAbbreviations() {
        return Sets.newHashSet(getCodeIso2());
    }
}
