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
package org.eclipse.scada.protocol.ngp.model.Protocol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.scada.protocol.ngp.model.Protocol.ProtocolPackage;
import org.eclipse.scada.protocol.ngp.model.Protocol.StringAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StringAttributeImpl extends AttributeImpl implements StringAttribute
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringAttributeImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ProtocolPackage.Literals.STRING_ATTRIBUTE;
    }

} //StringAttributeImpl
