/* Generated By:JavaCC: Do not edit this line. PathTypeParserConstants.java */
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

package org.mxupdate.update.datamodel;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface PathTypeParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int PACKAGE = 5;
  /** RegularExpression Id. */
  int UUID = 6;
  /** RegularExpression Id. */
  int SYMBOLICNAME = 7;
  /** RegularExpression Id. */
  int DESCRIPTION = 8;
  /** RegularExpression Id. */
  int DERIVED = 9;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 10;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 11;
  /** RegularExpression Id. */
  int LOCAL = 12;
  /** RegularExpression Id. */
  int ATTRIBUTE = 13;
  /** RegularExpression Id. */
  int STRING = 14;
  /** RegularExpression Id. */
  int SINGLE = 15;
  /** RegularExpression Id. */
  int MULTILINESTRING = 16;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 17;
  /** RegularExpression Id. */
  int FROM = 18;
  /** RegularExpression Id. */
  int TO = 19;
  /** RegularExpression Id. */
  int CARDINALITY_ONE = 20;
  /** RegularExpression Id. */
  int CARDINALITY_MANY = 21;
  /** RegularExpression Id. */
  int TYPE_ALL = 22;
  /** RegularExpression Id. */
  int TYPE = 23;
  /** RegularExpression Id. */
  int RELATIONSHIP_ALL = 24;
  /** RegularExpression Id. */
  int RELATIONSHIP = 25;
  /** RegularExpression Id. */
  int DEFAULTVALUE = 26;
  /** RegularExpression Id. */
  int MULTIVALUE_TRUE = 27;
  /** RegularExpression Id. */
  int MULTIVALUE_FALSE = 28;
  /** RegularExpression Id. */
  int RESETONCLONE_TRUE = 29;
  /** RegularExpression Id. */
  int RESETONCLONE_FALSE = 30;
  /** RegularExpression Id. */
  int RESETONREVISION_TRUE = 31;
  /** RegularExpression Id. */
  int RESETONREVISION_FALSE = 32;
  /** RegularExpression Id. */
  int RANGEVALUE_TRUE = 33;
  /** RegularExpression Id. */
  int RANGEVALUE_FALSE = 34;
  /** RegularExpression Id. */
  int MULTILINE_TRUE = 35;
  /** RegularExpression Id. */
  int MULTILINE_FALSE = 36;
  /** RegularExpression Id. */
  int RULE = 37;
  /** RegularExpression Id. */
  int DIMENSION = 38;
  /** RegularExpression Id. */
  int KIND = 39;
  /** RegularExpression Id. */
  int KIND_BINARY = 40;
  /** RegularExpression Id. */
  int KIND_BOOLEAN = 41;
  /** RegularExpression Id. */
  int KIND_DATE = 42;
  /** RegularExpression Id. */
  int KIND_INTEGER = 43;
  /** RegularExpression Id. */
  int KIND_REAL = 44;
  /** RegularExpression Id. */
  int KIND_STRING = 45;
  /** RegularExpression Id. */
  int MAXLENGTH = 46;
  /** RegularExpression Id. */
  int MAXLENGTH_NUMBER = 47;
  /** RegularExpression Id. */
  int RANGE_EQUAL = 48;
  /** RegularExpression Id. */
  int RANGE_GREATERTHAN = 49;
  /** RegularExpression Id. */
  int RANGE_GREATERTHANEQUAL = 50;
  /** RegularExpression Id. */
  int RANGE_LESSTHAN = 51;
  /** RegularExpression Id. */
  int RANGE_LESSTHANEQUAL = 52;
  /** RegularExpression Id. */
  int RANGE_NOTEQUAL = 53;
  /** RegularExpression Id. */
  int RANGE_MATCH = 54;
  /** RegularExpression Id. */
  int RANGE_NOTMATCH = 55;
  /** RegularExpression Id. */
  int RANGE_SMATCH = 56;
  /** RegularExpression Id. */
  int RANGE_NOTSMATCH = 57;
  /** RegularExpression Id. */
  int RANGE_PROGRAM = 58;
  /** RegularExpression Id. */
  int RANGE_BETWEEN = 59;
  /** RegularExpression Id. */
  int BETW1_STRING = 60;
  /** RegularExpression Id. */
  int BETW1_SINGLE = 61;
  /** RegularExpression Id. */
  int BETW1_APOSTROPHE = 62;
  /** RegularExpression Id. */
  int BETW1_CHAR = 63;
  /** RegularExpression Id. */
  int BETW2_INCLUSIVE = 64;
  /** RegularExpression Id. */
  int BETW2_EXCLUSIVE = 65;
  /** RegularExpression Id. */
  int BETW3_STRING = 66;
  /** RegularExpression Id. */
  int BETW3_SINGLE = 67;
  /** RegularExpression Id. */
  int BETW3_APOSTROPHE = 68;
  /** RegularExpression Id. */
  int BETW3_CHAR = 69;
  /** RegularExpression Id. */
  int BETW4_INCLUSIVE = 70;
  /** RegularExpression Id. */
  int BETW4_EXCLUSIVE = 71;
  /** RegularExpression Id. */
  int TRIGGER = 72;
  /** RegularExpression Id. */
  int INPUT = 73;
  /** RegularExpression Id. */
  int TRIGEVENT = 74;
  /** RegularExpression Id. */
  int ACTION = 75;
  /** RegularExpression Id. */
  int CHECK = 76;
  /** RegularExpression Id. */
  int OVERRIDE = 77;
  /** RegularExpression Id. */
  int PROPERTY = 78;
  /** RegularExpression Id. */
  int PROPERTYTO = 79;
  /** RegularExpression Id. */
  int PROPERTYVAL = 80;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 81;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 82;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int TRIGKIND_EXPECTED = 1;
  /** Lexical state. */
  int TRIGEVENT_EXPECTED = 2;
  /** Lexical state. */
  int BETW4_EXPECTED = 3;
  /** Lexical state. */
  int BETW3_EXPECTED = 4;
  /** Lexical state. */
  int BETW2_EXPECTED = 5;
  /** Lexical state. */
  int BETW1_EXPECTED = 6;
  /** Lexical state. */
  int MAXLENGTH_EXPECTED = 7;
  /** Lexical state. */
  int KIND_EXPECTED = 8;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 9;
  /** Lexical state. */
  int STRING_EXPECTED = 10;
  /** Lexical state. */
  int DEFAULT = 11;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"package\"",
    "\"uuid\"",
    "\"symbolicname\"",
    "\"description\"",
    "\"derived\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"local\"",
    "\"attribute\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "<FROM>",
    "<TO>",
    "<CARDINALITY_ONE>",
    "<CARDINALITY_MANY>",
    "<TYPE_ALL>",
    "\"type\"",
    "<RELATIONSHIP_ALL>",
    "\"relationship\"",
    "\"default\"",
    "\"multivalue\"",
    "\"!multivalue\"",
    "\"resetonclone\"",
    "\"!resetonclone\"",
    "\"resetonrevision\"",
    "\"!resetonrevision\"",
    "\"rangevalue\"",
    "\"!rangevalue\"",
    "\"multiline\"",
    "\"!multiline\"",
    "\"rule\"",
    "\"dimension\"",
    "\"kind\"",
    "\"binary\"",
    "\"boolean\"",
    "\"date\"",
    "\"integer\"",
    "\"real\"",
    "\"string\"",
    "\"maxlength\"",
    "<MAXLENGTH_NUMBER>",
    "<RANGE_EQUAL>",
    "<RANGE_GREATERTHAN>",
    "<RANGE_GREATERTHANEQUAL>",
    "<RANGE_LESSTHAN>",
    "<RANGE_LESSTHANEQUAL>",
    "<RANGE_NOTEQUAL>",
    "<RANGE_MATCH>",
    "<RANGE_NOTMATCH>",
    "<RANGE_SMATCH>",
    "<RANGE_NOTSMATCH>",
    "<RANGE_PROGRAM>",
    "<RANGE_BETWEEN>",
    "<BETW1_STRING>",
    "<BETW1_SINGLE>",
    "\"\\\"\"",
    "<BETW1_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "<BETW3_STRING>",
    "<BETW3_SINGLE>",
    "\"\\\"\"",
    "<BETW3_CHAR>",
    "\"inclusive\"",
    "\"exclusive\"",
    "\"trigger\"",
    "\"input\"",
    "<TRIGEVENT>",
    "\"action\"",
    "\"check\"",
    "\"override\"",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
    "\"}\"",
    "\"{\"",
  };

}
