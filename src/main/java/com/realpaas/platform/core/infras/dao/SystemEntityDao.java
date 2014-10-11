/**
 * Copyright (c) 2012, RealPaaS Technologies, Ltd. All rights reserved.
 */
package com.realpaas.platform.core.infras.dao;

import com.realpaas.platform.core.infras.dataobject.SystemEntity;
import com.realpaas.platform.framework.dao.GenericDao;
import com.realpaas.platform.ssos.ext.dao.DaoDeletingAll;
import com.realpaas.platform.ssos.ext.dao.DaoLoadingByCode;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * <pre>
 * 
 * </pre>
 * 
 * <p><dt><b>Immutability:</b></dt> 
 * <dd>
 * 	<b>IMMUTABLE</b> and <b>MUTABLE</b>
 * </dd>
 * 
 * <p><dt><b>Thread Safety:</b></dt> 
 * <dd>
 * 	<b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be used on multi-thread occasion.)
 * </dd>
 * 
 * <p><dt><b>Serialization:</b></dt>
 * <dd>
 * 	<b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no need to be serializable.)
 * </dd>
 * 
 * <p><dt><b>Design Patterns:</b></dt>
 * <dd>
 * 	
 * </dd>
 * 
 * <p><dt><b>Change History:</b></dt>
 * <dd>
 * 	Date		Author		Action
 * </dd>
 * <dd>
 * 	Aug 5, 2012	henry leu	Create the class
 * </dd>
 * 
 * </dl>
 * @author	henry leu Email/MSN: hongli_leu@126.com
 */
public interface SystemEntityDao
    extends
        DaoLoadingByCode<SystemEntity>,
        DaoDeletingAll,
        GenericDao<SystemEntity>{
}