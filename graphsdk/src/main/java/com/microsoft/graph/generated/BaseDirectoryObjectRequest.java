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
 * The class for the Base Directory Object Request.
 */
public class BaseDirectoryObjectRequest extends EntityRequest implements IBaseDirectoryObjectRequest {

    /**
     * The request for the DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDirectoryObjectRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the DirectoryObject from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getDirectoryObject(final ICallback<DirectoryObject> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryObject from the service
     * @return The DirectoryObject from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryObject getDirectoryObject() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DirectoryObject with a source
     * @param sourceDirectoryObject The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final DirectoryObject sourceDirectoryObject, final ICallback<DirectoryObject> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryObject);
    }

    /**
     * Patches this DirectoryObject with a source
     * @param sourceDirectoryObject The source object with updates
     * @return The updated DirectoryObject
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryObject patch(final DirectoryObject sourceDirectoryObject) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     * @param newDirectoryObject The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final DirectoryObject newDirectoryObject, final ICallback<DirectoryObject> callback) {
        send(HttpMethod.POST, callback, newDirectoryObject);
    }

    /**
     * Creates a DirectoryObject with a new object
     * @param newDirectoryObject The new object to create
     * @return The created DirectoryObject
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DirectoryObject post(final DirectoryObject newDirectoryObject) throws ClientException {
        return send(HttpMethod.POST, newDirectoryObject);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDirectoryObjectRequest select(final String value) {
         getQueryOptions().add(new QueryOption("select", value));
         return (DirectoryObjectRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDirectoryObjectRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("expand", value));
         return (DirectoryObjectRequest)this;
     }
}