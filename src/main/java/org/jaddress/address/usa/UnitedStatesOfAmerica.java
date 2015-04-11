package org.jaddress.address.usa;

import com.google.common.collect.Sets;
import java.util.Set;
import org.jaddress.address.Country;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class UnitedStatesOfAmerica implements Country {
    private static UnitedStatesOfAmerica instance;
    private UnitedStatesOfAmerica(){}
    public static synchronized UnitedStatesOfAmerica getInstance() {
        if(instance == null) {
            instance = new UnitedStatesOfAmerica();
        }
        return instance;
    }

    public String getOfficialName() {
        return "United States of America";
    }

    @Override
    public String getCodeIso3() {
        return "usa";
    }

    @Override
    public String getCodeIso2() {
        return "us";
    }

    public Set<String> getRecognizedNames() {
        return Sets.newHashSet(getOfficialName());
    }
    public Set<String> getRecognizedAbbreviations() {
        return Sets.newHashSet(getCodeIso2(), getCodeIso3());
    }
}
