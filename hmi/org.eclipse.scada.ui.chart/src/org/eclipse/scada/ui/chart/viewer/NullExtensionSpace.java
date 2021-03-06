/*******************************************************************************
 * Copyright (c) 2012, 2014 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *     IBH SYSTEMS GmbH - bug fixes and extensions
 *******************************************************************************/
package org.eclipse.scada.ui.chart.viewer;

import org.eclipse.swt.widgets.Composite;

public class NullExtensionSpace implements ExtensionSpaceProvider
{
    @Override
    public Composite getExtensionSpace ()
    {
        return null;
    }

    @Override
    public void relayout ()
    {
        // NO-OP
    }

}
