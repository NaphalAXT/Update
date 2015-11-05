/* IndexParser.java */
/* Generated By:JavaCC: Do not edit this line. IndexParser.java */
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

import java.lang.reflect.InvocationTargetException;

import org.mxupdate.update.system.AbstractIndexCI_mxJPO.Field;
import org.mxupdate.update.util.AbstractParser_mxJPO;
import org.mxupdate.update.util.AbstractParser_mxJPO.SimpleCharStream;
import org.mxupdate.update.util.AbstractParser_mxJPO.Token;
import org.mxupdate.update.util.AbstractParser_mxJPO.TokenMgrError;
import org.mxupdate.update.util.AdminPropertyList_mxJPO.AdminProperty;

/**
 * Parses the update format for {@link IndexCI_mxJPO}.
 */
@SuppressWarnings("unused")
class IndexParser_mxJPO
    extends AbstractParser_mxJPO implements IndexParserConstants_mxJPO {

/**************************************************************************** */

/**
 * Parses one complete package definition.
 *
 * @param _uniqueKey      target package to update with parsed values
 */
  final public void parse(final IndexCI_mxJPO _index) throws ParseException, SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {Token tmp;
    String str;
    Integer number;
    Field field;
    AdminProperty property;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PACKAGE:
      case UUID:
      case SYMBOLICNAME:
      case DESCRIPTION:
      case HIDDEN_TRUE:
      case HIDDEN_FALSE:
      case ENABLE_TRUE:
      case ENABLE_FALSE:
      case UNIQUE_TRUE:
      case UNIQUE_FALSE:
      case FIELD:
      case PROPERTY:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PACKAGE:{
        jj_consume_token(PACKAGE);
        str = string();
this.setValue(_index, "packageRef", str);
        break;
        }
      case UUID:{
        jj_consume_token(UUID);
        property = uuidProperty();
this.appendValue(_index, "properties", "propertiesStack", property);
        break;
        }
      case SYMBOLICNAME:{
        jj_consume_token(SYMBOLICNAME);
        str = string();
this.appendValue(_index, "symbolicNames", str);
        break;
        }
      case DESCRIPTION:{
        jj_consume_token(DESCRIPTION);
        str = multiLineString();
this.setValue(_index, "description", str);
        break;
        }
      case HIDDEN_TRUE:{
        jj_consume_token(HIDDEN_TRUE);
this.setValue(_index, "hidden", true);
        break;
        }
      case HIDDEN_FALSE:{
        jj_consume_token(HIDDEN_FALSE);
this.setValue(_index, "hidden", false);
        break;
        }
      case ENABLE_TRUE:{
        jj_consume_token(ENABLE_TRUE);
this.setValue(_index, "enable", true);
        break;
        }
      case ENABLE_FALSE:{
        jj_consume_token(ENABLE_FALSE);
this.setValue(_index, "enable", false);
        break;
        }
      case UNIQUE_TRUE:{
        jj_consume_token(UNIQUE_TRUE);
this.setValue(_index, "unique", true);
        break;
        }
      case UNIQUE_FALSE:{
        jj_consume_token(UNIQUE_FALSE);
this.setValue(_index, "unique", false);
        break;
        }
      case FIELD:{
        jj_consume_token(FIELD);
        str = string();
field = new Field();this.appendValue(_index, "fields", field);this.setValue(field, "expression", str);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SIZE:{
          jj_consume_token(SIZE);
          number = naturalNumber();
this.setValue(field, "size", number);
          break;
          }
        default:
          jj_la1[1] = jj_gen;
          ;
        }
        break;
        }
      case PROPERTY:{
        jj_consume_token(PROPERTY);
        property = property();
this.appendValue(_index, "properties", "propertiesStack", property);
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/**
 * Parses the UUID property definition.
 */
  final public AdminProperty uuidProperty() throws ParseException {String str;
    AdminProperty property = new AdminProperty();
    str = string();
this.setValue(property, "value", str);
this.setValue(property, "name",  "UUID");
{if ("" != null) return property;}
    throw new Error("Missing return statement in function");
  }

/**
 * Parses the properties definition.
 */
  final public AdminProperty property() throws ParseException {String str;
    Token tmp;
    AdminProperty property = new AdminProperty();
    str = string();
this.setValue(property, "name", str);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PROPERTYTO:
      case PROPERTYVAL:{
        ;
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PROPERTYVAL:{
        jj_consume_token(PROPERTYVAL);
        str = string();
this.setValue(property, "value", str);
        break;
        }
      case PROPERTYTO:{
        jj_consume_token(PROPERTYTO);
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case ADMINTYPE_STRING:{
          tmp = jj_consume_token(ADMINTYPE_STRING);
this.setValue(property, "refAdminType", this.getString(tmp.image));
          break;
          }
        case ADMINTYPE_SINGLE:{
          tmp = jj_consume_token(ADMINTYPE_SINGLE);
this.setValue(property, "refAdminType", this.getSingle(tmp.image));
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        str = string();
this.setValue(property, "refAdminName", str);
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
{if ("" != null) return property;}
    throw new Error("Missing return statement in function");
  }

/**
 * Evaluates integer value.
 *
 * @return integer
 */
  final public Integer naturalNumber() throws ParseException {Token tmp;
    tmp = jj_consume_token(NATURALNUMBER);
{if ("" != null) return Integer.valueOf(tmp.image);}
    throw new Error("Missing return statement in function");
  }

/**
 * Evaluates multi-line string.
 *
 * @return string
 */
  final public String multiLineString() throws ParseException {Token tmp;
    String ret = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MULTILINESTRING:{
      tmp = jj_consume_token(MULTILINESTRING);
ret = this.getString(tmp.image);
      break;
      }
    case MULTILINESINGLE:{
      tmp = jj_consume_token(MULTILINESINGLE);
ret = this.getSingle(tmp.image);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return ret;}
    throw new Error("Missing return statement in function");
  }

/**
 * Evaluates single-line string.
 *
 * @return string
 */
  final public String string() throws ParseException {Token tmp;
    String ret = null;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case STRING:{
      tmp = jj_consume_token(STRING);
ret = this.getString(tmp.image);
      break;
      }
    case SINGLE:{
      tmp = jj_consume_token(SINGLE);
ret = this.getSingle(tmp.image);
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return ret;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public IndexParserTokenManager_mxJPO token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x507fe0,0x200000,0x507fe0,0x1800000,0x6000000,0x1800000,0xc0000,0x30000,};
   }

  /** Constructor with InputStream. */
  public IndexParser_mxJPO(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public IndexParser_mxJPO(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new IndexParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public IndexParser_mxJPO(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new IndexParserTokenManager_mxJPO(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new IndexParserTokenManager_mxJPO(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public IndexParser_mxJPO(IndexParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(IndexParserTokenManager_mxJPO tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[27];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 8; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 27; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
