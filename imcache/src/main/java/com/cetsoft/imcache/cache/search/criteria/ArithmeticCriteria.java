/*
* Copyright (C) 2013 Cetsoft, http://www.cetsoft.com
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Library General Public
* License as published by the Free Software Foundation; either
* version 2 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Library General Public License for more details.
*
* You should have received a copy of the GNU Library General Public
* License along with this library; if not, write to the Free
* Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
* 
* Author : Yusuf Aytas
* Date   : Nov 8, 2013
*/
package com.cetsoft.imcache.cache.search.criteria;

import java.util.List;

import com.cetsoft.imcache.cache.search.index.CacheIndex;

/**
 * The Class ArithmeticCriteria is used for arithmetic operations.
 */
public abstract class ArithmeticCriteria extends LogicalCriteria{

	/** The attribute name. */
	private String attributeName;
	
	/** The expected value. */
	protected Object value;
	
	/**
	 * Instantiates a new equals to criteria.
	 *
	 * @param attributeName the attribute name
	 * @param value the expected value
	 */
	public ArithmeticCriteria(String attributeName, Object value){
		this.attributeName = attributeName;
		this.value = value;
	}
	
	/**
	 * Gets the attribute name.
	 *
	 * @return the attribute name
	 */
	public String getAttributeName() {
		return attributeName;
	}
	
	/**
	 * Meets the given criteria.
	 *
	 * @param cacheIndex the cache index
	 * @return the list
	 */
	public abstract List<Object> meets(CacheIndex cacheIndex);

}
