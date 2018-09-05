/*
 * An XML document type.
 * Localname: serverVersionResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ServerVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one serverVersionResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface ServerVersionResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServerVersionResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("serverversionresponseca58doctype");
    
    /**
     * Gets the "serverVersionResponse" element
     */
    com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse getServerVersionResponse();
    
    /**
     * Sets the "serverVersionResponse" element
     */
    void setServerVersionResponse(com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse serverVersionResponse);
    
    /**
     * Appends and returns a new empty "serverVersionResponse" element
     */
    com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse addNewServerVersionResponse();
    
    /**
     * An XML serverVersionResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface ServerVersionResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServerVersionResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("serverversionresponsef5b6elemtype");
        
        /**
         * Gets the "serverVersionResult" element
         */
        java.lang.String getServerVersionResult();
        
        /**
         * Gets (as xml) the "serverVersionResult" element
         */
        org.apache.xmlbeans.XmlString xgetServerVersionResult();
        
        /**
         * True if has "serverVersionResult" element
         */
        boolean isSetServerVersionResult();
        
        /**
         * Sets the "serverVersionResult" element
         */
        void setServerVersionResult(java.lang.String serverVersionResult);
        
        /**
         * Sets (as xml) the "serverVersionResult" element
         */
        void xsetServerVersionResult(org.apache.xmlbeans.XmlString serverVersionResult);
        
        /**
         * Unsets the "serverVersionResult" element
         */
        void unsetServerVersionResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse newInstance() {
              return (com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.ServerVersionResponseDocument.ServerVersionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.ServerVersionResponseDocument newInstance() {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.ServerVersionResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ServerVersionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ServerVersionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ServerVersionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
