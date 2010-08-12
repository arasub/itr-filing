
package com.em.itr.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.2.9
 * Wed Aug 11 22:09:10 IST 2010
 * Generated source version: 2.2.9
 * 
 */

public final class ITRServicePort_ITRServiceSoapHttpPort_Client {

    private static final QName SERVICE_NAME = new QName("http://incometaxindiaefiling.gov.in/itrservice/v_1_0", "ITRService");

    private ITRServicePort_ITRServiceSoapHttpPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ITRService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ITRService ss = new ITRService(wsdlURL, SERVICE_NAME);
        ITRServicePort port = ss.getITRServiceSoapHttpPort();  
        
        {
        System.out.println("Invoking submitITR...");
        com.em.itr.webservice.DITWSAuthInfo _submitITR_authInfo = null;
        byte[] _submitITR_itrXMLFile = new byte[0];
        try {
            com.em.itr.webservice.DITWSResponse _submitITR__return = port.submitITR(_submitITR_authInfo, _submitITR_itrXMLFile);
            System.out.println("submitITR.result=" + _submitITR__return);

        } catch (ITRBusinessServiceFaultException_Exception e) { 
            System.out.println("Expected exception: ITRBusinessServiceFaultException has occurred.");
            System.out.println(e.toString());
        } catch (ITRInvalidCertificateFaultException_Exception e) { 
            System.out.println("Expected exception: ITRInvalidCertificateFaultException has occurred.");
            System.out.println(e.toString());
        } catch (ITRServiceFaultException_Exception e) { 
            System.out.println("Expected exception: ITRServiceFaultException has occurred.");
            System.out.println(e.toString());
        } catch (ITRCredentialFaultException_Exception e) { 
            System.out.println("Expected exception: ITRCredentialFaultException has occurred.");
            System.out.println(e.toString());
        } catch (ITRInvalidDocFaultException_Exception e) { 
            System.out.println("Expected exception: ITRInvalidDocFaultException has occurred.");
            System.out.println(e.toString());
        } catch (ITRFaultException_Exception e) { 
            System.out.println("Expected exception: ITRFaultException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
