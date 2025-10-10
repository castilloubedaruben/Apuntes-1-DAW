XML

<?xml version="1.0" encoding="UTF-8"?>
<entrenamiento xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:noNamespaceSchemaLocation="entrenamiento.xsd">
    <sesion intensidad= "baja" codigo="TR-402">
        <fecha>2025-05-12</fecha>
        <hora>18:30</hora>
        <tipo>fuerza</tipo>
        <duracion>40</duracion>
        <ubicacion>gimnasio</ubicacion>
        <coach>Dani</coach>
        <participantes>
            <boxeador>
                <nombre>Juan</nombre>
                <pais>españa</pais>
            </boxeador>
            <boxeador>
                <nombre>Sergio</nombre>
                <pais>italia</pais>
            </boxeador>
        </participantes>
        <ejercicios> 
            <ejercicio>
                <nombre>sentadillas</nombre>
                <opciones>
                    <duracionBloque>50</duracionBloque>
                </opciones>
            </ejercicio>
            <ejercicio>
                <nombre>press banca</nombre>
                <opciones>
                    <seriesRepeticiones>8</seriesRepeticiones>
                </opciones>
            </ejercicio>
        </ejercicios>
        <notas>9</notas>
    </sesion>
</entrenamiento>


XSD
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="entrenamiento">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="sesion" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:sequence>
                            <xs:element name="fecha" type="xs:date" />
                            <xs:element name="hora" type="xs:string" />
                            <xs:element name="tipo">
                                <xs:simpleType>
                                    <xs:restriction base="xs:string">
                                        <xs:enumeration value="fuerza" />
                                        <xs:enumeration value="cardio" />
                                        <xs:enumeration value="sparring" />
                                        <xs:enumeration value="tecnica" />
                                    </xs:restriction>
                                </xs:simpleType>
                            </xs:element>
                            <xs:element name="duracion">
                                <xs:simpleType>
                                    <xs:restriction base="xs:positiveInteger">
                                        <xs:minInclusive value="30" />
                                        <xs:maxInclusive value="240" />
                                    </xs:restriction>
                                </xs:simpleType>
                            </xs:element>
                            <xs:element name="ubicacion" type="xs:string" />
                            <xs:element name="coach">
                                <xs:simpleType>
                                    <xs:restriction base="xs:string">
                                        <xs:pattern value="[A-ZÁÉÍÓÚÑ][a-záéíóúñ]*" />
                                    </xs:restriction>
                                </xs:simpleType>
                            </xs:element>
                            <xs:element name="participantes" minOccurs="1" maxOccurs="unbounded">
                                <xs:complexType>
                                    <xs:sequence>
                                        <xs:element name="boxeador" maxOccurs="unbounded">
                                            <xs:complexType>
                                                <xs:sequence>
                                                    <xs:element name="nombre">
                                                        <xs:simpleType>
                                                            <xs:restriction base="xs:string">
                                                                <xs:pattern
                                                                    value="[A-Za-z]*[a-áéíóú]*" />
                                                            </xs:restriction>
                                                        </xs:simpleType>
                                                    </xs:element>
                                                    <xs:element name="pais">
                                                        <xs:simpleType>
                                                            <xs:restriction base="xs:string">
                                                                <xs:minLength value="2"/>
                                                                <xs:maxLength value="40"/>
                                                            </xs:restriction>
                                                        </xs:simpleType>
                                                    </xs:element>
                                                </xs:sequence>
                                            </xs:complexType>
                                        </xs:element>
                                    </xs:sequence>
                                </xs:complexType>
                            </xs:element>
                            <xs:element name="ejercicios" minOccurs="0" maxOccurs="unbounded">
                                <xs:complexType>
                                    <xs:sequence>
                                        <xs:element name="ejercicio" minOccurs="1"
                                            maxOccurs="unbounded">
                                            <xs:complexType>
                                                <xs:sequence>
                                                    <xs:element name="nombre" type="xs:string" />
                                                    <xs:element name="opciones">
                                                        <xs:complexType>
                                                            <xs:choice>
                                                                <xs:element
                                                                    name="seriesRepeticiones"
                                                                    type="xs:positiveInteger" />
                                                                <xs:element name="duracionBloque">
                                                                    <xs:simpleType>
                                                                        <xs:restriction
                                                                            base="xs:positiveInteger">
                                                                            <xs:minInclusive
                                                                                value="5" />
                                                                            <xs:maxInclusive
                                                                                value="120" />
                                                                        </xs:restriction>
                                                                    </xs:simpleType>
                                                                </xs:element>
                                                            </xs:choice>
                                                        </xs:complexType>
                                                    </xs:element>
                                                </xs:sequence>
                                            </xs:complexType>
                                        </xs:element>
                                    </xs:sequence>
                                </xs:complexType>
                            </xs:element>
                            <xs:element name="notas" minOccurs="0" type="xs:positiveInteger" />
                        </xs:sequence>
                        <xs:attribute name="intensidad" use="required">
                            <xs:simpleType>
                                <xs:restriction base="xs:string">
                                    <xs:enumeration value="baja" />
                                    <xs:enumeration value="media" />
                                    <xs:enumeration value="alta" />
                                </xs:restriction>
                            </xs:simpleType>
                        </xs:attribute>
                        <xs:attribute name="codigo" use="required">
                            <xs:simpleType>
                                <xs:restriction base="xs:string">
                                    <xs:pattern value="[TR]{2}-\d{3}" />
                                </xs:restriction>
                            </xs:simpleType>
                        </xs:attribute>
                    </xs:complexType>
                </xs:element>
            </xs:sequence>
        </xs:complexType>
    </xs:element>
</xs:schema>


XML DEL DTD
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE velada SYSTEM "velada.dtd">
<velada>
    <edicion>2025</edicion>
    <fecha>2025-07-05</fecha>
    <sede>granada</sede>
    <presentador>ibai</presentador>
    <combates>
        <titulo>combate1</titulo>
        <categoria>1vs1</categoria>
        <asaltos>3</asaltos>
        <boxeadores>
            <rojo>
                <nombre>ruben</nombre>
                <alias>wuosel</alias>
                <pais>españa</pais>
            </rojo>
            <azul>
                <nombre>guille</nombre>
                <alias></alias>
                <pais>españa</pais>
            </azul>
        </boxeadores>
        <arbitro>andres</arbitro>
        <jueces>cervi</jueces>
        <jueces>adrian</jueces>
        <jueces>francisco</jueces>
        <resultado>esquina roja</resultado>
        <notas></notas>
    </combates>
</velada>

DTD
<!ELEMENT velada (edicion, fecha, sede, presentador,combates+)>
<!ELEMENT edicion (#PCDATA)>
<!ELEMENT fecha (#PCDATA)>
<!ELEMENT sede (#PCDATA)>
<!ELEMENT presentador (#PCDATA)>
<!ELEMENT combates (titulo, categoria, asaltos, boxeadores, arbitro, jueces+, resultado, notas?)>
<!ELEMENT titulo (#PCDATA)>
<!ELEMENT categoria (#PCDATA)>
<!ELEMENT asaltos (#PCDATA)>
<!ELEMENT boxeadores (rojo, azul)>
<!ELEMENT rojo (nombre, alias*, pais)>
<!ELEMENT nombre (#PCDATA)>
<!ELEMENT alias (#PCDATA)>
<!ELEMENT pais (#PCDATA)>
<!ELEMENT azul (nombre, alias*, pais)>
<!ELEMENT arbitro (#PCDATA)>
<!ELEMENT jueces (#PCDATA)>
<!ELEMENT resultado (#PCDATA)>
<!ELEMENT notas (#PCDATA)>
