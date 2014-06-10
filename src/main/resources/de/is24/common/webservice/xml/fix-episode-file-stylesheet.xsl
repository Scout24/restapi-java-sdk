<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  xmlns:jb="http://java.sun.com/xml/ns/jaxb" xmlns:tns="http://rest.immobilienscout24.de/schema/platform/gis/1.0">

    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="/jb:bindings/jb:bindings">
        <xsl:copy>
            <xsl:attribute name="if-exists"></xsl:attribute>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
       
    </xsl:template>
    
</xsl:stylesheet>