package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Alberta implements CanadianProvince {

    private static Alberta instance;

    private Alberta(){}

    public static synchronized Alberta getInstance() {
        if(instance == null) {
            instance = new Alberta();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Alberta";
    }

    @Override
    public String getCodeIso2() {
        return "ab";
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
