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

package org.mxupdate.update;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import matrix.util.MatrixException;

import org.mxupdate.mapping.PropertyDef_mxJPO;
import org.mxupdate.typedef.TypeDef_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.ParseException;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO.ValueKeys;
import org.mxupdate.update.util.StringUtil_mxJPO;

/**
 * Abstract class from which must be derived for exporting and importing all
 * administration (business) objects.
 *
 * @author The MxUpdate Team
 */
public abstract class AbstractObject_mxJPO
{
    /** Defines the related type definition enumeration. */
    private final TypeDef_mxJPO typeDef;

    /** MX Name of the administration object. */
    private final String mxName;

    /** Description of the C object. */
    private String description = "";

    /**
     * Initialize the type definition enumeration.
     *
     * @param _typeDef  defines the related type definition enumeration
     * @param _mxName   MX name of the administration object
     */
    protected AbstractObject_mxJPO(final TypeDef_mxJPO _typeDef,
                                   final String _mxName)
    {
        this.typeDef = _typeDef;
        this.mxName = _mxName;
    }

    /**
     * Returns the path where the file is located of this matrix object. The
     * method used the information annotation.
     *
     * @return sub path
     * @see #getTypeDef()
     */
    public String getPath()
    {
        return this.getTypeDef().getFilePath();
    }

    /**
     * Returns the {@link #typeDef type definition} instance.
     *
     * @return type definition enumeration
     */
    public final TypeDef_mxJPO getTypeDef()
    {
        return this.typeDef;
    }

    /**
     * Export given administration (business) object with given name into given
     * path. The name of the file where is written through is evaluated within
     * this export method.
     *
     * @param _paramCache       parameter cache
     * @param _path             path to write through (if required also
     *                          including depending file path defined from the
     *                          information annotation)
     * @throws MatrixException  if some MQL statement failed
     * @throws ParseException   if the XML export of the object could not
     *                          parsed (for admin objects)
     * @throws IOException      if the TCL update code could not be written
     */
    public void export(final ParameterCache_mxJPO _paramCache,
                       final File _path)
        throws IOException, MatrixException, ParseException
    {
        try  {
            this.parse(_paramCache);

            // append the stored sub path of the ci object from last import
            final File file;
            final String subPath = this.getPropValue(_paramCache, PropertyDef_mxJPO.SUBPATH);
            if ((subPath != null) && !subPath.isEmpty())  {
                file = new File(new File(_path, subPath), this.getFileName());
            } else  {
                file = new File(_path, this.getFileName());
            }

            // create parent directories
            if (!file.getParentFile().exists())  {
                file.getParentFile().mkdirs();
            }

            final Writer out = new FileWriter(file);
            this.write(_paramCache, out);
            out.flush();
            out.close();
        } catch (final MatrixException e)  {
            if (_paramCache.getValueBoolean(ValueKeys.ParamContinueOnError))  {
                _paramCache.logError(e.toString());
            } else {
                throw e;
            }
        } catch (final ParseException e)  {
            if (_paramCache.getValueBoolean(ValueKeys.ParamContinueOnError))  {
                _paramCache.logError(e.toString());
            } else {
                throw e;
            }
        }
    }

    /**
     *
     * @param _paramCache   parameter cache
     * @param _out          appendable instance where the TCL update code is
     *                      written
     * @throws MatrixException  if some MQL statement failed
     * @throws ParseException   if the XML export of the object could not
     *                          parsed (for admin objects)
     * @throws IOException      if the update code could not be written
     */
    public void export(final ParameterCache_mxJPO _paramCache,
                       final Appendable _out)
        throws IOException, MatrixException, ParseException
    {
        this.parse(_paramCache);
        this.write(_paramCache, _out);
    }

    /**
     *
     * @param _paramCache       parameter cache
     * @param _out              appendable instance to write the TCL update
     *                          code
     * @throws IOException      if write of the TCL update failed
     * @throws MatrixException  if MQL commands failed
     */
    protected abstract void write(final ParameterCache_mxJPO _paramCache,
                                  final Appendable _out)
            throws IOException, MatrixException;

    /**
     * Parses all information for given administration object.
     *
     * @param _paramCache       parameter cache
     * @throws MatrixException  if XML export could not be created or if
     *                          another MX action failed
     * @throws ParseException   if the admin XML export can not be parsed
     */
    protected abstract void parse(final ParameterCache_mxJPO _paramCache)
        throws MatrixException, ParseException;

    /**
     * Deletes administration object with given name.
     *
     * @param _paramCache       parameter cache
     * @throws Exception if delete failed
     */
    public abstract void delete(final ParameterCache_mxJPO _paramCache)
        throws Exception;

    /**
     * Creates a new administration object with given name.
     *
     * @param _paramCache   parameter cache
     * @throws Exception if create failed
     */
    public abstract void create(final ParameterCache_mxJPO _paramCache)
        throws Exception;

    /**
     * Updated this administration (business) object.
     *
     * @param _paramCache   parameter cache
     * @param _create       <i>true</i> if the CI object is new created (and
     *                      first update is done)
     * @param _file         reference to the file to update
     * @throws Exception if update failed
     */
    public abstract void update(final ParameterCache_mxJPO _paramCache,
                                final boolean _create,
                                final File _file)
        throws Exception;

    /**
     * Compiles this administration object. Because typically ad administration
     * object must not be compile, nothing is done here.
     *
     * @param _paramCache       parameter cache
     * @return <i>true</i> if administration object is compiled; otherwise
     *         <i>false</i> (and here used always)
     * @throws Exception if the compile failed
     */
    public boolean compile(final ParameterCache_mxJPO _paramCache)
        throws Exception
    {
        return false;
    }

    /**
     * <p>Returns the stored value within Matrix for administration object
     * with given property name. For performance reason the method should use
     * &quot;print&quot; commands, because a complete XML parse including a
     * complete export takes longer time.</p>
     *
     * @param _paramCache   parameter cache
     * @param _prop         property for which the value is searched
     * @return value for given property
     * @throws MatrixException if the property value could not be extracted
     */
    public abstract String getPropValue(final ParameterCache_mxJPO _paramCache,
                                        final PropertyDef_mxJPO _prop)
        throws MatrixException;

    /**
     * Getter method for instance variable {@link #mxName}.
     *
     * @return value of instance variable {@link #mxName}.
     * @see #mxName
     */
    public String getName()
    {
        return this.mxName;
    }

    /**
     * Getter method for instance variable {@link #description}.
     *
     * @return value of instance variable {@link #description}.
     */
    protected String getDescription()
    {
        return this.description;
    }

    /**
     * Setter method for instance variable {@link #description}.
     *
     * @param _description new value for instance variable {@link #description}.
     */
    protected void setDescription(final String _description)
    {
        this.description = _description;
    }

    /**
     * Returns the file name for this MxUpdate administration object. The file
     * name is a concatenation of the defined file prefix within the
     * information annotation , the name of the MX object and the file suffix
     * within the information annotation. All special characters are converted
     * automatically from {@link StringUtil_mxJPO#convertToFileName(String)}.
     *
     * @return file name of this administration (business) object
     * @see #export(ParameterCache_mxJPO, File)
     */
    public String getFileName()
    {
        final StringBuilder ret = new StringBuilder();
        if (this.getTypeDef().getFilePrefix() != null)  {
            ret.append(this.getTypeDef().getFilePrefix());
        }
        ret.append(this.getName());
        if (this.getTypeDef().getFileSuffix() != null)  {
            ret.append(this.getTypeDef().getFileSuffix());
        }
        return StringUtil_mxJPO.convertToFileName(ret.toString());
    }
}
