/**
 * Copyright 2017-2020 European Union
 *
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This work was supported by the EU Interoperability Solutions for
 * European Public Administrations Programme (http://ec.europa.eu/isa)
 * through Action 1.17: A Reusable INSPIRE Reference Platform (ARE3NA).
 */
package de.interactive_instruments.etf;

import java.util.*;

import de.interactive_instruments.*;
import de.interactive_instruments.etf.dal.dto.capabilities.TestObjectTypeDto;
import de.interactive_instruments.etf.model.EidMap;

/**
 * Standard detector for Test Object Types.
 *
 * The standard detector takes xpath expressions for detecting the test object types, and checks for matches in XML
 * files. As the jdk xpath engine is very slow and memory hungry, the XMLDog engine which is based on Sax is used.
 *
 * Note: Only a subset of XPath 1.0 is supported https://github.com/santhosh-tekuri/jlibs/wiki/XMLDog
 *
 * @author Jon Herrmann ( herrmann aT interactive-instruments doT de )
 * @author Clemens Portele ( portele aT interactive-instruments doT de )
 */
public class NasTestObjectDetector extends StdTestObjectDetector {

    @Override
    public int getPriority() {
        return 50;
    }

    @Override
    public EidMap<TestObjectTypeDto> supportedTypes() {
        return NasTestObjectTypes.types;
    }
}
