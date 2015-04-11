package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Saskatchewan implements CanadianProvince {

    private static Saskatchewan instance;

    private Saskatchewan(){}

    public static synchronized Saskatchewan getInstance() {
        if(instance == null) {
            instance = new Saskatchewan();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Saskatchewan";
    }

    @Override
    public String getCodeIso2() {
        return "sk";
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
