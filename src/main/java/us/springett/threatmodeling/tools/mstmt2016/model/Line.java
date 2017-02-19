package us.springett.threatmodeling.tools.mstmt2016.model;

/*
 * This file is part of the ThreatModeling SDK.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "KeyValueOfguidanyType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
public class Line {

    private String key;
    private Border.Value value;

    public String getKey() {
        return key;
    }

    @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public void setKey(String key) {
        this.key = key;
    }

    public Border.Value getValue() {
        return value;
    }

    @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays")
    public void setValue(Border.Value value) {
        this.value = value;
    }

}

