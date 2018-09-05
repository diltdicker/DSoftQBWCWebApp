/*
 * An XML document type.
 * Localname: authenticateResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.AuthenticateResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one authenticateResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface AuthenticateResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthenticateResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("authenticateresponse2406doctype");
    
    /**
     * Gets the "authenticateResponse" element
     */
    com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse getAuthenticateResponse();
    
    /**
     * Sets the "authenticateResponse" element
     */
    void setAuthenticateResponse(com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse authenticateResponse);
    
    /**
     * Appends and returns a new empty "authenticateResponse" element
     */
    com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse addNewAuthenticateResponse();
    
    /**
     * An XML authenticateResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface AuthenticateResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthenticateResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("authenticateresponse85d8elemtype");
        
        /**
         * Gets the "authenticateResult" element
         */
        com.intuit.developer.ArrayOfString getAuthenticateResult();
        
        /**
         * True if has "authenticateResult" element
         */
        boolean isSetAuthenticateResult();
        
        /**
         * Sets the "authenticateResult" element
         */
        void setAuthenticateResult(com.intuit.developer.ArrayOfString authenticateResult);
        
        /**
         * Appends and returns a new empty "authenticateResult" element
         */
        com.intuit.developer.ArrayOfString addNewAuthenticateResult();
        
        /**
         * Unsets the "authenticateResult" element
         */
        void unsetAuthenticateResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse newInstance() {
              return (com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.AuthenticateResponseDocument.AuthenticateResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.AuthenticateResponseDocument newInstance() {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.AuthenticateResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.AuthenticateResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.AuthenticateResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.AuthenticateResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
