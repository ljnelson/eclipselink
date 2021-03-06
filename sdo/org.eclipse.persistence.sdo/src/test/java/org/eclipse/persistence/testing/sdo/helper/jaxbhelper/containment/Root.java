/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
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
//     bdoughan - Jan 27/2009 - 1.1 - Initial implementation
package org.eclipse.persistence.testing.sdo.helper.jaxbhelper.containment;

import java.util.Collection;

public class Root {
    public Child childProperty;
    public Collection<Child> childCollectionProperty;

    public Child getChildProperty() {
        return childProperty;
    }

    public void setChildProperty(Child childProperty) {
        this.childProperty = childProperty;
    }

    public Collection<Child> getChildCollectionProperty() {
        return childCollectionProperty;
    }

    public void setChildCollectionProperty(Collection<Child> childCollectionProperty) {
        this.childCollectionProperty = childCollectionProperty;
    }

}
