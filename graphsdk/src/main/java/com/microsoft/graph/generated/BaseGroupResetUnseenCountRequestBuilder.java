// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group Reset Unseen Count Request Builder.
 */
public class BaseGroupResetUnseenCountRequestBuilder extends BaseRequestBuilder {


    /**
     * The request builder for this GroupResetUnseenCount
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseGroupResetUnseenCountRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the IGroupResetUnseenCountRequest
     *
     * @return The IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupResetUnseenCountRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IGroupResetUnseenCountRequest instance
     */
    public IGroupResetUnseenCountRequest buildRequest(final List<Option> options) {
        return new GroupResetUnseenCountRequest(getRequestUrl(), getClient(), options);
    }
}
