/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package com.google.code.linkedinapi.schema;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}web-url"/>
 *         &lt;element ref="{}author"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public interface Answer
        extends SchemaEntity {


    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    String getId();

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setId(String value);

    /**
     * Gets the value of the webUrl property.
     *
     * @return possible object is
     *         {@link String }
     */
    String getWebUrl();

    /**
     * Sets the value of the webUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    void setWebUrl(String value);

    /**
     * Gets the value of the author property.
     *
     * @return possible object is
     *         {@link Author }
     */
    Author getAuthor();

    /**
     * Sets the value of the author property.
     *
     * @param value allowed object is
     *              {@link Author }
     */
    void setAuthor(Author value);

}
