/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContinueAsNewWorkflowExecutionFailedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContinueAsNewWorkflowExecutionFailedEventAttributesMarshaller {

    private static final MarshallingInfo<String> CAUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("cause").build();
    private static final MarshallingInfo<Long> DECISIONTASKCOMPLETEDEVENTID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decisionTaskCompletedEventId").build();

    private static final ContinueAsNewWorkflowExecutionFailedEventAttributesMarshaller instance = new ContinueAsNewWorkflowExecutionFailedEventAttributesMarshaller();

    public static ContinueAsNewWorkflowExecutionFailedEventAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes,
            ProtocolMarshaller protocolMarshaller) {

        if (continueAsNewWorkflowExecutionFailedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionFailedEventAttributes.getCause(), CAUSE_BINDING);
            protocolMarshaller.marshall(continueAsNewWorkflowExecutionFailedEventAttributes.getDecisionTaskCompletedEventId(),
                    DECISIONTASKCOMPLETEDEVENTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
