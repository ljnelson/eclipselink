/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Denise Smith - 2.6 - initial implementation
package org.eclipse.persistence.oxm.json;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import org.eclipse.persistence.internal.oxm.record.ExtendedResult;
import org.eclipse.persistence.oxm.record.JsonBuilderRecord;


public class JsonArrayBuilderResult extends ExtendedResult{

    private JsonArrayBuilder jsonArrayBuilder;

    public JsonArrayBuilderResult(){
        this.jsonArrayBuilder = Json.createArrayBuilder();
    }

    public JsonArrayBuilderResult(JsonArrayBuilder jsonArrayBuilder){
        this.jsonArrayBuilder = jsonArrayBuilder;
    }

    @Override
    public org.eclipse.persistence.oxm.record.MarshalRecord createRecord() {
         return new JsonBuilderRecord(jsonArrayBuilder);
    }

    public JsonArrayBuilder getJsonArrayBuilder() {
        return jsonArrayBuilder;
    }

}
