/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.cast.java.ssa;

import com.ibm.wala.cast.ir.ssa.AstInstructionFactory;
import com.ibm.wala.cast.ir.ssa.AstLexicalAccess.Access;
import com.ibm.wala.classLoader.CallSiteReference;
import com.ibm.wala.classLoader.NewSiteReference;
import com.ibm.wala.types.TypeReference;

public interface AstJavaInstructionFactory extends AstInstructionFactory {

  AstJavaInvokeInstruction JavaInvokeInstruction(int result, int[] params, int exception, CallSiteReference site);
  
  AstJavaInvokeInstruction JavaInvokeInstruction(int[] params, int exception, CallSiteReference site);
  
  AstJavaInvokeInstruction JavaInvokeInstruction(int results[], int[] params, int exception, CallSiteReference site, Access[] lexicalReads, Access[] lexicalWrites);
 
  EnclosingObjectReference EnclosingObjectReference(int lval, TypeReference type);
  
  AstJavaNewEnclosingInstruction JavaNewEnclosingInstruction(int result, NewSiteReference site, int enclosing);
  
}
