/*
 * An XML document type.
 * Localname: sendRequestXML
 * Namespace: http://developer.intuit.com/
 * Java type: com.intuit.developer.SendRequestXMLDocument
 *
 * Automatically generated - do not modify.
 */
package com.intuit.developer.impl;
/**
 * A document containing one sendRequestXML(@http://developer.intuit.com/) element.
 *
 * This is a complex type.
 */
public class SendRequestXMLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.SendRequestXMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendRequestXMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDREQUESTXML$0 = 
        new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXML");
    
    
    /**
     * Gets the "sendRequestXML" element
     */
    public com.intuit.developer.SendRequestXMLDocument.SendRequestXML getSendRequestXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.SendRequestXMLDocument.SendRequestXML target = null;
            target = (com.intuit.developer.SendRequestXMLDocument.SendRequestXML)get_store().find_element_user(SENDREQUESTXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendRequestXML" element
     */
    public void setSendRequestXML(com.intuit.developer.SendRequestXMLDocument.SendRequestXML sendRequestXML)
    {
        generatedSetterHelperImpl(sendRequestXML, SENDREQUESTXML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sendRequestXML" element
     */
    public com.intuit.developer.SendRequestXMLDocument.SendRequestXML addNewSendRequestXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.intuit.developer.SendRequestXMLDocument.SendRequestXML target = null;
            target = (com.intuit.developer.SendRequestXMLDocument.SendRequestXML)get_store().add_element_user(SENDREQUESTXML$0);
            return target;
        }
    }
    /**
     * An XML sendRequestXML(@http://developer.intuit.com/).
     *
     * This is a complex type.
     */
    public static class SendRequestXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.intuit.developer.SendRequestXMLDocument.SendRequestXML
    {
        private static final long serialVersionUID = 1L;
        
        public SendRequestXMLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TICKET$0 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "ticket");
        private static final javax.xml.namespace.QName STRHCPRESPONSE$2 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "strHCPResponse");
        private static final javax.xml.namespace.QName STRCOMPANYFILENAME$4 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "strCompanyFileName");
        private static final javax.xml.namespace.QName QBXMLCOUNTRY$6 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLCountry");
        private static final javax.xml.namespace.QName QBXMLMAJORVERS$8 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMajorVers");
        private static final javax.xml.namespace.QName QBXMLMINORVERS$10 = 
            new javax.xml.namespace.QName("http://developer.intuit.com/", "qbXMLMinorVers");
        
        
        /**
         * Gets the "ticket" element
         */
        public java.lang.String getTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ticket" element
         */
        public org.apache.xmlbeans.XmlString xgetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKET$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "ticket" element
         */
        public boolean isSetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TICKET$0) != 0;
            }
        }
        
        /**
         * Sets the "ticket" element
         */
        public void setTicket(java.lang.String ticket)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TICKET$0);
                }
                target.setStringValue(ticket);
            }
        }
        
        /**
         * Sets (as xml) the "ticket" element
         */
        public void xsetTicket(org.apache.xmlbeans.XmlString ticket)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TICKET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TICKET$0);
                }
                target.set(ticket);
            }
        }
        
        /**
         * Unsets the "ticket" element
         */
        public void unsetTicket()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TICKET$0, 0);
            }
        }
        
        /**
         * Gets the "strHCPResponse" element
         */
        public java.lang.String getStrHCPResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRHCPRESPONSE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strHCPResponse" element
         */
        public org.apache.xmlbeans.XmlString xgetStrHCPResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRHCPRESPONSE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "strHCPResponse" element
         */
        public boolean isSetStrHCPResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRHCPRESPONSE$2) != 0;
            }
        }
        
        /**
         * Sets the "strHCPResponse" element
         */
        public void setStrHCPResponse(java.lang.String strHCPResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRHCPRESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRHCPRESPONSE$2);
                }
                target.setStringValue(strHCPResponse);
            }
        }
        
        /**
         * Sets (as xml) the "strHCPResponse" element
         */
        public void xsetStrHCPResponse(org.apache.xmlbeans.XmlString strHCPResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRHCPRESPONSE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRHCPRESPONSE$2);
                }
                target.set(strHCPResponse);
            }
        }
        
        /**
         * Unsets the "strHCPResponse" element
         */
        public void unsetStrHCPResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRHCPRESPONSE$2, 0);
            }
        }
        
        /**
         * Gets the "strCompanyFileName" element
         */
        public java.lang.String getStrCompanyFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRCOMPANYFILENAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "strCompanyFileName" element
         */
        public org.apache.xmlbeans.XmlString xgetStrCompanyFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRCOMPANYFILENAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "strCompanyFileName" element
         */
        public boolean isSetStrCompanyFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRCOMPANYFILENAME$4) != 0;
            }
        }
        
        /**
         * Sets the "strCompanyFileName" element
         */
        public void setStrCompanyFileName(java.lang.String strCompanyFileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRCOMPANYFILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRCOMPANYFILENAME$4);
                }
                target.setStringValue(strCompanyFileName);
            }
        }
        
        /**
         * Sets (as xml) the "strCompanyFileName" element
         */
        public void xsetStrCompanyFileName(org.apache.xmlbeans.XmlString strCompanyFileName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRCOMPANYFILENAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRCOMPANYFILENAME$4);
                }
                target.set(strCompanyFileName);
            }
        }
        
        /**
         * Unsets the "strCompanyFileName" element
         */
        public void unsetStrCompanyFileName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRCOMPANYFILENAME$4, 0);
            }
        }
        
        /**
         * Gets the "qbXMLCountry" element
         */
        public java.lang.String getQbXMLCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLCOUNTRY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "qbXMLCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetQbXMLCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QBXMLCOUNTRY$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "qbXMLCountry" element
         */
        public boolean isSetQbXMLCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QBXMLCOUNTRY$6) != 0;
            }
        }
        
        /**
         * Sets the "qbXMLCountry" element
         */
        public void setQbXMLCountry(java.lang.String qbXMLCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLCOUNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QBXMLCOUNTRY$6);
                }
                target.setStringValue(qbXMLCountry);
            }
        }
        
        /**
         * Sets (as xml) the "qbXMLCountry" element
         */
        public void xsetQbXMLCountry(org.apache.xmlbeans.XmlString qbXMLCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QBXMLCOUNTRY$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QBXMLCOUNTRY$6);
                }
                target.set(qbXMLCountry);
            }
        }
        
        /**
         * Unsets the "qbXMLCountry" element
         */
        public void unsetQbXMLCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QBXMLCOUNTRY$6, 0);
            }
        }
        
        /**
         * Gets the "qbXMLMajorVers" element
         */
        public int getQbXMLMajorVers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLMAJORVERS$8, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "qbXMLMajorVers" element
         */
        public org.apache.xmlbeans.XmlInt xgetQbXMLMajorVers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QBXMLMAJORVERS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "qbXMLMajorVers" element
         */
        public void setQbXMLMajorVers(int qbXMLMajorVers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLMAJORVERS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QBXMLMAJORVERS$8);
                }
                target.setIntValue(qbXMLMajorVers);
            }
        }
        
        /**
         * Sets (as xml) the "qbXMLMajorVers" element
         */
        public void xsetQbXMLMajorVers(org.apache.xmlbeans.XmlInt qbXMLMajorVers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QBXMLMAJORVERS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QBXMLMAJORVERS$8);
                }
                target.set(qbXMLMajorVers);
            }
        }
        
        /**
         * Gets the "qbXMLMinorVers" element
         */
        public int getQbXMLMinorVers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLMINORVERS$10, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "qbXMLMinorVers" element
         */
        public org.apache.xmlbeans.XmlInt xgetQbXMLMinorVers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QBXMLMINORVERS$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "qbXMLMinorVers" element
         */
        public void setQbXMLMinorVers(int qbXMLMinorVers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QBXMLMINORVERS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QBXMLMINORVERS$10);
                }
                target.setIntValue(qbXMLMinorVers);
            }
        }
        
        /**
         * Sets (as xml) the "qbXMLMinorVers" element
         */
        public void xsetQbXMLMinorVers(org.apache.xmlbeans.XmlInt qbXMLMinorVers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QBXMLMINORVERS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QBXMLMINORVERS$10);
                }
                target.set(qbXMLMinorVers);
            }
        }
    }
}
