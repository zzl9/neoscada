/*******************************************************************************
 * Copyright (c) 2010, 2011 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.da.server.common.chain;

import org.eclipse.scada.core.Variant;

public class VariantBinder implements AttributeBinder
{
    private Variant defaultValue = null;

    private Variant value = null;

    public VariantBinder ( final Variant defaultValue )
    {
        super ();
        this.defaultValue = defaultValue;
    }

    public VariantBinder ()
    {
        super ();
    }

    @Override
    public void bind ( final Variant value ) throws Exception
    {
        this.value = value;
    }

    public Variant getValue ()
    {
        if ( this.value == null )
        {
            return this.defaultValue;
        }
        return this.value;
    }

    @Override
    public Variant getAttributeValue ()
    {
        return getValue ();
    }

}
