// This is a generated file. Not intended for manual editing.
package com.pdehaan.flatbuffers.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.pdehaan.flatbuffers.psi.FlatbuffersTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FlatbuffersParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ATTRIBUTE_DECL) {
      r = attribute_decl(b, 0);
    }
    else if (t == BUILTIN_TYPE) {
      r = builtin_type(b, 0);
    }
    else if (t == CUSTOM_TYPE) {
      r = custom_type(b, 0);
    }
    else if (t == ENUM_DECL) {
      r = enum_decl(b, 0);
    }
    else if (t == ENUMVAL_DECL) {
      r = enumval_decl(b, 0);
    }
    else if (t == FIELD_DECL) {
      r = field_decl(b, 0);
    }
    else if (t == FIELD_NAME) {
      r = field_name(b, 0);
    }
    else if (t == FILE_EXTENSION_DECL) {
      r = file_extension_decl(b, 0);
    }
    else if (t == FILE_IDENTIFIER_DECL) {
      r = file_identifier_decl(b, 0);
    }
    else if (t == INCLUDE_DECL) {
      r = include_decl(b, 0);
    }
    else if (t == METADATA) {
      r = metadata(b, 0);
    }
    else if (t == METADATA_PART) {
      r = metadata_part(b, 0);
    }
    else if (t == NAMESPACE_DECL) {
      r = namespace_decl(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == OBJECT_PART) {
      r = object_part(b, 0);
    }
    else if (t == ROOT_DECL) {
      r = root_decl(b, 0);
    }
    else if (t == SCALAR) {
      r = scalar(b, 0);
    }
    else if (t == SINGLE_VALUE) {
      r = single_value(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_DECL) {
      r = type_decl(b, 0);
    }
    else if (t == TYPE_DECL_NAME) {
      r = type_decl_name(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return schema(b, l + 1);
  }

  /* ********************************************************** */
  // ATTRIBUTE STRING_LITERAL SEMICOLON
  public static boolean attribute_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_decl")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ATTRIBUTE, STRING_LITERAL, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // BOOL | BYTE | UBYTE | SHORT | USHORT | INT | UINT | FLOAT | LONG | ULONG | DOUBLE | STRING
  public static boolean builtin_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtin_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILTIN_TYPE, "<builtin type>");
    r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, BYTE);
    if (!r) r = consumeToken(b, UBYTE);
    if (!r) r = consumeToken(b, SHORT);
    if (!r) r = consumeToken(b, USHORT);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, UINT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, LONG);
    if (!r) r = consumeToken(b, ULONG);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean custom_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "custom_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, CUSTOM_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // ( ENUM | UNION ) type_decl_name [ COLON type ] metadata OPEN_BLOCK [ enumval_decl ( COMMA enumval_decl ) * ] CLOSE_BLOCK
  public static boolean enum_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl")) return false;
    if (!nextTokenIs(b, "<enum decl>", ENUM, UNION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECL, "<enum decl>");
    r = enum_decl_0(b, l + 1);
    r = r && type_decl_name(b, l + 1);
    r = r && enum_decl_2(b, l + 1);
    r = r && metadata(b, l + 1);
    r = r && consumeToken(b, OPEN_BLOCK);
    r = r && enum_decl_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_BLOCK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ENUM | UNION
  private static boolean enum_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, UNION);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ COLON type ]
  private static boolean enum_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2")) return false;
    enum_decl_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean enum_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ enumval_decl ( COMMA enumval_decl ) * ]
  private static boolean enum_decl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_5")) return false;
    enum_decl_5_0(b, l + 1);
    return true;
  }

  // enumval_decl ( COMMA enumval_decl ) *
  private static boolean enum_decl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumval_decl(b, l + 1);
    r = r && enum_decl_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA enumval_decl ) *
  private static boolean enum_decl_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_5_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enum_decl_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_decl_5_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA enumval_decl
  private static boolean enum_decl_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_decl_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumval_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [ EQUAL INTEGER_LITERAL ]
  public static boolean enumval_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumval_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && enumval_decl_1(b, l + 1);
    exit_section_(b, m, ENUMVAL_DECL, r);
    return r;
  }

  // [ EQUAL INTEGER_LITERAL ]
  private static boolean enumval_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumval_decl_1")) return false;
    parseTokens(b, 0, EQUAL, INTEGER_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // field_name COLON type [ EQUAL INTEGER_LITERAL ] SEMICOLON
  public static boolean field_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    r = r && field_decl_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FIELD_DECL, r);
    return r;
  }

  // [ EQUAL INTEGER_LITERAL ]
  private static boolean field_decl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_decl_3")) return false;
    parseTokens(b, 0, EQUAL, INTEGER_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean field_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FIELD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // FILE_EXTENSION STRING_LITERAL SEMICOLON
  public static boolean file_extension_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_extension_decl")) return false;
    if (!nextTokenIs(b, FILE_EXTENSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE_EXTENSION, STRING_LITERAL, SEMICOLON);
    exit_section_(b, m, FILE_EXTENSION_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // FILE_IDENTIFIER STRING_LITERAL SEMICOLON
  public static boolean file_identifier_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_identifier_decl")) return false;
    if (!nextTokenIs(b, FILE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE_IDENTIFIER, STRING_LITERAL, SEMICOLON);
    exit_section_(b, m, FILE_IDENTIFIER_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE STRING_LITERAL SEMICOLON
  public static boolean include_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_decl")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INCLUDE, STRING_LITERAL, SEMICOLON);
    exit_section_(b, m, INCLUDE_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  static boolean item_(PsiBuilder b, int l) {
    return consumeToken(b, COMMENT);
  }

  /* ********************************************************** */
  // [ OPEN_PARENTHESIS [ metadata_part ( COMMA metadata_part ) * ] CLOSE_PARENTHESIS ]
  public static boolean metadata(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata")) return false;
    Marker m = enter_section_(b, l, _NONE_, METADATA, "<metadata>");
    metadata_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // OPEN_PARENTHESIS [ metadata_part ( COMMA metadata_part ) * ] CLOSE_PARENTHESIS
  private static boolean metadata_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENTHESIS);
    r = r && metadata_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ metadata_part ( COMMA metadata_part ) * ]
  private static boolean metadata_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_0_1")) return false;
    metadata_0_1_0(b, l + 1);
    return true;
  }

  // metadata_part ( COMMA metadata_part ) *
  private static boolean metadata_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = metadata_part(b, l + 1);
    r = r && metadata_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA metadata_part ) *
  private static boolean metadata_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_0_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!metadata_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "metadata_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA metadata_part
  private static boolean metadata_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && metadata_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER [ COLON single_value ]
  public static boolean metadata_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_part")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && metadata_part_1(b, l + 1);
    exit_section_(b, m, METADATA_PART, r);
    return r;
  }

  // [ COLON single_value ]
  private static boolean metadata_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_part_1")) return false;
    metadata_part_1_0(b, l + 1);
    return true;
  }

  // COLON single_value
  private static boolean metadata_part_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_part_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && single_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAMESPACE IDENTIFIER ( DOT IDENTIFIER ) * SEMICOLON
  public static boolean namespace_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_decl")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAMESPACE, IDENTIFIER);
    r = r && namespace_decl_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, NAMESPACE_DECL, r);
    return r;
  }

  // ( DOT IDENTIFIER ) *
  private static boolean namespace_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_decl_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!namespace_decl_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_decl_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean namespace_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ object_part ( COMMA object_part ) * ]
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    object_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // object_part ( COMMA object_part ) *
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_part(b, l + 1);
    r = r && object_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA object_part ) *
  private static boolean object_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!object_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA object_part
  private static boolean object_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && object_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON value
  public static boolean object_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_part")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, m, OBJECT_PART, r);
    return r;
  }

  /* ********************************************************** */
  // ROOT_TYPE IDENTIFIER SEMICOLON
  public static boolean root_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_decl")) return false;
    if (!nextTokenIs(b, ROOT_TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ROOT_TYPE, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, ROOT_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL | FLOAT_LITERAL | TRUE | FALSE
  public static boolean scalar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR, "<scalar>");
    r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // include_decl *
  //     ( namespace_decl
  //     | type_decl
  //     | enum_decl
  //     | root_decl
  //     | file_extension_decl
  //     | file_identifier_decl
  //     | attribute_decl
  //     ) *
  static boolean schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = schema_0(b, l + 1);
    r = r && schema_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // include_decl *
  private static boolean schema_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!include_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "schema_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ( namespace_decl
  //     | type_decl
  //     | enum_decl
  //     | root_decl
  //     | file_extension_decl
  //     | file_identifier_decl
  //     | attribute_decl
  //     ) *
  private static boolean schema_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!schema_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "schema_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // namespace_decl
  //     | type_decl
  //     | enum_decl
  //     | root_decl
  //     | file_extension_decl
  //     | file_identifier_decl
  //     | attribute_decl
  private static boolean schema_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_decl(b, l + 1);
    if (!r) r = type_decl(b, l + 1);
    if (!r) r = enum_decl(b, l + 1);
    if (!r) r = root_decl(b, l + 1);
    if (!r) r = file_extension_decl(b, l + 1);
    if (!r) r = file_identifier_decl(b, l + 1);
    if (!r) r = attribute_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // scalar | STRING_LITERAL
  public static boolean single_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_VALUE, "<single value>");
    r = scalar(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // builtin_type | OPEN_BRACE type CLOSE_BRACE | custom_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = builtin_type(b, l + 1);
    if (!r) r = type_1(b, l + 1);
    if (!r) r = custom_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_BRACE type CLOSE_BRACE
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( TABLE | STRUCT ) type_decl_name metadata OPEN_BLOCK field_decl * CLOSE_BLOCK
  public static boolean type_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_decl")) return false;
    if (!nextTokenIs(b, "<type decl>", STRUCT, TABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECL, "<type decl>");
    r = type_decl_0(b, l + 1);
    r = r && type_decl_name(b, l + 1);
    r = r && metadata(b, l + 1);
    r = r && consumeToken(b, OPEN_BLOCK);
    r = r && type_decl_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_BLOCK);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TABLE | STRUCT
  private static boolean type_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TABLE);
    if (!r) r = consumeToken(b, STRUCT);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_decl *
  private static boolean type_decl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_decl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!field_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_decl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean type_decl_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_decl_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE_DECL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // single_value | object | OPEN_BRACE [ value ( COMMA value ) * ] CLOSE_BRACE
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = single_value(b, l + 1);
    if (!r) r = object(b, l + 1);
    if (!r) r = value_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_BRACE [ value ( COMMA value ) * ] CLOSE_BRACE
  private static boolean value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && value_2_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ value ( COMMA value ) * ]
  private static boolean value_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_1")) return false;
    value_2_1_0(b, l + 1);
    return true;
  }

  // value ( COMMA value ) *
  private static boolean value_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && value_2_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA value ) *
  private static boolean value_2_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!value_2_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "value_2_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA value
  private static boolean value_2_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_2_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
