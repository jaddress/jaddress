package org.jaddress.address.canada.province;

import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public interface CanadianProvince {
    String getOfficialName();
    String getCodeIso2();
    Set<String> getRecognizedNames();
    Set<String> getRecognizedAbbreviations();
}
