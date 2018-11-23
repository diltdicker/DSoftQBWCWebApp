/*
 * An XML document type.
 * Localname: sendRequestXML
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.SendRequestXMLDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one sendRequestXML(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface SendRequestXMLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendRequestXMLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("sendrequestxml6d0cdoctype");
    
    /**
     * Gets the "sendRequestXML" element
     */
    com.intuit.developer.SendRequestXMLDocument.SendRequestXML getSendRequestXML();
    
    /**
     * Sets the "sendRequestXML" element
     */
    void setSendRequestXML(com.intuit.developer.SendRequestXMLDocument.SendRequestXML sendRequestXML);
    
    /**
     * Appends and returns a new empty "sendRequestXML" element
     */
    com.intuit.developer.SendRequestXMLDocument.SendRequestXML addNewSendRequestXML();
    
    /**
     * An XML sendRequestXML(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface SendRequestXML extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendRequestXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("sendrequestxmlab58elemtype");
        
        /**
         * Gets the "ticket" element
         */
        java.lang.String getTicket();
        
        /**
         * Gets (as xml) the "ticket" element
         */
        org.apache.xmlbeans.XmlString xgetTicket();
        
        /**
         * True if has "ticket" element
         */
        boolean isSetTicket();
        
        /**
         * Sets the "ticket" element
         */
        void setTicket(java.lang.String ticket);
        
        /**
         * Sets (as xml) the "ticket" element
         */
        void xsetTicket(org.apache.xmlbeans.XmlString ticket);
        
        /**
         * Unsets the "ticket" element
         */
        void unsetTicket();
        
        /**
         * Gets the "strHCPResponse" element
         */
        java.lang.String getStrHCPResponse();
        
        /**
         * Gets (as xml) the "strHCPResponse" element
         */
        org.apache.xmlbeans.XmlString xgetStrHCPResponse();
        
        /**
         * True if has "strHCPResponse" element
         */
        boolean isSetStrHCPResponse();
        
        /**
         * Sets the "strHCPResponse" element
         */
        void setStrHCPResponse(java.lang.String strHCPResponse);
        
        /**
         * Sets (as xml) the "strHCPResponse" element
         */
        void xsetStrHCPResponse(org.apache.xmlbeans.XmlString strHCPResponse);
        
        /**
         * Unsets the "strHCPResponse" element
         */
        void unsetStrHCPResponse();
        
        /**
         * Gets the "strCompanyFileName" element
         */
        java.lang.String getStrCompanyFileName();
        
        /**
         * Gets (as xml) the "strCompanyFileName" element
         */
        org.apache.xmlbeans.XmlString xgetStrCompanyFileName();
        
        /**
         * True if has "strCompanyFileName" element
         */
        boolean isSetStrCompanyFileName();
        
        /**
         * Sets the "strCompanyFileName" element
         */
        void setStrCompanyFileName(java.lang.String strCompanyFileName);
        
        /**
         * Sets (as xml) the "strCompanyFileName" element
         */
        void xsetStrCompanyFileName(org.apache.xmlbeans.XmlString strCompanyFileName);
        
        /**
         * Unsets the "strCompanyFileName" element
         */
        void unsetStrCompanyFileName();
        
        /**
         * Gets the "qbXMLCountry" element
         */
        java.lang.String getQbXMLCountry();
        
        /**
         * Gets (as xml) the "qbXMLCountry" element
         */
        org.apache.xmlbeans.XmlString xgetQbXMLCountry();
        
        /**
         * True if has "qbXMLCountry" element
         */
        boolean isSetQbXMLCountry();
        
        /**
         * Sets the "qbXMLCountry" element
         */
        void setQbXMLCountry(java.lang.String qbXMLCountry);
        
        /**
         * Sets (as xml) the "qbXMLCountry" element
         */
        void xsetQbXMLCountry(org.apache.xmlbeans.XmlString qbXMLCountry);
        
        /**
         * Unsets the "qbXMLCountry" element
         */
        void unsetQbXMLCountry();
        
        /**
         * Gets the "qbXMLMajorVers" element
         */
        int getQbXMLMajorVers();
        
        /**
         * Gets (as xml) the "qbXMLMajorVers" element
         */
        org.apache.xmlbeans.XmlInt xgetQbXMLMajorVers();
        
        /**
         * Sets the "qbXMLMajorVers" element
         */
        void setQbXMLMajorVers(int qbXMLMajorVers);
        
        /**
         * Sets (as xml) the "qbXMLMajorVers" element
         */
        void xsetQbXMLMajorVers(org.apache.xmlbeans.XmlInt qbXMLMajorVers);
        
        /**
         * Gets the "qbXMLMinorVers" element
         */
        int getQbXMLMinorVers();
        
        /**
         * Gets (as xml) the "qbXMLMinorVers" element
         */
        org.apache.xmlbeans.XmlInt xgetQbXMLMinorVers();
        
        /**
         * Sets the "qbXMLMinorVers" element
         */
        void setQbXMLMinorVers(int qbXMLMinorVers);
        
        /**
         * Sets (as xml) the "qbXMLMinorVers" element
         */
        void xsetQbXMLMinorVers(org.apache.xmlbeans.XmlInt qbXMLMinorVers);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.SendRequestXMLDocument.SendRequestXML newInstance() {
              return (com.intuit.developer.SendRequestXMLDocument.SendRequestXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.SendRequestXMLDocument.SendRequestXML newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.SendRequestXMLDocument.SendRequestXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.SendRequestXMLDocument newInstance() {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.SendRequestXMLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.SendRequestXMLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.SendRequestXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.SendRequestXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.SendRequestXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
