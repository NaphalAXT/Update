/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.test.data.datamodel;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.AbstractTest.CI;

/**
 * Used to define a binary attribute, create them and test the result.
 *
 * @author The MxUpdate Team
 */
public class AttributeBinaryData
    extends AbstractAttributeData<AttributeBinaryData>
{
    /**
     * Initialize this binary attribute with given {@code _name}.
     *
     * @param _test     related test implementation (where this attribute is
     *                  defined)
     * @param _name     name of the binary attribute
     */
    public AttributeBinaryData(final AbstractTest _test,
                                final String _name)
    {
        super(_test, CI.DM_ATTRIBUTE_BINARY, _name, "binary");
    }
}