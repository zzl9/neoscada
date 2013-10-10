/*******************************************************************************
 * Copyright (c) 2010, 2013 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     Jens Reimann - implement security callback system
 *******************************************************************************/
package org.eclipse.scada.ca.data.message;

public class GetFactoryWithDataRequest implements java.io.Serializable, org.eclipse.scada.core.data.RequestMessage
{
    private static final long serialVersionUID = 1L;

    public GetFactoryWithDataRequest ( final org.eclipse.scada.core.data.Request request, final String factoryId )
    {
        this.request = request;
        this.factoryId = factoryId;
    }

    private final org.eclipse.scada.core.data.Request request;

    @Override
    public org.eclipse.scada.core.data.Request getRequest ()
    {
        return this.request;
    }

    private final String factoryId;

    public String getFactoryId ()
    {
        return this.factoryId;
    }

    @Override
    public String toString ()
    {
        return "[GetFactoryWithDataRequest - " + "request: " + this.request + ", " + "factoryId: " + this.factoryId + "]";
    }
}
