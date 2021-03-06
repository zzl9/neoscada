/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.memory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.memory.TypeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.memory.TypeDefinition#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.scada.configuration.memory.MemoryPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends EObject
{
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.eclipse.scada.configuration.memory.MemoryPackage#getTypeDefinition_Name()
     * @model id="true" required="true"
     * @generated
     */
    String getName ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.memory.TypeDefinition#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName ( String value );

    /**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.memory.Variable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see org.eclipse.scada.configuration.memory.MemoryPackage#getTypeDefinition_Variables()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Variable> getVariables ();

} // TypeDefinition
