package org.jaddress.address;

import java.util.Set;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public interface Country {
    String getOfficialName();
    String getCodeIso3();
    String getCodeIso2();
    Set<String> getRecognizedNames();
    Set<String> getRecognizedAbbreviations();
}
