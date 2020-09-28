/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transform messages using a Mustache template.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MustacheEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Mustache component.
     */
    public interface MustacheEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMustacheEndpointBuilder advanced() {
            return (AdvancedMustacheEndpointBuilder) this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder allowContextMapAll(
                boolean allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Sets whether the context map should allow access to all details. By
         * default only the message body and headers can be accessed. This
         * option can be enabled for full access to the current Exchange and
         * CamelContext. Doing so impose a potential security risk as this opens
         * access to the full power of CamelContext API.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder allowContextMapAll(
                String allowContextMapAll) {
            doSetProperty("allowContextMapAll", allowContextMapAll);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder allowTemplateFromHeader(
                boolean allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Whether to allow to use resource template from header or not (default
         * false). Enabling this allows to specify dynamic templates via message
         * header. However this can be seen as a potential security
         * vulnerability if the header is coming from a malicious user, so use
         * this with care.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder allowTemplateFromHeader(
                String allowTemplateFromHeader) {
            doSetProperty("allowTemplateFromHeader", allowTemplateFromHeader);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Character encoding of the resource content.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MustacheEndpointBuilder encoding(String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * Characters used to mark template code end.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: }}
         * Group: producer
         */
        default MustacheEndpointBuilder endDelimiter(String endDelimiter) {
            doSetProperty("endDelimiter", endDelimiter);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MustacheEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Characters used to mark template code beginning.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: {{
         * Group: producer
         */
        default MustacheEndpointBuilder startDelimiter(String startDelimiter) {
            doSetProperty("startDelimiter", startDelimiter);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Mustache component.
     */
    public interface AdvancedMustacheEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MustacheEndpointBuilder basic() {
            return (MustacheEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMustacheEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMustacheEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMustacheEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMustacheEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface MustacheBuilders {
        /**
         * Mustache (camel-mustache)
         * Transform messages using a Mustache template.
         * 
         * Category: transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-mustache
         * 
         * Syntax: <code>mustache:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param path resourceUri
         */
        default MustacheEndpointBuilder mustache(String path) {
            return MustacheEndpointBuilderFactory.endpointBuilder("mustache", path);
        }
        /**
         * Mustache (camel-mustache)
         * Transform messages using a Mustache template.
         * 
         * Category: transformation
         * Since: 2.12
         * Maven coordinates: org.apache.camel:camel-mustache
         * 
         * Syntax: <code>mustache:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the resource. You can prefix with: classpath, file, http,
         * ref, or bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         */
        default MustacheEndpointBuilder mustache(
                String componentName,
                String path) {
            return MustacheEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static MustacheEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class MustacheEndpointBuilderImpl extends AbstractEndpointBuilder implements MustacheEndpointBuilder, AdvancedMustacheEndpointBuilder {
            public MustacheEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new MustacheEndpointBuilderImpl(path);
    }
}