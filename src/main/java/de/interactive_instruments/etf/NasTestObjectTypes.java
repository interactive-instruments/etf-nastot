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

import static de.interactive_instruments.etf.StdTestObjectTypes.XML_DOCUMENTS_TOT;

import java.util.Collections;
import java.util.LinkedHashMap;

import de.interactive_instruments.etf.dal.dto.capabilities.TestObjectTypeDto;
import de.interactive_instruments.etf.model.*;

/**
 * NAS Test Object Types.
 *
 * @author Jon Herrmann ( herrmann aT interactive-instruments doT de )
 */
public class NasTestObjectTypes {

    // Supported Test Object Types
    public static final TestObjectTypeDto NAS_TOT = new TestObjectTypeDto();
    private static EID NAS_ID = EidFactory.getDefault().createAndPreserveStr("adb5467b-d05f-4ed3-9ecb-19d387eebe68");

    private static final TestObjectTypeDto BESTANDSDATENAUSZUG_TOT = new TestObjectTypeDto();
    private static EID BESTANDSDATENAUSZUG_ID = EidFactory.getDefault()
            .createAndPreserveStr("ad60a868-2a95-4f4e-8875-6b06b7acba15");

    private static final TestObjectTypeDto EINRICHTUNGSAUFTRAG_TOT = new TestObjectTypeDto();
    private static EID EINRICHTUNGSAUFTRAG_ID = EidFactory.getDefault()
            .createAndPreserveStr("ad0f79a2-6274-434b-acdc-72488ba569ec");

    private static final TestObjectTypeDto FORTFUEHRUNGSAUFTRAG_TOT = new TestObjectTypeDto();
    private static EID FORTFUEHRUNGSAUFTRAG_ID = EidFactory.getDefault()
            .createAndPreserveStr("ada03905-65e9-405c-acd3-a1e5ef93152c");

    private static final TestObjectTypeDto NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT = new TestObjectTypeDto();
    private static EID NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_ID = EidFactory.getDefault()
            .createAndPreserveStr("ad33a664-e10a-4d09-87fa-f16e49042be8");

    // GID 6
    private static final TestObjectTypeDto BESTANDSDATENAUSZUG_6_TOT = new TestObjectTypeDto();
    private static EID BESTANDSDATENAUSZUG_6_ID = EidFactory.getDefault()
            .createAndPreserveStr("afdd346a-1658-4345-8e16-8007549c0b1d");

    private static final TestObjectTypeDto EINRICHTUNGSAUFTRAG_6_TOT = new TestObjectTypeDto();
    private static EID EINRICHTUNGSAUFTRAG_6_ID = EidFactory.getDefault()
            .createAndPreserveStr("eb6e3980-11da-4224-b161-7ab42669f1ce");

    private static final TestObjectTypeDto FORTFUEHRUNGSAUFTRAG_6_TOT = new TestObjectTypeDto();
    private static EID FORTFUEHRUNGSAUFTRAG_6_ID = EidFactory.getDefault()
            .createAndPreserveStr("da30143e-287b-407e-8e9e-e0b6cad8b50d");

    private static final TestObjectTypeDto NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT = new TestObjectTypeDto();
    private static EID NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_ID = EidFactory.getDefault()
            .createAndPreserveStr("24ac3226-c322-4d84-b9ac-65444f8fc129");

    // GID 7
    private static final TestObjectTypeDto BESTANDSDATENAUSZUG_7_TOT = new TestObjectTypeDto();
    private static EID BESTANDSDATENAUSZUG_7_ID = EidFactory.getDefault()
            .createAndPreserveStr("7a7fe021-4244-493f-ba94-0769a2bdadbc");

    private static final TestObjectTypeDto EINRICHTUNGSAUFTRAG_7_TOT = new TestObjectTypeDto();
    private static EID EINRICHTUNGSAUFTRAG_7_ID = EidFactory.getDefault()
            .createAndPreserveStr("0428ce18-c9ae-4088-90a0-9dccb4acbb00");

    private static final TestObjectTypeDto FORTFUEHRUNGSAUFTRAG_7_TOT = new TestObjectTypeDto();
    private static EID FORTFUEHRUNGSAUFTRAG_7_ID = EidFactory.getDefault()
            .createAndPreserveStr("03722082-435f-4935-ba6f-f9a1f832f193");

    private static final TestObjectTypeDto NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT = new TestObjectTypeDto();
    private static EID NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_ID = EidFactory.getDefault()
            .createAndPreserveStr("4a6cb92b-0cf4-45ce-b70c-2744a2335edf");

    // GID 7.1
    private static final TestObjectTypeDto BESTANDSDATENAUSZUG_7_1_TOT = new TestObjectTypeDto();
    private static EID BESTANDSDATENAUSZUG_7_1_ID = EidFactory.getDefault()
            .createAndPreserveStr("321a6d11-e625-4cbd-bfda-31b1dce16161");

    private static final TestObjectTypeDto EINRICHTUNGSAUFTRAG_7_1_TOT = new TestObjectTypeDto();
    private static EID EINRICHTUNGSAUFTRAG_7_1_ID = EidFactory.getDefault()
            .createAndPreserveStr("b0f017f1-7ab1-4273-a061-4b6ababfefa3");

    private static final TestObjectTypeDto FORTFUEHRUNGSAUFTRAG_7_1_TOT = new TestObjectTypeDto();
    private static EID FORTFUEHRUNGSAUFTRAG_7_1_ID = EidFactory.getDefault()
            .createAndPreserveStr("e12a5f61-4272-4375-ab09-401a70dc3562");

    private static final TestObjectTypeDto NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT = new TestObjectTypeDto();
    private static EID NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_ID = EidFactory.getDefault()
            .createAndPreserveStr("442dee4b-772a-495a-a321-6f4956312f47");

    private static final String GID_6_NS = "http://www.adv-online.de/namespaces/adv/gid/6.0";
    private static final String GID_7_0_NS = "http://www.adv-online.de/namespaces/adv/gid/7.0";
    private static final String GID_7_1_NS = "http://www.adv-online.de/namespaces/adv/gid/7.1";

    private static String rootElementCheck(final String elementName) {
        return "boolean(/*[local-name() = '" + elementName + "'])";
    }

    private static String rootElementCheck(final String elementName, final String namespace) {
        return "boolean(/*[local-name() = '" + elementName + "' and namespace-uri() = '" + namespace + "' ])";
    }

    // Supported Test Object Types
    final static EidMap<TestObjectTypeDto> types = new DefaultEidMap<>(
            Collections.unmodifiableMap(new LinkedHashMap<EID, TestObjectTypeDto>() {

                {
                    NAS_TOT.setLabel("Datenaustauschformate der NAS");
                    NAS_TOT.setId(NAS_ID);
                    NAS_TOT.setParent(XML_DOCUMENTS_TOT);
                    NAS_TOT.setDescription("Datenaustauschformate der Normbasierten Austauschschnittstelle (NAS)");
                    put(NAS_ID, NAS_TOT);
                }

                // Bestandsdatenauszug
                {
                    BESTANDSDATENAUSZUG_TOT.setLabel("Bestandsdatenauszug");
                    BESTANDSDATENAUSZUG_TOT.setId(BESTANDSDATENAUSZUG_ID);
                    BESTANDSDATENAUSZUG_TOT.setParent(NAS_TOT);
                    BESTANDSDATENAUSZUG_TOT
                            .setDescription("Der Bestandsdatenauszug enthält die ALKIS-Bestandsdaten "
                                    + "inklusive der Zusatzdaten (z.B. Präsentationsobjekte) in "
                                    + "objektstrukturierter Form");
                    BESTANDSDATENAUSZUG_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Bestandsdatenauszug"),
                            ExpressionType.XPATH);
                    put(BESTANDSDATENAUSZUG_ID, BESTANDSDATENAUSZUG_TOT);
                }
                {
                    BESTANDSDATENAUSZUG_6_TOT.setLabel("Bestandsdatenauszug GeoInfoDok 6.0");
                    BESTANDSDATENAUSZUG_6_TOT.setId(BESTANDSDATENAUSZUG_6_ID);
                    BESTANDSDATENAUSZUG_6_TOT.setParent(BESTANDSDATENAUSZUG_TOT);
                    BESTANDSDATENAUSZUG_6_TOT
                            .setDescription("Enthält ALKIS-Bestandsdaten "
                                    + "inklusive der Zusatzdaten (z.B. Präsentationsobjekte) in "
                                    + "objektstrukturierter Form, gemäß der GeoInfoDok Version 6.0");
                    BESTANDSDATENAUSZUG_6_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Bestandsdatenauszug", GID_6_NS),
                            ExpressionType.XPATH);
                    put(BESTANDSDATENAUSZUG_6_ID, BESTANDSDATENAUSZUG_6_TOT);
                }
                {
                    BESTANDSDATENAUSZUG_7_TOT.setLabel("Bestandsdatenauszug GeoInfoDok 7.0");
                    BESTANDSDATENAUSZUG_7_TOT.setId(BESTANDSDATENAUSZUG_7_ID);
                    BESTANDSDATENAUSZUG_7_TOT.setParent(BESTANDSDATENAUSZUG_TOT);
                    BESTANDSDATENAUSZUG_7_TOT
                            .setDescription("Enthält ALKIS-Bestandsdaten "
                                    + "inklusive der Zusatzdaten (z.B. Präsentationsobjekte) in "
                                    + "objektstrukturierter Form, gemäß der GeoInfoDok Version 7.0");
                    BESTANDSDATENAUSZUG_7_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Bestandsdatenauszug", GID_7_0_NS),
                            ExpressionType.XPATH);
                    put(BESTANDSDATENAUSZUG_7_ID, BESTANDSDATENAUSZUG_7_TOT);
                }
                {
                    BESTANDSDATENAUSZUG_7_1_TOT.setLabel("Bestandsdatenauszug AAA-AS 7.1");
                    BESTANDSDATENAUSZUG_7_1_TOT.setId(BESTANDSDATENAUSZUG_7_1_ID);
                    BESTANDSDATENAUSZUG_7_1_TOT.setParent(BESTANDSDATENAUSZUG_TOT);
                    BESTANDSDATENAUSZUG_7_1_TOT
                            .setDescription("Enthält ALKIS-Bestandsdaten "
                                    + "inklusive der Zusatzdaten (z.B. Präsentationsobjekte) in "
                                    + "objektstrukturierter Form, gemäß dem AAA-AS 7.1");
                    BESTANDSDATENAUSZUG_7_1_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Bestandsdatenauszug", GID_7_1_NS),
                            ExpressionType.XPATH);
                    put(BESTANDSDATENAUSZUG_7_1_ID, BESTANDSDATENAUSZUG_7_1_TOT);
                }

                // Einrichtungsauftrag
                {
                    EINRICHTUNGSAUFTRAG_TOT.setLabel("Einrichtungsauftrag");
                    EINRICHTUNGSAUFTRAG_TOT.setId(EINRICHTUNGSAUFTRAG_ID);
                    EINRICHTUNGSAUFTRAG_TOT.setParent(NAS_TOT);
                    EINRICHTUNGSAUFTRAG_TOT
                            .setDescription("Die Objektart Einrichtungsauftrag steuert das Verfahren der "
                                    + "Datenmigration in der ALKIS-Führungskomponente");
                    EINRICHTUNGSAUFTRAG_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Einrichtungsauftrag"),
                            ExpressionType.XPATH);
                    put(EINRICHTUNGSAUFTRAG_ID, EINRICHTUNGSAUFTRAG_TOT);
                }
                {
                    EINRICHTUNGSAUFTRAG_6_TOT.setLabel("Einrichtungsauftrag GeoInfoDok 6.0");
                    EINRICHTUNGSAUFTRAG_6_TOT.setId(EINRICHTUNGSAUFTRAG_6_ID);
                    EINRICHTUNGSAUFTRAG_6_TOT.setParent(EINRICHTUNGSAUFTRAG_TOT);
                    EINRICHTUNGSAUFTRAG_6_TOT
                            .setDescription("Steuerung des Verfahrens der "
                                    + "Migration von GeoInfoDok 6.0-konformen Daten in der "
                                    + "ALKIS-Führungskomponente");
                    EINRICHTUNGSAUFTRAG_6_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Einrichtungsauftrag", GID_6_NS),
                            ExpressionType.XPATH);
                    put(EINRICHTUNGSAUFTRAG_6_ID, EINRICHTUNGSAUFTRAG_6_TOT);
                }
                {
                    EINRICHTUNGSAUFTRAG_7_TOT.setLabel("Einrichtungsauftrag GeoInfoDok 7.0");
                    EINRICHTUNGSAUFTRAG_7_TOT.setId(EINRICHTUNGSAUFTRAG_7_ID);
                    EINRICHTUNGSAUFTRAG_7_TOT.setParent(EINRICHTUNGSAUFTRAG_TOT);
                    EINRICHTUNGSAUFTRAG_7_TOT
                            .setDescription("Steuerung des Verfahrens der "
                                    + "Migration von GeoInfoDok 7.0-konformen Daten in der "
                                    + "ALKIS-Führungskomponente");
                    EINRICHTUNGSAUFTRAG_7_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Einrichtungsauftrag", GID_7_0_NS),
                            ExpressionType.XPATH);
                    put(EINRICHTUNGSAUFTRAG_7_ID, EINRICHTUNGSAUFTRAG_7_TOT);
                }
                {
                    EINRICHTUNGSAUFTRAG_7_1_TOT.setLabel("Einrichtungsauftrag AAA-AS 7.1");
                    EINRICHTUNGSAUFTRAG_7_1_TOT.setId(EINRICHTUNGSAUFTRAG_7_1_ID);
                    EINRICHTUNGSAUFTRAG_7_1_TOT.setParent(EINRICHTUNGSAUFTRAG_TOT);
                    EINRICHTUNGSAUFTRAG_7_1_TOT
                            .setDescription("Steuerung des Verfahrens der "
                                    + "Migration von AAA-AS 7.1-konformen Daten in der "
                                    + "ALKIS-Führungskomponente");
                    EINRICHTUNGSAUFTRAG_7_1_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Einrichtungsauftrag", GID_7_1_NS),
                            ExpressionType.XPATH);
                    put(EINRICHTUNGSAUFTRAG_7_1_ID, EINRICHTUNGSAUFTRAG_7_1_TOT);
                }

                // Fortfuehrungsauftrag
                {
                    FORTFUEHRUNGSAUFTRAG_TOT.setLabel("Fortführungsauftrag");
                    FORTFUEHRUNGSAUFTRAG_TOT.setId(FORTFUEHRUNGSAUFTRAG_ID);
                    FORTFUEHRUNGSAUFTRAG_TOT.setParent(NAS_TOT);
                    FORTFUEHRUNGSAUFTRAG_TOT
                            .setDescription(
                                    "Ein Fortführungsauftrag fasst die vorliegenden Fortführungsfälle "
                                            + "zusammen und steuert das Verfahren der Datenaktualisierung "
                                            + "in der ALKIS-Führungskomponente");
                    FORTFUEHRUNGSAUFTRAG_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Fortfuehrungsauftrag"),
                            ExpressionType.XPATH);
                    put(FORTFUEHRUNGSAUFTRAG_ID, FORTFUEHRUNGSAUFTRAG_TOT);
                }
                {
                    FORTFUEHRUNGSAUFTRAG_6_TOT.setLabel("Fortführungsauftrag GeoInfoDok 6.0");
                    FORTFUEHRUNGSAUFTRAG_6_TOT.setId(FORTFUEHRUNGSAUFTRAG_6_ID);
                    FORTFUEHRUNGSAUFTRAG_6_TOT.setParent(FORTFUEHRUNGSAUFTRAG_TOT);
                    FORTFUEHRUNGSAUFTRAG_6_TOT
                            .setDescription(
                                    "Fortführungsauftrag in GeoInfoDok 6.0");
                    FORTFUEHRUNGSAUFTRAG_6_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Fortfuehrungsauftrag", GID_6_NS),
                            ExpressionType.XPATH);
                    put(FORTFUEHRUNGSAUFTRAG_6_ID, FORTFUEHRUNGSAUFTRAG_6_TOT);
                }
                {
                    FORTFUEHRUNGSAUFTRAG_7_TOT.setLabel("Fortführungsauftrag GeoInfoDok 7.0");
                    FORTFUEHRUNGSAUFTRAG_7_TOT.setId(FORTFUEHRUNGSAUFTRAG_7_ID);
                    FORTFUEHRUNGSAUFTRAG_7_TOT.setParent(FORTFUEHRUNGSAUFTRAG_TOT);
                    FORTFUEHRUNGSAUFTRAG_7_TOT
                            .setDescription(
                                    "Fortführungsauftrag in GeoInfoDok 7.0");
                    FORTFUEHRUNGSAUFTRAG_7_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Fortfuehrungsauftrag", GID_7_0_NS),
                            ExpressionType.XPATH);
                    put(FORTFUEHRUNGSAUFTRAG_7_ID, FORTFUEHRUNGSAUFTRAG_7_TOT);
                }
                {
                    FORTFUEHRUNGSAUFTRAG_7_1_TOT.setLabel("Fortführungsauftrag AAA-AS 7.1");
                    FORTFUEHRUNGSAUFTRAG_7_1_TOT.setId(FORTFUEHRUNGSAUFTRAG_7_1_ID);
                    FORTFUEHRUNGSAUFTRAG_7_1_TOT.setParent(FORTFUEHRUNGSAUFTRAG_TOT);
                    FORTFUEHRUNGSAUFTRAG_7_1_TOT
                            .setDescription(
                                    "Fortführungsauftrag in AAA-AS 7.1");
                    FORTFUEHRUNGSAUFTRAG_7_1_TOT.setDetectionExpression(rootElementCheck(
                            "AX_Fortfuehrungsauftrag", GID_7_1_NS),
                            ExpressionType.XPATH);
                    put(FORTFUEHRUNGSAUFTRAG_7_1_ID, FORTFUEHRUNGSAUFTRAG_7_1_TOT);
                }

                // Nutzerbezogene Bestandsdatenaktualisierung NBA
                {
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT.setLabel(
                            "Nutzerbezogene Bestandsdatenaktualisierung (NBA)");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT.setId(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_ID);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT.setParent(NAS_TOT);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT
                            .setDescription("Fortführungsfallbezogen Änderungsdaten und/oder"
                                    + "stichtagsbezogen Differenzdaten");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT.setDetectionExpression(rootElementCheck(
                            "AX_NutzerbezogeneBestandsdatenaktualisierung_NBA"),
                            ExpressionType.XPATH);
                    put(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_ID,
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT);
                }
                {
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT.setLabel(
                            "Nutzerbezogene Bestandsdatenaktualisierung (NBA) GeoInfoDok 6.0");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT.setId(
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_ID);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT.setParent(
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT
                            .setDescription("Fortführungsfallbezogen Änderungsdaten und/oder"
                                    + "stichtagsbezogen Differenzdaten gemäß der GeoInfoDok 6.0");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT.setDetectionExpression(rootElementCheck(
                            "AX_NutzerbezogeneBestandsdatenaktualisierung_NBA", GID_6_NS),
                            ExpressionType.XPATH);
                    put(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_ID,
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_6_TOT);
                }
                {
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT.setLabel(
                            "Nutzerbezogene Bestandsdatenaktualisierung (NBA) GeoInfoDok 7.0");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT.setId(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_ID);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT.setParent(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT
                            .setDescription("Fortführungsfallbezogen Änderungsdaten und/oder"
                                    + "stichtagsbezogen Differenzdaten gemäß der GeoInfoDok 7.0");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT.setDetectionExpression(
                            rootElementCheck(
                                    "AX_NutzerbezogeneBestandsdatenaktualisierung_NBA", GID_7_0_NS),
                            ExpressionType.XPATH);
                    put(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_ID,
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_TOT);
                }
                {
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT.setLabel(
                            "Nutzerbezogene Bestandsdatenaktualisierung (NBA) AAA-AS 7.1");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT.setId(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_ID);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT
                            .setParent(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_TOT);
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT
                            .setDescription("Fortführungsfallbezogen Änderungsdaten und/oder"
                                    + "stichtagsbezogen Differenzdaten gemäß dem AAA-AS 7.1");
                    NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT.setDetectionExpression(
                            rootElementCheck(
                                    "AX_NutzerbezogeneBestandsdatenaktualisierung_NBA", GID_7_0_NS),
                            ExpressionType.XPATH);
                    put(NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_ID,
                            NUTZERBEZOGENE_BESTANDSDATENAKTUALISIERUNG_7_1_TOT);
                }

            }));
}
