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
package org.eclipse.scada.ae.data.message;

public class UnsubscribeMonitorPool implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    public UnsubscribeMonitorPool ( final String monitorPoolId )
    {
        this.monitorPoolId = monitorPoolId;
    }

    private final String monitorPoolId;

    public String getMonitorPoolId ()
    {
        return this.monitorPoolId;
    }

    @Override
    public String toString ()
    {
        return "[UnsubscribeMonitorPool - " + "monitorPoolId: " + this.monitorPoolId + "]";
    }
}
