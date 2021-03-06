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
package org.eclipse.scada.core.data;

public class CallbackResponse implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    public CallbackResponse ( final boolean canceled, final java.util.Map<String, String> attributes )
    {
        this.canceled = canceled;
        this.attributes = attributes;
    }

    private final boolean canceled;

    public boolean isCanceled ()
    {
        return this.canceled;
    }

    private final java.util.Map<String, String> attributes;

    public java.util.Map<String, String> getAttributes ()
    {
        return this.attributes;
    }

    @Override
    public String toString ()
    {
        return "[CallbackResponse - " + "canceled: " + this.canceled + ", " + "attributes: " + this.attributes + "]";
    }
}
