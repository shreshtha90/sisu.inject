/*******************************************************************************
 * Copyright (c) 2008, 2014 Stuart McCulloch
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch - initial API and implementation
 *******************************************************************************/

package org.eclipse.sisu.peaberry.builders;

import org.eclipse.sisu.peaberry.Peaberry;

/**
 * See {@link Peaberry} for examples of the dynamic service builder API.
 * 
 * @author mcculls@gmail.com (Stuart McCulloch)
 */
public interface ServiceBuilder<T> {

  /**
   * @return single service provider
   */
  ProxyProvider<T> single();

  /**
   * @return multiple service provider
   */
  ProxyProvider<Iterable<T>> multiple();

  /**
   * @return exported service provider
   */
  ExportProvider<T> export();
}
