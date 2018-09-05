/*
 * An XML document type.
 * Localname: getLastErrorResponse
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.GetLastErrorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer;


/**
 * A document containing one getLastErrorResponse(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public interface GetLastErrorResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLastErrorResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("getlasterrorresponse54dfdoctype");
    
    /**
     * Gets the "getLastErrorResponse" element
     */
    com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse getGetLastErrorResponse();
    
    /**
     * Sets the "getLastErrorResponse" element
     */
    void setGetLastErrorResponse(com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse getLastErrorResponse);
    
    /**
     * Appends and returns a new empty "getLastErrorResponse" element
     */
    com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse addNewGetLastErrorResponse();
    
    /**
     * An XML getLastErrorResponse(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public interface GetLastErrorResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLastErrorResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s244C89F3296C1C041A1D1F474E103B01").resolveHandle("getlasterrorresponsea1b8elemtype");
        
        /**
         * Gets the "getLastErrorResult" element
         */
        java.lang.String getGetLastErrorResult();
        
        /**
         * Gets (as xml) the "getLastErrorResult" element
         */
        org.apache.xmlbeans.XmlString xgetGetLastErrorResult();
        
        /**
         * True if has "getLastErrorResult" element
         */
        boolean isSetGetLastErrorResult();
        
        /**
         * Sets the "getLastErrorResult" element
         */
        void setGetLastErrorResult(java.lang.String getLastErrorResult);
        
        /**
         * Sets (as xml) the "getLastErrorResult" element
         */
        void xsetGetLastErrorResult(org.apache.xmlbeans.XmlString getLastErrorResult);
        
        /**
         * Unsets the "getLastErrorResult" element
         */
        void unsetGetLastErrorResult();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse newInstance() {
              return (com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.intuit.developer.GetLastErrorResponseDocument.GetLastErrorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.intuit.developer.GetLastErrorResponseDocument newInstance() {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.intuit.developer.GetLastErrorResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.GetLastErrorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.intuit.developer.GetLastErrorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.intuit.developer.GetLastErrorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
