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

package org.mxupdate.test.update.datamodel;

import org.mxupdate.test.update.AbstractParserTest;
import org.mxupdate.update.datamodel.Type_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Tests the {@link Type_mxJPO type CI} parser.
 *
 * @author The MxUpdate Team
 */
@Test()
public class TypeCI_ParserTest
    extends AbstractParserTest<Type_mxJPO>
{
    @Override()
    @DataProvider(name = "data")
    public Object[][] getData()
    {
        return new Object[][]
        {
            {"1) simple",
                "",
                "description \"\" !hidden"},
            // description
            {"2a) description",
                "",
                "description \"abc def\" !hidden"},
            {"2b) description not defined",
                "description \"\" !hidden",
                "!hidden"},
            // abstract flag
            {"3a) not abstract",
                "description \"\" !hidden",
                "description \"\" !abstract !hidden"},
            {"3b) abstract",
                "",
                "description \"\" abstract !hidden"},
            // derived
            {"4a) derived",
                "",
                "description \"\" derived \"123\" !hidden"},
            {"4b) not derived (with empty string)",
                "description \"\" !hidden",
                "description \"\" derived \"\" !hidden"},
            // hidden flag
            {"5a) hidden",
                "",
                "description \"\" hidden"},
            {"5b) not hidden (not defined)",
                "description \"\" !hidden",
                "description \"\""},
            // action trigger
            {"6a) action trigger with input",
                "",
                "description \"\" !hidden trigger createevent action \"{}\\\"\" input \"{}\\\"\""},
            {"6b) action trigger w/o input",
                "description \"\" !hidden trigger createevent action \"{}\\\"\" input \"\"",
                "description \"\" !hidden trigger createevent action \"{}\\\"\""},
            // check trigger
            {"7a) check trigger with input",
                "",
                "description \"\" !hidden trigger createevent check \"{}\\\"\" input \"{}\\\"\""},
            {"7b) check trigger w/o input",
                "description \"\" !hidden trigger createevent check \"{}\\\"\" input \"\"",
                "description \"\" !hidden trigger createevent check \"{}\\\"\""},
            // override trigger
            {"8a) override trigger with input",
                "",
                "description \"\" !hidden trigger createevent override \"{}\\\"\" input \"{}\\\"\""},
            {"8b) override trigger w/o input",
                "description \"\" !hidden trigger createevent override \"{}\\\"\" input \"\"",
                "description \"\" !hidden trigger createevent override \"{}\\\"\""},
            // methods
            {"9a) method",
                "",
                "description \"\" !hidden method \"111\""},
            {"9b) method name w/o apostrophe",
                "description \"\" !hidden method \"111\"",
                "description \"\" !hidden method 111"},
            {"9c) two method (to check sort)",
                "description \"\" !hidden method \"111\" method \"222\"",
                "description \"\" !hidden method \"222\" method \"111\""},
           // attribute
            {"10a) attribute",
                "",
                "description \"\" !hidden attribute \"111\""},
            {"10b) attribute name w/o apostrophe",
                "description \"\" !hidden attribute \"111\"",
                "description \"\" !hidden attribute 111"},
            {"10c) two attributes (to check sort)",
                "description \"\" !hidden attribute \"111\" attribute \"222\"",
                "description \"\" !hidden attribute \"222\" attribute \"111\""},
            // property
            {"11a) property special characters",
                "",
                "description \"\" !hidden property \"{}\\\"\""},
            {"11b) property and value special characters",
                "",
                "description \"\" !hidden property \"{}\\\"\" value \"{}\\\"\""},
            {"11c) property link special characters",
                "",
                "description \"\" !hidden property \"{}\\\"\" to type \"{}\\\"\""},
            {"11d) property link and value special characters",
                "",
                "description \"\" !hidden property \"{}\\\"\" to type \"{}\\\"\" value \"{}\\\"\""},
        };
    }

    @Override()
    protected Type_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                       final String _name)
    {
        return new Type_mxJPO(_paramCache.getMapping().getTypeDef("Type"), _name);
    }
}
