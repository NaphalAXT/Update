/* Generated By:JavaCC: Do not edit this line. PackageParserConstants.java */
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

package org.mxupdate.update.system;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface PackageParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int UUID = 5;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 6;
  /** RegularExpression Id. */
  int DESCRIPTION = 7;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 8;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 9;
  /** RegularExpression Id. */
  int CUSTOM_TRUE = 10;
  /** RegularExpression Id. */
  int CUSTOM_FALSE = 11;
  /** RegularExpression Id. */
  int USESPACKAGE = 12;
  /** RegularExpression Id. */
  int STRING = 13;
  /** RegularExpression Id. */
  int SINGLE = 14;
  /** RegularExpression Id. */
  int MULTILINESTRING = 15;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 16;
  /** RegularExpression Id. */
  int PROPERTY = 17;
  /** RegularExpression Id. */
  int PROPERTYTO = 18;
  /** RegularExpression Id. */
  int PROPERTYVAL = 19;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 20;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 21;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 1;
  /** Lexical state. */
  int STRING_EXPECTED = 2;
  /** Lexical state. */
  int DEFAULT = 3;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"uuid\"",
    "\"symbolicname\"",
    "\"description\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"custom\"",
    "\"!custom\"",
    "\"usespackage\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
  };

}
