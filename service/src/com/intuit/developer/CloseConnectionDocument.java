/*
 * An XML document type.
 * Localname: closeConnection
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.CloseConnectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one closeConnection(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface CloseConnectionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CloseConnectionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("closeconnection2d98doctype");
    
    /**
     * Gets the "closeConnection" element
     */
    com.intuit.developer.CloseConnectionDocument.CloseConnection getCloseConnection();
    
    /**
     * Sets the "closeConnection" element
     */
    void setCloseConnection(com.intuit.developer.CloseConnectionDocument.CloseConnection closeConnection);
    
    /**
     * Appends and returns a new empty "closeConnection" element
     */
    com.intuit.developer.CloseConnectionDocument.CloseConnection addNewCloseConnection();
    
    /**
     * An XML closeConnection(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface CloseConnection extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CloseConnection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("closeconnection6df6elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.CloseConnectionDocument.CloseConnection newInstance() {
              return (com.intuit.developer.CloseConnectionDocument.CloseConnection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.CloseConnectionDocument.CloseConnection newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.CloseConnectionDocument.CloseConnection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.CloseConnectionDocument newInstance() {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.CloseConnectionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.CloseConnectionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.CloseConnectionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.CloseConnectionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.CloseConnectionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
