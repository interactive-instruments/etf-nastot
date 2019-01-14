# Bibliothek zur Erkennung von Testgegentständen der Normbasierten Datenschnittstelle NAS

__etf-nastot - NAS ETF Test Object Type definitions and type detection extension library__

[![European Union Public Licence 1.2](https://img.shields.io/badge/license-EUPL%201.2-blue.svg)](https://joinup.ec.europa.eu/software/page/eupl)

&copy; 2018 interactive instruments. Licensed under the EUPL.

## Testobjekttypen

Diese Repository enthält die Defintionen von verschiedenen Typen von Testgegentständen, die zur automatisierten Erkennung von NAS-spezifischen Testgegentständen verwendet werden.

Die Typen können in den Konformitätsklassen verwendet werden, um Tests
auf bestimmte Typen von Testgegenständen einzuschränken.


Es werden folgende Typen erkannt und unterstützt:

__Basistyp NAS__

- NAS mit EID adb5467b-d05f-4ed3-9ecb-19d387eebe68, Basistyp für alle folgenden Typen

__AX_Bestandsdatenauszug__

- Bestandsdatenauszug mit EID ad60a868-2a95-4f4e-8875-6b06b7acba15, Basistyp für die folgenden GID-versionsabhängigen Typen

- Bestandsdatenauszug __GID 6.0__ mit EID afdd346a-1658-4345-8e16-8007549c0b1d

- Bestandsdatenauszug __GID 7.0__ mit EID 7a7fe021-4244-493f-ba94-0769a2bdadbc

- Bestandsdatenauszug __GID 7.1__ mit EID 321a6d11-e625-4cbd-bfda-31b1dce16161

__AX_Einrichtungsauftrag__

- Einrichtungsauftrag mit EID ad0f79a2-6274-434b-acdc-72488ba569ec, Basistyp für die folgenden GID-versionsabhängigen Typen

- Einrichtungsauftrag __GID 6.0__ mit EID eb6e3980-11da-4224-b161-7ab42669f1ce

- Einrichtungsauftrag __GID 7.0__ mit EID 0428ce18-c9ae-4088-90a0-9dccb4acbb00

- Einrichtungsauftrag __GID 7.1__ mit EID b0f017f1-7ab1-4273-a061-4b6ababfefa3


__AX_Fortfuehrungsauftrag__

- Fortführungsauftrag mit EID ada03905-65e9-405c-acd3-a1e5ef93152c, Basistyp für die folgenden GID-versionsabhängigen Typen

- Fortführungsauftrag __GID 6.0__ mit EID da30143e-287b-407e-8e9e-e0b6cad8b50d

- Fortführungsauftrag __GID 7.0__ mit EID 03722082-435f-4935-ba6f-f9a1f832f193

- Fortführungsauftrag __GID 7.1__ mit EID e12a5f61-4272-4375-ab09-401a70dc3562


__AX_NutzerbezogeneBestandsdatenaktualisierung_NBA__

- Nutzerbezogene Bestandsdatenaktualisierung mit EID ad33a664-e10a-4d09-87fa-f16e49042be8, Basistyp für die folgenden GID-versionsabhängigen Typen

- Nutzerbezogene Bestandsdatenaktualisierung __GID 6.0__ mit EID 24ac3226-c322-4d84-b9ac-65444f8fc129

- Nutzerbezogene Bestandsdatenaktualisierung __GID 7.0__ mit EID 4a6cb92b-0cf4-45ce-b70c-2744a2335edf

- Nutzerbezogene Bestandsdatenaktualisierung __GID 7.1__ mit EID 442dee4b-772a-495a-a321-6f4956312f47


## Verwendung

In der Konformitätsklasse muss mindestens ein oder mehrere Testobjekttypen
unterhalb des Elements _supportedTestObjectTypes_ angegeben werden.

Das folgende Beispiel zeigt die _supportedTestObjectTypes_ einer Konformitätsklasse,
die:

- AX_Bestandsdatenauszug in der GID Version 6.0,
- Nutzerbezogene Bestandsdatenaktualisierung in den GID Versionen 7.0 und 7.1
- AX_Einrichtungsauftrag in allen GID Versionen unterstützt


```xml
<supportedTestObjectTypes>
  <!-- AX_Bestandsdatenauszug GID 6.0 -->
  <testObjectType ref="da30143e-287b-407e-8e9e-e0b6cad8b50d"/>

  <!-- AX_NutzerbezogeneBestandsdatenaktualisierung_NBA GID 6.0 -->
  <testObjectType ref="4a6cb92b-0cf4-45ce-b70c-2744a2335edf"/>
  <!-- AX_NutzerbezogeneBestandsdatenaktualisierung_NBA GID 7.0 -->
  <testObjectType ref="442dee4b-772a-495a-a321-6f4956312f47"/>

  <!-- AX_Einrichtungsauftrag, versionsunabhängig -->
  <testObjectType ref="ad0f79a2-6274-434b-acdc-72488ba569ec"/>
</supportedTestObjectTypes>
```

Beim Starten eines Testlaufs, werden Testobjekte abgewiesen, die nicht von
der Konformitätsklasse unterstütz werden. So würde für das Beispiel oberhalb,
ein GID 7.1 Bestandsdatenauszug abgewiesen werden.
