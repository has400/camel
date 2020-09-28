/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.braintree;

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
public class BraintreeEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("apiName", org.apache.camel.component.braintree.internal.BraintreeApiName.class);
        map.put("methodName", java.lang.String.class);
        map.put("environment", java.lang.String.class);
        map.put("inBody", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("merchantId", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("httpReadTimeout", java.lang.Integer.class);
        map.put("synchronous", boolean.class);
        map.put("httpLogLevel", java.lang.String.class);
        map.put("httpLogName", java.lang.String.class);
        map.put("logHandlerEnabled", boolean.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("accessToken", java.lang.String.class);
        map.put("privateKey", java.lang.String.class);
        map.put("publicKey", java.lang.String.class);
        map.put("amount", java.math.BigDecimal.class);
        map.put("associationFilterId", java.lang.String.class);
        map.put("challenge", java.lang.String.class);
        map.put("cloneRequest", com.braintreegateway.TransactionCloneRequest.class);
        map.put("content", java.lang.String.class);
        map.put("currencyRequest", com.braintreegateway.MerchantAccountCreateForCurrencyRequest.class);
        map.put("customerId", java.lang.String.class);
        map.put("deleteRequest", com.braintreegateway.PaymentMethodDeleteRequest.class);
        map.put("disputeId", java.lang.String.class);
        map.put("documentId", java.lang.String.class);
        map.put("evidenceId", java.lang.String.class);
        map.put("fileEvidenceRequest", com.braintreegateway.FileEvidenceRequest.class);
        map.put("grantRequest", com.braintreegateway.PaymentMethodGrantRequest.class);
        map.put("groupByCustomField", java.lang.String.class);
        map.put("id", java.lang.String.class);
        map.put("page", java.lang.Integer.class);
        map.put("payload", java.lang.String.class);
        map.put("paymentMethodNonce", java.lang.String.class);
        map.put("paymentMethodToken", java.lang.String.class);
        map.put("query", com.braintreegateway.CreditCardVerificationSearchRequest.class);
        map.put("refundRequest", com.braintreegateway.TransactionRefundRequest.class);
        map.put("request", com.braintreegateway.AddressRequest.class);
        map.put("searchRequest", com.braintreegateway.SubscriptionSearchRequest.class);
        map.put("settlementDate", java.util.Calendar.class);
        map.put("signature", java.lang.String.class);
        map.put("submitForSettlement", java.lang.Boolean.class);
        map.put("subscriptionId", java.lang.String.class);
        map.put("textEvidenceRequest", com.braintreegateway.TextEvidenceRequest.class);
        map.put("token", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BraintreeEndpoint target = (BraintreeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "environment": target.getConfiguration().setEnvironment(property(camelContext, java.lang.String.class, value)); return true;
        case "httploglevel":
        case "httpLogLevel": target.getConfiguration().setHttpLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "httplogname":
        case "httpLogName": target.getConfiguration().setHttpLogName(property(camelContext, java.lang.String.class, value)); return true;
        case "httpreadtimeout":
        case "httpReadTimeout": target.getConfiguration().setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loghandlerenabled":
        case "logHandlerEnabled": target.getConfiguration().setLogHandlerEnabled(property(camelContext, boolean.class, value)); return true;
        case "merchantid":
        case "merchantId": target.getConfiguration().setMerchantId(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.getConfiguration().setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "publickey":
        case "publicKey": target.getConfiguration().setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BraintreeEndpoint target = (BraintreeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getConfiguration().getAccessToken();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "environment": return target.getConfiguration().getEnvironment();
        case "httploglevel":
        case "httpLogLevel": return target.getConfiguration().getHttpLogLevel();
        case "httplogname":
        case "httpLogName": return target.getConfiguration().getHttpLogName();
        case "httpreadtimeout":
        case "httpReadTimeout": return target.getConfiguration().getHttpReadTimeout();
        case "inbody":
        case "inBody": return target.getInBody();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loghandlerenabled":
        case "logHandlerEnabled": return target.getConfiguration().isLogHandlerEnabled();
        case "merchantid":
        case "merchantId": return target.getConfiguration().getMerchantId();
        case "privatekey":
        case "privateKey": return target.getConfiguration().getPrivateKey();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "publickey":
        case "publicKey": return target.getConfiguration().getPublicKey();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}
