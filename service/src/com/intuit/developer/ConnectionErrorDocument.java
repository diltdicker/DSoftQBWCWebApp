/*
 * An XML document type.
 * Localname: connectionError
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.ConnectionErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one connectionError(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface ConnectionErrorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConnectionErrorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("connectionerrorb344doctype");
    
    /**
     * Gets the "connectionError" element
     */
    com.intuit.developer.ConnectionErrorDocument.ConnectionError getConnectionError();
    
    /**
     * Sets the "connectionError" element
     */
    void setConnectionError(com.intuit.developer.ConnectionErrorDocument.ConnectionError connectionError);
    
    /**
     * Appends and returns a new empty "connectionError" element
     */
    com.intuit.developer.ConnectionErrorDocument.ConnectionError addNewConnectionError();
    
    /**
     * An XML connectionError(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface ConnectionError extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConnectionError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("connectionerrore64eelemtype");
        
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
         * Gets the "hresult" element
         */
        java.lang.String getHresult();
        
        /**
         * Gets (as xml) the "hresult" element
         */
        org.apache.xmlbeans.XmlString xgetHresult();
        
        /**
         * True if has "hresult" element
         */
        boolean isSetHresult();
        
        /**
         * Sets the "hresult" element
         */
        void setHresult(java.lang.String hresult);
        
        /**
         * Sets (as xml) the "hresult" element
         */
        void xsetHresult(org.apache.xmlbeans.XmlString hresult);
        
        /**
         * Unsets the "hresult" element
         */
        void unsetHresult();
        
        /**
         * Gets the "message" element
         */
        java.lang.String getMessage();
        
        /**
         * Gets (as xml) the "message" element
         */
        org.apache.xmlbeans.XmlString xgetMessage();
        
        /**
         * True if has "message" element
         */
        boolean isSetMessage();
        
        /**
         * Sets the "message" element
         */
        void setMessage(java.lang.String message);
        
        /**
         * Sets (as xml) the "message" element
         */
        void xsetMessage(org.apache.xmlbeans.XmlString message);
        
        /**
         * Unsets the "message" element
         */
        void unsetMessage();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.ConnectionErrorDocument.ConnectionError newInstance() {
              return (com.intuit.developer.ConnectionErrorDocument.ConnectionError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.ConnectionErrorDocument.ConnectionError newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.ConnectionErrorDocument.ConnectionError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.ConnectionErrorDocument newInstance() {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.ConnectionErrorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.ConnectionErrorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ConnectionErrorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.ConnectionErrorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.ConnectionErrorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
