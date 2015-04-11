package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Manitoba implements CanadianProvince {

    private static Manitoba instance;

    private Manitoba(){}

    public static synchronized Manitoba getInstance() {
        if(instance == null) {
            instance = new Manitoba();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Manitoba";
    }

    @Override
    public String getCodeIso2() {
            return "mb";
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
