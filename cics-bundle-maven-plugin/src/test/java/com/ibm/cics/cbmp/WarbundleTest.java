package com.ibm.cics.cbmp;

/*-
 * #%L
 * CICS Bundle Maven Plugin
 * %%
 * Copyright (C) 2019 IBM Corp.
 * %%
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * #L%
 */

public class WarbundleTest extends AbstractNameableJavaBundlePartBindingTestCase {

	@Override
	protected AbstractNameableJavaBundlePartBinding createBinding() {
		return new Warbundle();
	}

	@Override
	protected String getRootElementName() {
		return "warbundle";
	}

}
