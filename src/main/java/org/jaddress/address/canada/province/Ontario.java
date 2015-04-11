package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Ontario implements CanadianProvince {

    private static Ontario instance;

    private Ontario(){}

    public static synchronized Ontario getInstance() {
        if(instance == null) {
            instance = new Ontario();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Ontario";
    }

    @Override
    public String getCodeIso2() {
        return "on";
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
