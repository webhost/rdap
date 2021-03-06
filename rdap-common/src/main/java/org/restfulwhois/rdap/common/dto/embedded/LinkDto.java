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
package org.restfulwhois.rdap.common.dto.embedded;

import java.util.List;

import org.restfulwhois.rdap.common.dto.BaseDto;

/**
 * LinkDto.
 * 
 * @author jiashuo.
 * 
 */
public class LinkDto extends BaseDto {
    /**
     * link value.
     */
    private String value;
    /**
     * rel.
     */
    private String rel;
    /**
     * href.
     */
    private String href;
    /**
     * type.
     */
    private String type;
    /**
     * hreflang.
     */
    private List<String> hreflang;
    /**
     * title of link.
     */
    private String title;
    /**
     * media of link.
     */
    private String media;

    /**
     * get value.
     * 
     * @return value.
     */
    public String getValue() {
        return value;
    }

    /**
     * set value.
     * 
     * @param value
     *            value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get rel.
     * 
     * @return rel.
     */
    public String getRel() {
        return rel;
    }

    /**
     * set rel.
     * 
     * @param rel
     *            rel.
     */
    public void setRel(String rel) {
        this.rel = rel;
    }

    /**
     * get href.
     * 
     * @return href.
     */
    public String getHref() {
        return href;
    }

    /**
     * set href.
     * 
     * @param href
     *            href.
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * get type.
     * 
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * set type.
     * 
     * @param type
     *            type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get hreflang.
     * 
     * @return hreflang.
     */
    public List<String> getHreflang() {
        return hreflang;
    }

    /**
     * set hreflang.
     * 
     * @param hreflang
     *            hreflang.
     */
    public void setHreflang(List<String> hreflang) {
        this.hreflang = hreflang;
    }

    /**
     * get title.
     * 
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * set title.
     * 
     * @param title
     *            title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get media.
     * 
     * @return media.
     */
    public String getMedia() {
        return media;
    }

    /**
     * set media.
     * 
     * @param media
     *            media.
     */
    public void setMedia(String media) {
        this.media = media;
    }

}
