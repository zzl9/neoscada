/*******************************************************************************
 * Copyright (c) 2010, 2012 TH4 SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     TH4 SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.ae.server.common.monitor;

import java.util.List;
import java.util.Set;

import org.eclipse.scada.ae.data.MonitorStatusInformation;

public interface MonitorQueryListener
{
    public void dataChanged ( final List<MonitorStatusInformation> addedOrUpdated, final Set<String> removed, boolean full );
}
