// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201806.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Manages criteria negatives for customer.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerNegativeCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerNegativeCriterionServiceInterface {


    /**
     * 
     *         Returns a list of CustomerNegativeCriterion that meets the selector criteria
     *         
     *         @param selector filters the criteria returned
     *         @return The list of CustomerNegativeCriterion
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfacegetResponse")
    public CustomerNegativeCriterionPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, removes negative criteria for a customer. These negative criteria apply to all
     *         campaigns of the customer.
     *         
     *         @param operations A list of operations to apply
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfacemutateResponse")
    public CustomerNegativeCriterionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        List<CustomerNegativeCriterionOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of CustomerNegativeCriterion that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of CustomerNegativeCriterion.
     *         @throws ApiException
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806", className = "com.google.api.ads.adwords.jaxws.v201806.cm.CustomerNegativeCriterionServiceInterfacequeryResponse")
    public CustomerNegativeCriterionPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201806")
        String query)
        throws ApiException_Exception
    ;

}
