package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Newfoundland implements CanadianProvince {

    private static Newfoundland instance;

    private Newfoundland(){}

    public static synchronized Newfoundland getInstance() {
        if(instance == null) {
            instance = new Newfoundland();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Newfoundland and Labrador";
    }

    @Override
    public String getCodeIso2() {
        return "nl";
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
