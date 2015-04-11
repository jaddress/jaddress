package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class NewBrunswick implements CanadianProvince {

    private static NewBrunswick instance;

    private NewBrunswick(){}

    public static synchronized NewBrunswick getInstance() {
        if(instance == null) {
            instance = new NewBrunswick();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "New Brunswick";
    }

    @Override
    public String getCodeIso2() {
        return "nb";
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
