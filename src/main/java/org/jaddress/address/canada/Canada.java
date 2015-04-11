package org.jaddress.address.canada;

import com.google.common.collect.Sets;
import java.util.Set;
import org.jaddress.address.Country;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Canada implements Country {
    private static Canada instance;
    private Canada(){}
    public static synchronized Canada getInstance() {
        if(instance == null) {
            instance = new Canada();
        }
        return instance;
    }

    public String getOfficialName() {
        return "Canada";
    }

    @Override
    public String getCodeIso3() {
        return "can";
    }

    @Override
    public String getCodeIso2() {
        return "ca";
    }

    public Set<String> getRecognizedNames() {
        return Sets.newHashSet(getOfficialName());
    }
    public Set<String> getRecognizedAbbreviations() {
        return Sets.newHashSet(getCodeIso2(), getCodeIso3());
    }
}
