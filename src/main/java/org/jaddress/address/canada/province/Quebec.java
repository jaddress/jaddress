package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class Quebec implements CanadianProvince{
    private static Quebec instance;
    private Quebec(){}
    public static synchronized Quebec getInstance() {
        if(instance == null) {
            instance = new Quebec();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Quebec";
    }

    @Override
    public String getCodeIso2() {
        return "qc";
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
