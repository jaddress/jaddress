package org.jaddress.address.uk;

import com.google.common.collect.Sets;
import java.util.Set;
import org.jaddress.address.Country;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class UnitedKingdom implements Country {
    private static UnitedKingdom instance;
    private UnitedKingdom(){}
    public static synchronized UnitedKingdom getInstance() {
        if(instance == null) {
            instance = new UnitedKingdom();
        }
        return instance;
    }

    public String getOfficialName() {
        return "United Kingdom";
    }

    @Override
    public String getCodeIso3() {
        return "gb";
    }

    @Override
    public String getCodeIso2() {
        return "gbr";
    }

    public Set<String> getRecognizedNames() {
        return Sets.newHashSet(getOfficialName());
    }
    public Set<String> getRecognizedAbbreviations() {
        return Sets.newHashSet(getCodeIso2(), getCodeIso3());
    }
}
