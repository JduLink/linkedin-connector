/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package com.google.code.linkedinapi.schema.xpp;

import com.google.code.linkedinapi.schema.Education;
import com.google.code.linkedinapi.schema.EndDate;
import com.google.code.linkedinapi.schema.StartDate;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;

public class EducationImpl
        extends BaseSchemaEntity
        implements Education {

    /**
     *
     */
    private static final long serialVersionUID = -379013425062157845L;
    protected String id;
    protected String schoolName;
    protected String degree;
    protected String notes;
    protected String activities;
    protected String fieldOfStudy;

    protected StartDateImpl startDate;
    protected EndDateImpl endDate;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String value) {
        this.degree = value;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String value) {
        this.activities = value;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String value) {
        this.fieldOfStudy = value;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(StartDate value) {
        this.startDate = ((StartDateImpl) value);
    }

    public EndDate getEndDate() {
        return endDate;
    }

    public void setEndDate(EndDate value) {
        this.endDate = ((EndDateImpl) value);
    }

    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();

            if (name.equals("id")) {
                setId(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("school-name")) {
                setSchoolName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("notes")) {
                setNotes(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("activities")) {
                setActivities(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("field-of-study")) {
                setFieldOfStudy(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("degree")) {
                setDegree(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("start-date")) {
                StartDateImpl startDate = new StartDateImpl();
                startDate.init(parser);
                setStartDate(startDate);
            } else if (name.equals("end-date")) {
                EndDateImpl endDate = new EndDateImpl();
                endDate.init(parser);
                setEndDate(endDate);
            } else {
                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }

    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
        XmlSerializer element = serializer.startTag(null, "education");
        XppUtils.setElementValueToNode(element, "id", getId());
        XppUtils.setElementValueToNode(element, "school-name", getSchoolName());
        XppUtils.setElementValueToNode(element, "notes", getNotes());
        XppUtils.setElementValueToNode(element, "activities", getActivities());
        XppUtils.setElementValueToNode(element, "field-of-study", getFieldOfStudy());
        XppUtils.setElementValueToNode(element, "degree", getDegree());
        if (getStartDate() != null) {
            ((StartDateImpl) getStartDate()).toXml(serializer);
        }
        if (getEndDate() != null) {
            ((EndDateImpl) getEndDate()).toXml(serializer);
        }
        serializer.endTag(null, "education");
    }
}
