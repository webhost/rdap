/*
 * Copyright (c) 2012 - 2015, Internet Corporation for Assigned Names and
 * Numbers (ICANN) and China Internet Network Information Center (CNNIC)
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 * * Neither the name of the ICANN, CNNIC nor the names of its contributors may
 *  be used to endorse or promote products derived from this software without
 *  specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL ICANN OR CNNIC BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */
package org.restfulwhois.rdap.common.validation;

import org.springframework.http.HttpStatus;

/**
 * ServiceErrorCode.
 * 
 * @author jiashuo
 * 
 */
public enum ServiceErrorCode {

    /**
     * ERROR_4001.
     */
    ERROR_4001(4001,
            "Request data is not valid JSON, or has invalid date type",
            HttpStatus.BAD_REQUEST), 
    /**
     * ERROR_4002:Property can't be empty
     */
    ERROR_4002(4002,
            "Property can't be empty:%s", HttpStatus.BAD_REQUEST),
    /**
     * ERROR_4003:Property exceed max length
     */
    ERROR_4003(4003, "Property '%s' exceed max length:%s",
            HttpStatus.BAD_REQUEST), 
    /**
     * ERROR_4007:Property must be valid date.
     */
    ERROR_4007(4007,
            "Property must be valid date:%s", HttpStatus.BAD_REQUEST),
    /**
     * ERROR_4008:Property value is not valid
     */
    ERROR_4008(4008, "Property value is not valid:%s", HttpStatus.BAD_REQUEST),
    /**
     * ERROR_4009:Unrecognized request URI
     */
    ERROR_4009(4009, "Unrecognized request URI", HttpStatus.BAD_REQUEST),
    /**
     * ERROR_40010.
     */
    ERROR_40010(40010, "Property '%s' value must between [%s,%s]",
            HttpStatus.BAD_REQUEST),
    /**
     * ERROR_4031:Forbidden.
     */
    ERROR_4031(4031,
                    "Forbidden", HttpStatus.FORBIDDEN),
    /**
     * ERROR_4041:Object not found with handle.
     */
    ERROR_4041(4041,
            "Object not found with handle:%s", HttpStatus.NOT_FOUND),
    /**
     * ERROR_4091
     */
    ERROR_4091(4091, "Object already exist for handle:%s",
            HttpStatus.CONFLICT);

    /**
     * code
     */
    private final int code;

    /**
     * message.
     */
    private final String message;

    /**
     * httpStatus.
     */
    private HttpStatus httpStatus;

    /**
     * constructor
     * @param value
     *  value.
     * @param message
     *     message.
     * @param httpStatus
     *         httpStatus. 
     */
    private ServiceErrorCode(int value, String message, HttpStatus httpStatus) {
        this.code = value;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    /**
     * format message.
     * @param serviceErrorCode
     *        serviceErrorCode.
     * @param errorMessageParams
     *          errorMessageParams.
     * @return string
     */
    public static String formatMessage(ServiceErrorCode serviceErrorCode,
            Object[] errorMessageParams) {
        return String.format(serviceErrorCode.getMessage(), errorMessageParams);
    }

    /**
     * get statusCode.
     * @return httpStatus.
     */
    public HttpStatus getStatusCode() {
        return httpStatus;
    }

    /**
     * set statusCode
     * @param statusCode
     *         statusCode.
     */
    public void setStatusCode(HttpStatus statusCode) {
        this.httpStatus = statusCode;
    }

    /**
     * get message.
     * @return message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * get code.
     * @return code.
     */
    public int getCode() {
        return code;
    }

    /**
     * Return a string representation of this status code.
     * @return string.
     */
    @Override
    public String toString() {
        return Integer.toString(code);
    }

    /**
     * Return the enum constant of this type with the specified numeric code.
     * 
     * @param statusCode
     *            the numeric code of the enum to be returned
     * @return the enum constant with the specified numeric code
     * 
     */
    public static ServiceErrorCode valueOf(int statusCode) {
        for (ServiceErrorCode status : values()) {
            if (status.code == statusCode) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for ["
                + statusCode + "]");
    }

}
