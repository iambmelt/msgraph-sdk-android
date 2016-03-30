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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact.
 */
public class BaseContact extends OutlookItem implements IJsonBackedObject {


	public BaseContact(){
		oDataType = "microsoft.graph.contact";
	}
	
    /**
     * The Parent Folder Id.
     */
    @SerializedName("parentFolderId")
    public String parentFolderId;

    /**
     * The Birthday.
     */
    @SerializedName("birthday")
    public java.util.Calendar birthday;

    /**
     * The File As.
     */
    @SerializedName("fileAs")
    public String fileAs;

    /**
     * The Display Name.
     */
    @SerializedName("displayName")
    public String displayName;

    /**
     * The Given Name.
     */
    @SerializedName("givenName")
    public String givenName;

    /**
     * The Initials.
     */
    @SerializedName("initials")
    public String initials;

    /**
     * The Middle Name.
     */
    @SerializedName("middleName")
    public String middleName;

    /**
     * The Nick Name.
     */
    @SerializedName("nickName")
    public String nickName;

    /**
     * The Surname.
     */
    @SerializedName("surname")
    public String surname;

    /**
     * The Title.
     */
    @SerializedName("title")
    public String title;

    /**
     * The Yomi Given Name.
     */
    @SerializedName("yomiGivenName")
    public String yomiGivenName;

    /**
     * The Yomi Surname.
     */
    @SerializedName("yomiSurname")
    public String yomiSurname;

    /**
     * The Yomi Company Name.
     */
    @SerializedName("yomiCompanyName")
    public String yomiCompanyName;

    /**
     * The Generation.
     */
    @SerializedName("generation")
    public String generation;

    /**
     * The Email Addresses.
     */
    @SerializedName("emailAddresses")
    public List<EmailAddress> emailAddresses;

    /**
     * The Im Addresses.
     */
    @SerializedName("imAddresses")
    public List<String> imAddresses;

    /**
     * The Job Title.
     */
    @SerializedName("jobTitle")
    public String jobTitle;

    /**
     * The Company Name.
     */
    @SerializedName("companyName")
    public String companyName;

    /**
     * The Department.
     */
    @SerializedName("department")
    public String department;

    /**
     * The Office Location.
     */
    @SerializedName("officeLocation")
    public String officeLocation;

    /**
     * The Profession.
     */
    @SerializedName("profession")
    public String profession;

    /**
     * The Business Home Page.
     */
    @SerializedName("businessHomePage")
    public String businessHomePage;

    /**
     * The Assistant Name.
     */
    @SerializedName("assistantName")
    public String assistantName;

    /**
     * The Manager.
     */
    @SerializedName("manager")
    public String manager;

    /**
     * The Home Phones.
     */
    @SerializedName("homePhones")
    public List<String> homePhones;

    /**
     * The Mobile Phone.
     */
    @SerializedName("mobilePhone")
    public String mobilePhone;

    /**
     * The Business Phones.
     */
    @SerializedName("businessPhones")
    public List<String> businessPhones;

    /**
     * The Home Address.
     */
    @SerializedName("homeAddress")
    public PhysicalAddress homeAddress;

    /**
     * The Business Address.
     */
    @SerializedName("businessAddress")
    public PhysicalAddress businessAddress;

    /**
     * The Other Address.
     */
    @SerializedName("otherAddress")
    public PhysicalAddress otherAddress;

    /**
     * The Spouse Name.
     */
    @SerializedName("spouseName")
    public String spouseName;

    /**
     * The Personal Notes.
     */
    @SerializedName("personalNotes")
    public String personalNotes;

    /**
     * The Children.
     */
    @SerializedName("children")
    public List<String> children;

    /**
     * The Photo.
     */
    @SerializedName("photo")
    public ProfilePhoto photo;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}