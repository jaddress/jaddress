package org.jaddress.address.canada.province;

import com.google.common.collect.Sets;
import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class NovaScotia implements CanadianProvince {

    private static NovaScotia instance;

    private NovaScotia(){}

    public static synchronized NovaScotia getInstance() {
        if(instance == null) {
            instance = new NovaScotia();
        }
        return instance;
    }

    @Override
    public String getOfficialName() {
        return "Nova Scotia";
    }

    @Override
    public String getCodeIso2() {
        return "ns";
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
