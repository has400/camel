/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.as2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AS2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AS2Endpoint target = (AS2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "as2from":
        case "as2From": target.getConfiguration().setAs2From(property(camelContext, java.lang.String.class, value)); return true;
        case "as2messagestructure":
        case "as2MessageStructure": target.getConfiguration().setAs2MessageStructure(property(camelContext, org.apache.camel.component.as2.api.AS2MessageStructure.class, value)); return true;
        case "as2to":
        case "as2To": target.getConfiguration().setAs2To(property(camelContext, java.lang.String.class, value)); return true;
        case "as2version":
        case "as2Version": target.getConfiguration().setAs2Version(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientfqdn":
        case "clientFqdn": target.getConfiguration().setClientFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "compressionalgorithm":
        case "compressionAlgorithm": target.getConfiguration().setCompressionAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class, value)); return true;
        case "decryptingprivatekey":
        case "decryptingPrivateKey": target.getConfiguration().setDecryptingPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "dispositionnotificationto":
        case "dispositionNotificationTo": target.getConfiguration().setDispositionNotificationTo(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetransferencoding":
        case "ediMessageTransferEncoding": target.getConfiguration().setEdiMessageTransferEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "edimessagetype":
        case "ediMessageType": target.getConfiguration().setEdiMessageType(property(camelContext, org.apache.http.entity.ContentType.class, value)); return true;
        case "encryptingalgorithm":
        case "encryptingAlgorithm": target.getConfiguration().setEncryptingAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class, value)); return true;
        case "encryptingcertificatechain":
        case "encryptingCertificateChain": target.getConfiguration().setEncryptingCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "from": target.getConfiguration().setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mdnmessagetemplate":
        case "mdnMessageTemplate": target.getConfiguration().setMdnMessageTemplate(property(camelContext, java.lang.String.class, value)); return true;
        case "requesturi":
        case "requestUri": target.getConfiguration().setRequestUri(property(camelContext, java.lang.String.class, value)); return true;
        case "server": target.getConfiguration().setServer(property(camelContext, java.lang.String.class, value)); return true;
        case "serverfqdn":
        case "serverFqdn": target.getConfiguration().setServerFqdn(property(camelContext, java.lang.String.class, value)); return true;
        case "serverportnumber":
        case "serverPortNumber": target.getConfiguration().setServerPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "signedreceiptmicalgorithms":
        case "signedReceiptMicAlgorithms": target.getConfiguration().setSignedReceiptMicAlgorithms(property(camelContext, java.lang.String[].class, value)); return true;
        case "signingalgorithm":
        case "signingAlgorithm": target.getConfiguration().setSigningAlgorithm(property(camelContext, org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class, value)); return true;
        case "signingcertificatechain":
        case "signingCertificateChain": target.getConfiguration().setSigningCertificateChain(property(camelContext, java.security.cert.Certificate[].class, value)); return true;
        case "signingprivatekey":
        case "signingPrivateKey": target.getConfiguration().setSigningPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "targethostname":
        case "targetHostname": target.getConfiguration().setTargetHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "targetportnumber":
        case "targetPortNumber": target.getConfiguration().setTargetPortNumber(property(camelContext, java.lang.Integer.class, value)); return true;
        case "useragent":
        case "userAgent": target.getConfiguration().setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("as2From", java.lang.String.class);
        answer.put("as2MessageStructure", org.apache.camel.component.as2.api.AS2MessageStructure.class);
        answer.put("as2To", java.lang.String.class);
        answer.put("as2Version", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clientFqdn", java.lang.String.class);
        answer.put("compressionAlgorithm", org.apache.camel.component.as2.api.AS2CompressionAlgorithm.class);
        answer.put("decryptingPrivateKey", java.security.PrivateKey.class);
        answer.put("dispositionNotificationTo", java.lang.String.class);
        answer.put("ediMessageTransferEncoding", java.lang.String.class);
        answer.put("ediMessageType", org.apache.http.entity.ContentType.class);
        answer.put("encryptingAlgorithm", org.apache.camel.component.as2.api.AS2EncryptionAlgorithm.class);
        answer.put("encryptingCertificateChain", java.security.cert.Certificate[].class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("from", java.lang.String.class);
        answer.put("inBody", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("mdnMessageTemplate", java.lang.String.class);
        answer.put("requestUri", java.lang.String.class);
        answer.put("server", java.lang.String.class);
        answer.put("serverFqdn", java.lang.String.class);
        answer.put("serverPortNumber", java.lang.Integer.class);
        answer.put("signedReceiptMicAlgorithms", java.lang.String[].class);
        answer.put("signingAlgorithm", org.apache.camel.component.as2.api.AS2SignatureAlgorithm.class);
        answer.put("signingCertificateChain", java.security.cert.Certificate[].class);
        answer.put("signingPrivateKey", java.security.PrivateKey.class);
        answer.put("subject", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("targetHostname", java.lang.String.class);
        answer.put("targetPortNumber", java.lang.Integer.class);
        answer.put("userAgent", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AS2Endpoint target = (AS2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "as2from":
        case "as2From": return target.getConfiguration().getAs2From();
        case "as2messagestructure":
        case "as2MessageStructure": return target.getConfiguration().getAs2MessageStructure();
        case "as2to":
        case "as2To": return target.getConfiguration().getAs2To();
        case "as2version":
        case "as2Version": return target.getConfiguration().getAs2Version();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientfqdn":
        case "clientFqdn": return target.getConfiguration().getClientFqdn();
        case "compressionalgorithm":
        case "compressionAlgorithm": return target.getConfiguration().getCompressionAlgorithm();
        case "decryptingprivatekey":
        case "decryptingPrivateKey": return target.getConfiguration().getDecryptingPrivateKey();
        case "dispositionnotificationto":
        case "dispositionNotificationTo": return target.getConfiguration().getDispositionNotificationTo();
        case "edimessagetransferencoding":
        case "ediMessageTransferEncoding": return target.getConfiguration().getEdiMessageTransferEncoding();
        case "edimessagetype":
        case "ediMessageType": return target.getConfiguration().getEdiMessageType();
        case "encryptingalgorithm":
        case "encryptingAlgorithm": return target.getConfiguration().getEncryptingAlgorithm();
        case "encryptingcertificatechain":
        case "encryptingCertificateChain": return target.getConfiguration().getEncryptingCertificateChain();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "from": return target.getConfiguration().getFrom();
        case "inbody":
        case "inBody": return target.getInBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mdnmessagetemplate":
        case "mdnMessageTemplate": return target.getConfiguration().getMdnMessageTemplate();
        case "requesturi":
        case "requestUri": return target.getConfiguration().getRequestUri();
        case "server": return target.getConfiguration().getServer();
        case "serverfqdn":
        case "serverFqdn": return target.getConfiguration().getServerFqdn();
        case "serverportnumber":
        case "serverPortNumber": return target.getConfiguration().getServerPortNumber();
        case "signedreceiptmicalgorithms":
        case "signedReceiptMicAlgorithms": return target.getConfiguration().getSignedReceiptMicAlgorithms();
        case "signingalgorithm":
        case "signingAlgorithm": return target.getConfiguration().getSigningAlgorithm();
        case "signingcertificatechain":
        case "signingCertificateChain": return target.getConfiguration().getSigningCertificateChain();
        case "signingprivatekey":
        case "signingPrivateKey": return target.getConfiguration().getSigningPrivateKey();
        case "subject": return target.getConfiguration().getSubject();
        case "synchronous": return target.isSynchronous();
        case "targethostname":
        case "targetHostname": return target.getConfiguration().getTargetHostname();
        case "targetportnumber":
        case "targetPortNumber": return target.getConfiguration().getTargetPortNumber();
        case "useragent":
        case "userAgent": return target.getConfiguration().getUserAgent();
        default: return null;
        }
    }
}

