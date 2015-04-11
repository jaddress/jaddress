package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class BritishColumbia implements CanadianProvince {

    private static BritishColumbia instance;

    private BritishColumbia(){}

    public static synchronized BritishColumbia getInstance() {
        if(instance == null) {
            instance = new BritishColumbia();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "British Columbia";
    }

    @Override
    public String getCodeIso2() {
        return "bc";
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
